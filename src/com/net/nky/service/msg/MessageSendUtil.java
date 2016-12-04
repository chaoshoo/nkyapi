package com.net.nky.service.msg;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.net.nky.service.cache.MessageCacheSingleton;
import com.taobao.api.ApiException;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

/**
 * SMS verification code.
 * @author Ken
 * @version 2016year8month18day
 */
public class MessageSendUtil {

	static final Logger LOG = LoggerFactory.getLogger(MessageSendUtil.class);

	/**
	 * Send SMS verification code register.
	 * @param tel Number to receive text messages.
	 * @return  Object in:
	 * 		 success; //Whether to send success  
	 * 		 verifycode; //Send successful verification 
	 * 		message;//Causes of failure，And send success to：SMS sent
	 * <p><b>Sample</b>
	 *  <p>Short message：【Registration verification】Verification Code491395，You are a registered user wubba health，Thank you for your support.！ 
	 *  <p>Object return：[success=true,verifycode=491395,message=SMS sent]
	 *  <p>Sample:System.out.println(sendRegistMessage("13367241859") );
	 */
	public static MessageResultVo sendRegistMessage(String tel) {
		MessageResultVo vo = new MessageResultVo(false, getRandom6());//"SMS sent"
		try {
			//对1分钟内发出多条，和一条内超过指定条数处理
			if (!MessageCacheSingleton.getSingleton().getPhonegap(tel)) {
				vo.setSuccess(false);
				vo.setMessage(MessageMetaData.ERROR_FREQ);
	            LOG.warn("mobile send message gap 10 seconds: {}" ,tel );
	            return vo;
	        } else if (!MessageCacheSingleton.getSingleton().getPhonedayCache(tel)) {
				vo.setSuccess(false);
				vo.setMessage(MessageMetaData.ERROR_FREQ_DAY);
	            LOG.warn("mobile send message 10 times one day :{} " , tel);
	            return vo;
	        }
			
			AlibabaAliqinFcSmsNumSendRequest req = MessageMetaData.getRequest(tel);
			req.setSmsFreeSignName(MessageMetaData.register.FREESIGNNAME);
			req.setSmsParamString("{code:'" + vo.getVerifycode() + "',product:'" + MessageMetaData.SIGN + "'}");
			req.setSmsTemplateCode(MessageMetaData.register.SMSTEMPLATECODE);
			AlibabaAliqinFcSmsNumSendResponse rsp = MessageMetaData.getMessageClient().execute(req);

			LOG.error("{}SMS status:{}", tel, rsp.getBody());
			if (rsp.getResult().getSuccess()) {
				vo.setSuccess(true);
				return vo;
			} else {
				LOG.error(tel+"SMS failed:{}", rsp.getBody());
			}
		} catch (ApiException e) {
			LOG.error(tel+"Message sending exception,APICall exception:{}", e);
		} catch (Exception e) {
			LOG.error(tel+"Message sending exception:{}", e);
		}
		return vo;
	}

