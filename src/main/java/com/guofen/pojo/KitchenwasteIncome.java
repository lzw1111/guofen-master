package com.guofen.pojo;

import java.io.Serializable;


public class KitchenwasteIncome implements Serializable {
    private Integer id;

    private String incomeDate;

    private Double incomeWeight;

    private Double bucketWeight;

    private Double waterWeight;

    private Double impurityWeight;

    private Double incomeNetweight;

    private Double feedWeight;

    private Double cultivationWeight;

    private Double throwWeight;

    private String remark;

    private static final long serialVersionUID = 1L;

    public KitchenwasteIncome(Integer id, String incomeDate, Double incomeWeight, Double bucketWeight, Double waterWeight, Double impurityWeight, Double incomeNetweight, Double feedWeight, Double cultivationWeight, Double throwWeight, String remark) {
        this.id = id;
        this.incomeDate = incomeDate;
        this.incomeWeight = incomeWeight;
        this.bucketWeight = bucketWeight;
        this.waterWeight = waterWeight;
        this.impurityWeight = impurityWeight;
        this.incomeNetweight = incomeNetweight;
        this.feedWeight = feedWeight;
        this.cultivationWeight = cultivationWeight;
        this.throwWeight = throwWeight;
        this.remark = remark;
    }

    public KitchenwasteIncome(String incomeDate, Double incomeWeight, Double bucketWeight, Double waterWeight, Double impurityWeight, Double incomeNetweight, Double feedWeight, Double cultivationWeight, Double throwWeight, String remark) {
        this.incomeDate = incomeDate;
        this.incomeWeight = incomeWeight;
        this.bucketWeight = bucketWeight;
        this.waterWeight = waterWeight;
        this.impurityWeight = impurityWeight;
        this.incomeNetweight = incomeNetweight;
        this.feedWeight = feedWeight;
        this.cultivationWeight = cultivationWeight;
        this.throwWeight = throwWeight;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(String incomeDate) {
        this.incomeDate = incomeDate == null ? null : incomeDate.trim();
    }

    public Double getIncomeWeight() {
        return incomeWeight;
    }

    public void setIncomeWeight(Double incomeWeight) {
        this.incomeWeight = incomeWeight;
    }

    public Double getBucketWeight() {
        return bucketWeight;
    }

    public void setBucketWeight(Double bucketWeight) {
        this.bucketWeight = bucketWeight;
    }

    public Double getWaterWeight() {
        return waterWeight;
    }

    public void setWaterWeight(Double waterWeight) {
        this.waterWeight = waterWeight;
    }

    public Double getImpurityWeight() {
        return impurityWeight;
    }

    public void setImpurityWeight(Double impurityWeight) {
        this.impurityWeight = impurityWeight;
    }

    public Double getIncomeNetweight() {
        return incomeNetweight;
    }

    public void setIncomeNetweight(Double incomeNetweight) {
        this.incomeNetweight = incomeNetweight;
    }

    public Double getFeedWeight() {
        return feedWeight;
    }

    public void setFeedWeight(Double feedWeight) {
        this.feedWeight = feedWeight;
    }

    public Double getCultivationWeight() {
        return cultivationWeight;
    }

    public void setCultivationWeight(Double cultivationWeight) {
        this.cultivationWeight = cultivationWeight;
    }

    public Double getThrowWeight() {
        return throwWeight;
    }

    public void setThrowWeight(Double throwWeight) {
        this.throwWeight = throwWeight;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}