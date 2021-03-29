package com.guofen.pojo;

import java.io.Serializable;

public class SjqWaterProductionEquipmentRunning implements Serializable {
    private Integer id;

    private String date;

    private Double pumpPressure1;

    private Double pumpPressure2;

    private Double pumpPressure3;

    private Double fanFrequency1;

    private Double fanFrequency2;

    private String operator;

    private String examiner;

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

    public Double getPumpPressure1() {
        return pumpPressure1;
    }

    public void setPumpPressure1(Double pumpPressure1) {
        this.pumpPressure1 = pumpPressure1;
    }

    public Double getPumpPressure2() {
        return pumpPressure2;
    }

    public void setPumpPressure2(Double pumpPressure2) {
        this.pumpPressure2 = pumpPressure2;
    }

    public Double getPumpPressure3() {
        return pumpPressure3;
    }

    public void setPumpPressure3(Double pumpPressure3) {
        this.pumpPressure3 = pumpPressure3;
    }

    public Double getFanFrequency1() {
        return fanFrequency1;
    }

    public void setFanFrequency1(Double fanFrequency1) {
        this.fanFrequency1 = fanFrequency1;
    }

    public Double getFanFrequency2() {
        return fanFrequency2;
    }

    public void setFanFrequency2(Double fanFrequency2) {
        this.fanFrequency2 = fanFrequency2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getExaminer() {
        return examiner;
    }

    public void setExaminer(String examiner) {
        this.examiner = examiner == null ? null : examiner.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}