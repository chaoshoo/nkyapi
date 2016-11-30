package com.net.nky.garea.req;

import java.io.InputStream;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 * 创建医生或者居民用户
 * @author Ken
 * @version 2016年9月19日
 */
public class CreateInfoReq extends BaseReq {

	private String deviceId;// 设备编号 50 位以内字符
	private Integer userType;// 用户类型 0 ：居民用户  1 ：Doctor
	private String name;// Name 创建信息对应的Name
	private String address;// address ID 上 住址
	private String nativeplace;//民族 身份证上 民族
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