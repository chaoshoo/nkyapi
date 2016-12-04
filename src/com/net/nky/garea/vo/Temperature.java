package com.net.nky.garea.vo;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 * temperature.
 * @author Ken
 * @version 2016year9month19day
 */
public class Temperature {

	private String detectDate;

	private Float temperature;//temperature *10

	public String getDetectDate() {
		return detectDate;
	}

	public void setDetectDate(String detectDate) {
		this.detectDate = detectDate;
	}

	public Float getTemperature() {
		return temperature;
	}

	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}