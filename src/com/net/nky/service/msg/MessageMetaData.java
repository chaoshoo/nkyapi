package com.net.nky.service.msg;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;

/**
 * 短信验证码基本数据.
 * @author Ken
 * @version 2016年8月18日
 */
public class MessageMetaData {

	private static final String URL = "http://gw.api.taobao.com/router/rest";
	private static final String APPKEY = "23436123";
	private static final String SECRET = "5c406f52c9fc657c5a5151944b4eef0e";
	static final String SIGN = "ROBO health";
	static final String OK = "SMS sent";
	static final String ERROR = "SMS failed";
	static final String ERROR_FREQ = "SMS failed，Please try later.！";
	static final String ERROR_FREQ_DAY = "SMS failed，Number of text messages sent over the limit！";

	/**
	 * 获取发送短信对象.
	 */
	static TaobaoClient getMessageClient() {
		return new DefaultTaobaoClient(URL, APPKEY, SECRET);
	}

	/**
	 * 获取发送短信request的对象.
	 * @param tel 接受短信的号码.
	 */
	static AlibabaAliqinFcSmsNumSendRequest getRequest(String tel) {
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setExtend("");
		req.setSmsType("normal");
		req.setRecNum(tel);
		return req;
	}

	/**
	 * 注册.
	 * @author Ken
	 * @version 2016年8月18日
	 */
	interface register {
		static final String FREESIGNNAME = "Registration verification";
		static final String SMSTEMPLATECODE = "SMS_13180418";
	}

	/**
	 * 修改密码
	 * @author Ken
	 * @version 2016年8月18日
	 */
	interface resetPwd {
		static final String FREESIGNNAME = "Authentication";
		static final String SMSTEMPLATECODE = "SMS_13180416";
	}

}