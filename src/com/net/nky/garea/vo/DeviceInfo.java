package com.net.nky.garea.vo;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

public class DeviceInfo {

	private String deviceId; //Equipment number
	private String deviceName;//Device name
	private String deviceModel;//Equipment type 1: gp102 	2:gp102plus   3:gt1000

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceModel() {
		return deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}