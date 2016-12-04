package com.net.nky.service.push;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baidu.yun.core.log.YunLogEvent;
import com.baidu.yun.core.log.YunLogHandler;
import com.baidu.yun.push.auth.PushKeyPair;
import com.baidu.yun.push.client.BaiduPushClient;
import com.baidu.yun.push.constants.BaiduPushConstants;
import com.baidu.yun.push.model.AddDevicesToTagRequest;
import com.baidu.yun.push.model.AddDevicesToTagResponse;
import com.baidu.yun.push.model.CreateTagRequest;
import com.baidu.yun.push.model.CreateTagResponse;
import com.baidu.yun.push.model.DeleteDevicesFromTagRequest;
import com.baidu.yun.push.model.DeleteDevicesFromTagResponse;
import com.baidu.yun.push.model.DeleteTagRequest;
import com.baidu.yun.push.model.DeleteTagResponse;
import com.baidu.yun.push.model.DeviceInfo;
import com.baidu.yun.push.model.MsgSendInfo;
import com.baidu.yun.push.model.PushMsgToSingleDeviceRequest;
import com.baidu.yun.push.model.PushMsgToSingleDeviceResponse;
import com.baidu.yun.push.model.PushMsgToTagRequest;
import com.baidu.yun.push.model.PushMsgToTagResponse;
import com.baidu.yun.push.model.QueryDeviceNumInTagRequest;
import com.baidu.yun.push.model.QueryDeviceNumInTagResponse;
import com.baidu.yun.push.model.QueryMsgStatusRequest;
import com.baidu.yun.push.model.QueryMsgStatusResponse;
import com.baidu.yun.push.model.QueryTagsRequest;
import com.baidu.yun.push.model.QueryTagsResponse;
import com.baidu.yun.push.model.TagInfo;
import com.huilet.util.HttpUtil;
import com.net.ServiceConstants;
import com.net.util.HttpClient;
import com.net.util.HttpParamUtil;
import com.net.util.MD5Util;

import net.sf.json.JSONObject;

/**
 * Message push tool class.
 * Be used fortagGroupCURD,single、tagMessage push.
 * @author Ken
 * @version 2016year8month22day
 */
public class PushUtil {

	private static final Logger LOG = LoggerFactory.getLogger(PushUtil.class);

	/**
	 * Get push client.
	 */
	private static BaiduPushClient getPushClient() {
		PushKeyPair pair = new PushKeyPair(PushMetaData.API_KEY, PushMetaData.SECRET_KEY);
		// 2. build a BaidupushClient object to access released interfaces
		BaiduPushClient pushClient = new BaiduPushClient(pair, BaiduPushConstants.CHANNEL_REST_URL);

		// 3. register a YunLogHandler to get detail interacting information
		// in this request.
		pushClient.setChannelLogHandler(new YunLogHandler() {
			@Override
			public void onHandle(YunLogEvent event) {
				LOG.debug(event.getMessage());
			}
		});
		return pushClient;
	}

	/**
	 * Add tag，Tag is a group.
	 */
	public static boolean createTag(String tagName) {
		try {
			// 4. specify request arguments
			CreateTagRequest request = new CreateTagRequest().addTagName(tagName).addDeviceType(3);
			// 5. http request  // 0 -- tag successfully build, 1 -- fail to build tag
			CreateTagResponse response = getPushClient().createTag(request);
			LOG.debug(String.format("tagName: %s, result: %d", response.getTagName(), response.getResult()));
			if (response.getResult() == 0) {
				return true;
			}
		} catch (Exception e) {
			LOG.error("Add pushTagabnormal", e);
		}
		return false;
	}

	/**
	 * delete a tap，Tag is a group.
	 */
	public static boolean deleteTag(String tagName) {
		try {
			DeleteTagRequest request = new DeleteTagRequest().addTagName(tagName).addDeviceType(new Integer(3));
			// 5. http request
			DeleteTagResponse response = getPushClient().deleteTag(request);
			LOG.debug(String.format("tagName: %s, result: %d", response.getTagName(), response.getResult()));
			if (response.getResult() == 0) {
				return true;
			}
		} catch (Exception e) {
			LOG.error("Delete tag exception", e);
		}
		return false;
	}

