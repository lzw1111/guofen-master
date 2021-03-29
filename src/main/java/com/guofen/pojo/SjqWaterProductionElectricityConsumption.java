package com.guofen.pojo;

import java.io.Serializable;

public class SjqWaterProductionElectricityConsumption implements Serializable {
    private Integer id;

    private String date;

    private String meterReadingTime;

    private Double wMeterReading;

    private Double cMeterReading;

    private String readingPerson;

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

    public String getMeterReadingTime() {
        return meterReadingTime;
    }

    public void setMeterReadingTime(String meterReadingTime) {
        this.meterReadingTime = meterReadingTime == null ? null : meterReadingTime.trim();
    }

    public Double getwMeterReading() {
        return wMeterReading;
    }

    public void setwMeterReading(Double wMeterReading) {
        this.wMeterReading = wMeterReading;
    }

    public Double getcMeterReading() {
        return cMeterReading;
    }

    public void setcMeterReading(Double cMeterReading) {
        this.cMeterReading = cMeterReading;
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