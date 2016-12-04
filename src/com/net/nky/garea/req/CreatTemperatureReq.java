package com.net.nky.garea.req;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import com.net.nky.garea.vo.DeviceInfo;
import com.net.nky.garea.vo.Temperature;

/**
 * Create a doctor or resident user
 * @author Ken
 * @version 2016year9month19day
 */
public class CreatTemperatureReq extends BaseReq{

	private DeviceInfo deviceInfo;
	private Temperature temperature;

	public DeviceInfo getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public Temperature getTemperature() {
		return temperature;
	}

	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}