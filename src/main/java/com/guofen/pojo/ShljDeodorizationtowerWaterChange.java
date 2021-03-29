package com.guofen.pojo;

import java.io.Serializable;

public class ShljDeodorizationtowerWaterChange implements Serializable {
    private Integer id;

    private String date;

    private String waterAddTime;

    private String waterReduceTime;

    private Double deodorant;

    private Double freshener;

    private String cleanFillerTime;

    private Integer cleanNozzleNumber;

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

    public String getWaterAddTime() {
        return waterAddTime;
    }

    public void setWaterAddTime(String waterAddTime) {
        this.waterAddTime = waterAddTime == null ? null : waterAddTime.trim();
    }

    public String getWaterReduceTime() {
        return waterReduceTime;
    }

    public void setWaterReduceTime(String waterReduceTime) {
        this.waterReduceTime = waterReduceTime == null ? null : waterReduceTime.trim();
    }

    public Double getDeodorant() {
        return deodorant;
    }

    public void setDeodorant(Double deodorant) {
        this.deodorant = deodorant;
    }

    public Double getFreshener() {
        return freshener;
    }

    public void setFreshener(Double freshener) {
        this.freshener = freshener;
    }

    public String getCleanFillerTime() {
        return cleanFillerTime;
    }

    public void setCleanFillerTime(String cleanFillerTime) {
        this.cleanFillerTime = cleanFillerTime == null ? null : cleanFillerTime.trim();
    }

    public Integer getCleanNozzleNumber() {
        return cleanNozzleNumber;
    }

    public void setCleanNozzleNumber(Integer cleanNozzleNumber) {
        this.cleanNozzleNumber = cleanNozzleNumber;
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