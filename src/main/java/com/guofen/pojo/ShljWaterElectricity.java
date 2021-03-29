package com.guofen.pojo;

import java.io.Serializable;

public class ShljWaterElectricity implements Serializable {
    private Integer id;

    private String date;

    private String eReadingTime;

    private Double ePowerMeterReading;

    private Double eLightingMeterReading;

    private String wReadingTime;

    private Double wMeterReading;

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