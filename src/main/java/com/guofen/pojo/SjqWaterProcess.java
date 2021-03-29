package com.guofen.pojo;

import java.io.Serializable;

public class SjqWaterProcess implements Serializable {
    private Integer id;

    private String date;

    private String time;

    private Double flowMeterReading1;

    private Double flowMeterReading2;

    private Double flowMeterReadingTotal;

    private Double oLevel;

    private String soilDischargingStartTime;

    private String soilDischargingEndTime;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Double getFlowMeterReading1() {
        return flowMeterReading1;
    }

    public void setFlowMeterReading1(Double flowMeterReading1) {
        this.flowMeterReading1 = flowMeterReading1;
    }

    public Double getFlowMeterReading2() {
        return flowMeterReading2;
    }

    public void setFlowMeterReading2(Double flowMeterReading2) {
        this.flowMeterReading2 = flowMeterReading2;
    }

    public Double getFlowMeterReadingTotal() {
        return flowMeterReadingTotal;
    }

    public void setFlowMeterReadingTotal(Double flowMeterReadingTotal) {
        this.flowMeterReadingTotal = flowMeterReadingTotal;
    }

    public Double getoLevel() {
        return oLevel;
    }

    public void setoLevel(Double oLevel) {
        this.oLevel = oLevel;
    }

    public String getSoilDischargingStartTime() {
        return soilDischargingStartTime;
    }

    public void setSoilDischargingStartTime(String soilDischargingStartTime) {
        this.soilDischargingStartTime = soilDischargingStartTime == null ? null : soilDischargingStartTime.trim();
    }

    public String getSoilDischargingEndTime() {
        return soilDischargingEndTime;
    }

    public void setSoilDischargingEndTime(String soilDischargingEndTime) {
        this.soilDischargingEndTime = soilDischargingEndTime == null ? null : soilDischargingEndTime.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}