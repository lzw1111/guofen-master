package com.guofen.pojo;

import java.io.Serializable;
import io.swagger.annotations.ApiModelProperty;

public class ShljElectricityMeter implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "日期")
    private String date;

    @ApiModelProperty(value = "电表读表时间")
    private String eReadingTime;

    @ApiModelProperty(value = "动力电表读数")
    private Double ePowerMeterReading;

    @ApiModelProperty(value = "照明电表读数")
    private Double eLightingMeterReading;

    @ApiModelProperty(value = "读表人")
    private String readingPerson;

    @ApiModelProperty(value = "备注")
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

    public String geteReadingTime() {
        return eReadingTime;
    }

    public void seteReadingTime(String eReadingTime) {
        this.eReadingTime = eReadingTime == null ? null : eReadingTime.trim();
    }

    public Double getePowerMeterReading() {
        return ePowerMeterReading;
    }

    public void setePowerMeterReading(Double ePowerMeterReading) {
        this.ePowerMeterReading = ePowerMeterReading;
    }

    public Double geteLightingMeterReading() {
        return eLightingMeterReading;
    }

    public void seteLightingMeterReading(Double eLightingMeterReading) {
        this.eLightingMeterReading = eLightingMeterReading;
    }

    public String getReadingPerson() {
        return readingPerson;
    }

    public void setReadingPerson(String readingPerson) {
        this.readingPerson = readingPerson == null ? null : readingPerson.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}