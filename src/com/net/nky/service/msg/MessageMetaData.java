package com.net.nky.service.msg;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;

/**
 * SMS verification code basic data.
 * @author Ken
 * @version 2016year8month18day
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
	 * Get send message object.
	 */
	static TaobaoClient getMessageClient() {
		return new DefaultTaobaoClient(URL, APPKEY, SECRET);
	}

	/**
	 * Get send text messagesrequestObject.
	 * @param tel Number to receive text messages.
	 */
	static AlibabaAliqinFcSmsNumSendRequest getRequest(String tel) {
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setExtend("");
		req.setSmsType("normal");
		req.setRecNum(tel);
		return req;
	}

	/**
	 * register.
	 * @author Ken
	 * @version 2016year8month18day
	 */
	interface register {
		static final String FREESIGNNAME = "Registration verification";
		static final String SMSTEMPLATECODE = "SMS_13180418";
	}

	/**
	 * Change password
	 * @author Ken
	 * @version 2016year8month18day
	 */
	interface resetPwd {
		static final String FREESIGNNAME = "Authentication";
		static final String SMSTEMPLATECODE = "SMS_13180416";
	}

}