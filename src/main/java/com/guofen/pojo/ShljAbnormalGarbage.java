package com.guofen.pojo;

import java.io.Serializable;

public class ShljAbnormalGarbage implements Serializable {
    private Integer id;

    private String date;

    private String wagonNumber;

    private String garbageSource;

    private String garbageType;

    private Integer garbageNumber;

    private String garbageUnit;

    private String recordingPerson;

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

    public String getWagonNumber() {
        return wagonNumber;
    }

    public void setWagonNumber(String wagonNumber) {
        this.wagonNumber = wagonNumber == null ? null : wagonNumber.trim();
    }

    public String getGarbageSource() {
        return garbageSource;
    }

    public void setGarbageSource(String garbageSource) {
        this.garbageSource = garbageSource == null ? null : garbageSource.trim();
    }

    public String getGarbageType() {
        return garbageType;
    }

    public void setGarbageType(String garbageType) {
        this.garbageType = garbageType == null ? null : garbageType.trim();
    }

    public Integer getGarbageNumber() {
        return garbageNumber;
    }

    public void setGarbageNumber(Integer garbageNumber) {
        this.garbageNumber = garbageNumber;
    }

    public String getGarbageUnit() {
        return garbageUnit;
    }

    public void setGarbageUnit(String garbageUnit) {
        this.garbageUnit = garbageUnit == null ? null : garbageUnit.trim();
    }

    public String getRecordingPerson() {
        return recordingPerson;
    }

    public void setRecordingPerson(String recordingPerson) {
        this.recordingPerson = recordingPerson == null ? null : recordingPerson.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}