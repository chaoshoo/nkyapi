package com.net.nky.garea.req;

import java.util.Date;

/**
 * 3.1.2Upload search report
 * @author Ken
 * @version 2016year9month19day
 */
public class DetectReportReq extends BaseReq {

	private Long flupId;//Follow up number A physical examination report is empty

	private String deviceInfo;//Equipment information  deviceId: Equipment number

	private String reportNo;//Report number  17 Physical examination report  18 Follow up Report

	private Date reportTime;//Check body report generation time

	private Integer influence;//hemolysis :1  jaundice 	:2    Blood fat :4

	private Object reportData;//Report content  And ECG detection time can only be an empty

	private Date ecgDetectDate;//ECG detection time     And report data can only be an empty

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public Long getFlupId() {
		return flupId;
	}

	public void setFlupId(Long flupId) {
		this.flupId = flupId;
	}

	public String getReportNo() {
		return reportNo;
	}

	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public Date getReportTime() {
		return reportTime;
	}

	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	public Integer getInfluence() {
		return influence;
	}

	public void setInfluence(Integer influence) {
		this.influence = influence;
	}

	public Object getReportData() {
		return reportData;
	}

	public void setReportData(Object reportData) {
		this.reportData = reportData;
	}

	public Date getEcgDetectDate() {
		return ecgDetectDate;
	}

	public void setEcgDetectDate(Date ecgDetectDate) {
		this.ecgDetectDate = ecgDetectDate;
	}

}