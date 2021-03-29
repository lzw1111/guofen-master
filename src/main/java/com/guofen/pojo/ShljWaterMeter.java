package com.guofen.pojo;

import java.io.Serializable;
import io.swagger.annotations.ApiModelProperty;

public class ShljWaterMeter implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "日期")
    private String date;

    @ApiModelProperty(value = "水表读数时间")
    private String wReadingTime;

    @ApiModelProperty(value = "水表读数")
    private Double wMeterReading;

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

    public String getwReadingTime() {
        return wReadingTime;
    }

    public void setwReadingTime(String wReadingTime) {
        this.wReadingTime = wReadingTime == null ? null : wReadingTime.trim();
    }

    public Double getwMeterReading() {
        return wMeterReading;
    }

    public void setwMeterReading(Double wMeterReading) {
        this.wMeterReading = wMeterReading;
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