	/**
	 * Send SMS verification code Login password.
	 * @param tel Number to receive text messages.
	 * @return  Object in:
	 * 		 success; //Whether to send success  
	 * 		 verifycode; //Send successful verification 
	 * 		message;//Causes of failure，And send success to：SMS sent
	 * <p><b>Sample</b>
	 *<p> SMS sample：【Authentication】Verification Code189733，You are trying to modify the login password wubba health，Please keep your account information。
	 *<p> Object return sample：[success=true,verifycode=189733,message=SMS sent]
	 *<p> Sample:System.out.println(sendChangePwdMessage("13367241859") );
	 */
	public static MessageResultVo sendChangePwdMessage(String tel) {
		MessageResultVo vo = new MessageResultVo(false, getRandom6());
		try {
			//对1分钟内发出多条，和一条内超过指定条数处理
			if (!MessageCacheSingleton.getSingleton().getPhonegap(tel)) {
				vo.setSuccess(false);
				vo.setMessage(MessageMetaData.ERROR_FREQ);
	            LOG.warn("mobile send message gap 10 seconds: {}" ,tel );
	            return vo;
	        } else if (!MessageCacheSingleton.getSingleton().getPhonedayCache(tel)) {
				vo.setSuccess(false);
				vo.setMessage(MessageMetaData.ERROR_FREQ_DAY);
	            LOG.warn("mobile send message 10 times one day :{} " , tel);
	            return vo;
	        }
			
			AlibabaAliqinFcSmsNumSendRequest req = MessageMetaData.getRequest(tel);
			req.setSmsFreeSignName(MessageMetaData.resetPwd.FREESIGNNAME);
			req.setSmsParamString("{code:'" + vo.getVerifycode() + "',product:'" + MessageMetaData.SIGN + "'}");
			req.setSmsTemplateCode(MessageMetaData.resetPwd.SMSTEMPLATECODE);
			AlibabaAliqinFcSmsNumSendResponse rsp = MessageMetaData.getMessageClient().execute(req);

			LOG.error("{}SMS status:{}", tel, rsp.getBody());
			if (rsp.getResult().getSuccess()) {
				vo.setSuccess(true);
				return vo;
			} else {
				LOG.error(tel+"SMS failed:{}", rsp.getBody());
			}
		} catch (ApiException e) {
			LOG.error(tel+"Message sending exception,APICall exception:{}",e);
		} catch (Exception e) {
			LOG.error(tel+"Message sending exception:{}", e);
		}
		return vo;
	}
	
	/**
	 * Send SMS.
	 */
	public static MessageResultVo sendGh(String tel,String  hospital , String  depart,String  doctor,String  date,String  num) {
		MessageResultVo vo = new MessageResultVo(false, getRandom6());
		try {
			AlibabaAliqinFcSmsNumSendRequest req = MessageMetaData.getRequest(tel);
			req.setSmsFreeSignName("Health management service platform");
			String reqparam  = "{code:'" + vo.getVerifycode() + "',product:'" + MessageMetaData.SIGN + "'"+
					",hospital:'" + hospital + "'"+ 
					",depart:'" + depart + "'"+ 
					",doctor:'" + doctor + "'"+ 
					",date:'" + date + "'"+ 
					",num:'" + num + "'"+ 
					"}";
			req.setSmsParamString(reqparam);
			
			req.setSmsTemplateCode("SMS_15475693");
			AlibabaAliqinFcSmsNumSendResponse rsp = MessageMetaData.getMessageClient().execute(req);
			
			LOG.error("{}SMS status:{}", tel, rsp.getBody());
			if (rsp.getResult().getSuccess()) {
				vo.setSuccess(true);
				return vo;
			} else {
				LOG.error(tel+"SMS failed:{}", rsp.getBody());
			}
		} catch (ApiException e) {
			LOG.error(tel+"Message sending exception,APICall exception:{}",e);
		} catch (Exception e) {
			LOG.error(tel+"Message sending exception:{}", e);
		}
		return vo;
	}

	/**
	 * Obtain6Bit random verification code.
	 */
	public static String getRandom6() {
		Random random = new Random();
		String code6 = String.valueOf(100000 + random.nextInt(899999));
		return code6;
	}

	/**
	 * Cell phone number verification
	 * @param  str
	 * @return Verify by returntrue
	 */
	public static boolean isMobile(String str) {
		if (StringUtils.isEmpty(str) || str.length() != 11) {
			return false;
		}
		Pattern p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$"); // Verify phone number
		Matcher m = p.matcher(str);
		return m.matches();
	}

	public static void main(String[] args) {
		//短信：【注册验证】验证码491395，您正在注册成为沃博健康用户，感谢您的支持！ 
		//对象返回：[success=true,verifycode=491395,message=短信发送成功]
		//System.out.println(sendRegistMessage("13367241859") );
		System.out.println(sendGh("13367241859","同济" , "普通", "正","2016-09-22", "2") );

		//短信：【身份验证】验证码189733，您正在尝试修改沃博健康登录密码，请妥善保管账户信息。
		//对象返回：[success=true,verifycode=189733,message=短信发送成功]
		//System.out.println(sendChangePwdMessage("13367241859") );
	}

}