package com.net.nky.service.msg;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 * SMS return.
 * @author Ken
 * @version 2016year8month18day
 */
public class MessageResultVo {

	private boolean success; //Whether to send success

	private String verifycode; //Send successful verification

	private String message;//Causes of failure，And send success to：SMS sent

	private MessageResultVo() {

	}

	/**
	 * SMS send success structure class
	 * @param success
	 * @param verifycode
	 */
	public MessageResultVo(boolean success, String verifycode) {
		this();
		setSuccess(success);
		this.verifycode = verifycode;
	}

	public String getVerifycode() {
		return verifycode;
	}

	public void setVerifycode(String verifycode) {
		this.verifycode = verifycode;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
		if (this.success) {
			this.message = MessageMetaData.OK;
		} else {
			this.message = MessageMetaData.ERROR;
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}