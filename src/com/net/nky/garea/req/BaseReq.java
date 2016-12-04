package com.net.nky.garea.req;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 * /Garea-GT1000-Business data upload specificationv0.2.pdf
 * Common parameters as all interfaces are required to provide the parameters，Unless there is a special description of the interface can not provide public parameters。
 * @author Ken
 * @version 2016year9month19day
 */
public class BaseReq {

	protected String appCode;

	protected String custCode;// Enterprise customer code 4 Bit character
	protected String pIdCard;//Resident identity card number When you create a doctor, you can be empty.
	protected String dIdCard;// Doctor ID card number

	protected String deviceId;
	protected String signData;
	protected String sign;

	public BaseReq() {
		super();
	}

	public BaseReq(String appCode, String custCode, String pIdCard, String dIdCard, String deviceId, String signData,
			String sign) {
		super();
		this.appCode = appCode;
		this.custCode = custCode;
		this.pIdCard = pIdCard;
		this.dIdCard = dIdCard;
		this.deviceId = deviceId;
		this.signData = signData;
		this.sign = sign;
	}

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getSignData() {
		return signData;
	}

	public void setSignData(String signData) {
		this.signData = signData;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getCustCode() {
		return custCode;
	}

	public void setCustCode(String custCode) {
		this.custCode = custCode;
	}

	public String getpIdCard() {
		return pIdCard;
	}

	public void setpIdCard(String pIdCard) {
		this.pIdCard = pIdCard;
	}

	public String getdIdCard() {
		return dIdCard;
	}

	public void setdIdCard(String dIdCard) {
		this.dIdCard = dIdCard;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}