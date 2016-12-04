package com.net.nky.garea.req;

import java.io.InputStream;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 * Create a doctor or resident user
 * @author Ken
 * @version 2016year9month19day
 */
public class CreateInfoReq extends BaseReq {

	private String deviceId;// Equipment number 50 Bit less than character
	private Integer userType;// customer type 0 ：Resident users  1 ：Doctor
	private String name;// Name Create the name of the corresponding information
	private String address;// address ID upper address
	private String nativeplace;//Nation Identity card Nation
	private String phone;// Phone number
	private InputStream file;

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNativeplace() {
		return nativeplace;
	}

	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public InputStream getFile() {
		return file;
	}

	public void setFile(InputStream file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}