	/**
	 * Query tag，Tag is a group.TagInfo:[ tagId tagName info type  createTime]
	 * @param maxNum Is the biggest data，Do not fill the default is100
	 * @return null Without. 
	 */
	public static List<TagInfo> queryTags(String tagName, Integer maxNum) {
		try {
			if (maxNum == null || maxNum < 1) {
				maxNum = 100;
			}
			// 4. specify request arguments
			QueryTagsRequest request = new QueryTagsRequest().addTagName(tagName).addStart(0).addLimit(10)
					.addDeviceType(maxNum);
			QueryTagsResponse response = getPushClient().queryTags(request);
			if (null == response) {
				LOG.debug(tagName + " No query to data: ");
				return null;
			}
			// Http请求结果解析打印
			LOG.debug("totalNum: " + response.getTotalNum());
			return response.getTagsInfo();
		} catch (Exception e) {
			LOG.error(" Query tag exception", e);
		}
		return null;
	}

	/**
	 * Number of devices under query tag.
	 * @return null If abnormal. 
	 */
	public static Integer queryDeviceNumInTag(String tagName) {
		try {
			// 4. specify request arguments
			QueryDeviceNumInTagRequest request = new QueryDeviceNumInTagRequest().addTagName(tagName).addDeviceType(3);
			// 5. http request
			QueryDeviceNumInTagResponse response = getPushClient().queryDeviceNumInTag(request);
			if (null != response) {
				LOG.debug(String.format("deviceNum: %d", response.getDeviceNum()));
			}
			return response.getDeviceNum();
		} catch (Exception e) {
			LOG.error("Number of devices under query tag", e);
		}
		return null;
	}

	/**
	 * Add device in label
	 * @return List<String> Returns no data that has been added successfully. 
	 */
	public static List<String> addDevicesToTag(String tagName, String channelIds[]) {
		List<String> errorChannelIds = new ArrayList<String>();
		if (channelIds == null || channelIds.length < 1) {
			return errorChannelIds;
		}
		errorChannelIds.addAll(Arrays.asList(channelIds));
		try {
			// 4. specify request arguments
			AddDevicesToTagRequest request = new AddDevicesToTagRequest().addTagName(tagName).addChannelIds(channelIds)
					.addDeviceType(3);
			// 5. http request
			AddDevicesToTagResponse response = getPushClient().addDevicesToTag(request);
			// Http请求结果解析打印
			if (null != response) {
				List<DeviceInfo> devicesInfo = response.getDevicesInfoAfterAdded();
				for (DeviceInfo device : devicesInfo) {
					if (device.getResult() == 0) {
						errorChannelIds.remove(device.getChannelId());
					}
				}
			}
		} catch (Exception e) {
			LOG.error("Device exception under query tag", e);
		}
		return errorChannelIds;
	}

	/**
	 * Tag removal device
	 * @return List<String> Return data not removed successfully. 
	 */
	public static List<String> deleteDevicesFromTag(String tagName, String channelIds[]) {
		List<String> errorChannelIds = new ArrayList<String>();
		if (channelIds == null || channelIds.length < 1) {
			return errorChannelIds;
		}
		errorChannelIds.addAll(Arrays.asList(channelIds));
		try {
			// 4. specify request arguments
			DeleteDevicesFromTagRequest request = new DeleteDevicesFromTagRequest().addTagName(tagName)
					.addChannelIds(channelIds).addDeviceType(3);
			// 5. http request
			DeleteDevicesFromTagResponse response = getPushClient().deleteDevicesFromTag(request);
			// Http请求结果解析打印
			if (null != response) {
				List<DeviceInfo> devicesInfo = response.getDevicesInfoAfterDel();
				for (DeviceInfo device : devicesInfo) {
					if (device.getResult() == 0) {
						errorChannelIds.remove(device.getChannelId());
					}
				}
			}
		} catch (Exception e) {
			LOG.error("Remove the tag from the exception of the device", e);
		}
		return errorChannelIds;
	}

	/**
	 * Push messages in the tag
	 * @return List<String> Return messageid. 
	 */
	public static String pushMsgToTag(String tagName, String message) {
		try {
			// 4. specify request arguments
			// pushTagTpye = 1 for common tag pushing
			PushMsgToTagRequest request = new PushMsgToTagRequest().addTagName(tagName).addMsgExpires(new Integer(3600))
					.addMessageType(0) // Add through message
					// .addSendTime(System.currentTimeMillis() / 1000 + 120) //设置定时任务
					.addMessage(message).addDeviceType(3);
			// 5. http request
			PushMsgToTagResponse response = getPushClient().pushMsgToTag(request);
			// Http请求结果解析打印
			LOG.debug("msgId: " + response.getMsgId() + ",sendTime: " + response.getSendTime() + ",timerId: "
					+ response.getTimerId());
			return response.getMsgId();
		} catch (Exception e) {
			LOG.error("Push message exception in label", e);
		}
		return null;
	}

