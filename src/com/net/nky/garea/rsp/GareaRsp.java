package com.net.nky.garea.rsp;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 * Returns an interface object definition.
 * @author Ken
 * @version 2016year9month20day
 */
public class GareaRsp {

	private Boolean success;//true:Create successfalse:Create failed
	private String errorCode;//Error code when saving failed
	private String errorDesc;//Error information description

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}