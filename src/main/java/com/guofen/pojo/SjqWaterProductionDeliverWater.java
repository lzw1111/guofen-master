package com.guofen.pojo;

import java.io.Serializable;

public class SjqWaterProductionDeliverWater implements Serializable {
    private Integer id;

    private String date;

    private Integer trainNumber;

    private Double weight;

    private String deliverPerson;

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

    public Integer getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(Integer trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getDeliverPerson() {
        return deliverPerson;
    }

    public void setDeliverPerson(String deliverPerson) {
        this.deliverPerson = deliverPerson == null ? null : deliverPerson.trim();
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