	/**
	 * Tab push message result query.
	 * @return List<String> Returns a number of successful message push. 
	 */
	public static Integer queryMsgStatus(String messageId) {
		try {
			// 4. specify request arguments
			String[] msgIds = { messageId };
			QueryMsgStatusRequest request = new QueryMsgStatusRequest().addMsgIds(msgIds).addDeviceType(3);
			// 5. http request
			QueryMsgStatusResponse response = getPushClient().queryMsgStatus(request);
			// Http请求结果解析打印
			LOG.debug("totalNum: " + response.getTotalNum() + " " + "result:");
			if (null != response) {
				List<MsgSendInfo> list = response.getMsgSendInfos();
				for (MsgSendInfo msgSendInfo : list) {
					LOG.debug("{" + "msgId = " + msgSendInfo.getMsgId() + ",status = " + msgSendInfo.getMsgStatus()
							+ ",sendTime = " + msgSendInfo.getSendTime() + ",success = "
							+ msgSendInfo.getSuccessCount());
					return msgSendInfo.getSuccessCount();
				}
			}
		} catch (Exception e) {
			LOG.error("Exception of push message query in label", e);
		}
		return null;
	}

	/**
	 * Push message.
	 * @param channelId 
	 * @param Message title
	 * @param description Message details
	 * @return List<String> ReturnmessgeId. 
	 */
	public static String pushMsgToSingleDevice(String channelId, String title, String description,Integer msgType) {
		try {
			// 4. specify request arguments
			//创建 Android的通知
			JSONObject notification = new JSONObject();
			notification.put("title", title);
			notification.put("description", description);
			notification.put("notification_builder_id", 0);
			notification.put("notification_basic_style", 4);
			notification.put("open_type", 1);
			notification.put("url", "http://push.baidu.com");
			JSONObject jsonCustormCont = new JSONObject();
			jsonCustormCont.put("msgType", msgType); //Custom content，key-value
			notification.put("custom_content", jsonCustormCont);

			PushMsgToSingleDeviceRequest request = new PushMsgToSingleDeviceRequest().addChannelId(channelId)
					.addMsgExpires(new Integer(3600)). // messageEffective time
//					addMessageType(1).// 1：通知,0:透传消息. 默认为0 注：IOS只有通知.
					addMessage(notification.toString()).addDeviceType(3);// deviceType => 3:android, 4:ios
			// 5. http request
			PushMsgToSingleDeviceResponse response = getPushClient().pushMsgToSingleDevice(request);
			// Http请求结果解析打印
			LOG.debug("msgId: " + response.getMsgId() + ",sendTime: " + response.getSendTime());
			return response.getMsgId();
		} catch (Exception e) {
			LOG.error("Push messages to a single device exception", e);
		}
		return null;
	}

	/**
	 * Push message batch.
	 * @return List<String> Returns a number of successful message push. 
	 * @return nullIndicates a failure to return
	 */
	public static Map<String, String> pushMsgToManyDevice(List<String> channelIds, String title, String description,Integer msgType) {
		Map<String, String> cIdMsgId = new HashMap<String, String>();
		try {
			for (String channelId : channelIds) {
				String msgId = pushMsgToSingleDevice(channelId, title, description,msgType);
				if (StringUtils.isNotEmpty(msgId)) {
					cIdMsgId.put(channelId, msgId);
				}
			}
		} catch (Exception e) {
			LOG.error("Batch push message exception in label", e);
		}
		if(cIdMsgId == null || cIdMsgId.size()<1){
			return null;
		}
		return cIdMsgId;
	}
	
	public static String pushMsgToWeiXin(String openids,String msg){
		Map<String,String> map = new HashMap<String,String>();
		map.put("wxid", openids);
		map.put("message", msg);
		String token = ServiceConstants.WEIXIN_MD5KEY+openids+msg;		
		map.put("token", MD5Util.MD5(token, "utf-8"));
		String str = "false:Push exception";
		try {
			LOG.info("send wx map:::"+map);
			str = HttpClient.httpPost(ServiceConstants.WEIXIN_PUSH, map);
			LOG.info("get wx result:::"+str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}

}