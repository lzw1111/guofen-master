package com.guofen.pojo;

import java.io.Serializable;

public class KitchenwasteDischarge implements Serializable {
    private Integer id;

    private String dischargeDate;

    private String incomeDate;

    private Integer cabinetNumber;

    private Integer layerNumber;

    private Double insectDungWeight;

    private Double insectWeight;

    private String remark;

    private static final long serialVersionUID = 1L;

    public KitchenwasteDischarge(Integer id, String dischargeDate, String incomeDate, Integer cabinetNumber, Integer layerNumber, Double insectDungWeight, Double insectWeight, String remark) {
        this.id = id;
        this.dischargeDate = dischargeDate;
        this.incomeDate = incomeDate;
        this.cabinetNumber = cabinetNumber;
        this.layerNumber = layerNumber;
        this.insectDungWeight = insectDungWeight;
        this.insectWeight = insectWeight;
        this.remark = remark;
    }

    public KitchenwasteDischarge(String dischargeDate, String incomeDate, Integer cabinetNumber, Integer layerNumber, Double insectDungWeight, Double insectWeight, String remark) {
        this.dischargeDate = dischargeDate;
        this.incomeDate = incomeDate;
        this.cabinetNumber = cabinetNumber;
        this.layerNumber = layerNumber;
        this.insectDungWeight = insectDungWeight;
        this.insectWeight = insectWeight;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate == null ? null : dischargeDate.trim();
    }

    public String getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(String incomeDate) {
        this.incomeDate = incomeDate == null ? null : incomeDate.trim();
    }

    public Integer getCabinetNumber() {
        return cabinetNumber;
    }

    public void setCabinetNumber(Integer cabinetNumber) {
        this.cabinetNumber = cabinetNumber;
    }

    public Integer getLayerNumber() {
        return layerNumber;
    }

    public void setLayerNumber(Integer layerNumber) {
        this.layerNumber = layerNumber;
    }

    public Double getInsectDungWeight() {
        return insectDungWeight;
    }

    public void setInsectDungWeight(Double insectDungWeight) {
        this.insectDungWeight = insectDungWeight;
    }

    public Double getInsectWeight() {
        return insectWeight;
    }

    public void setInsectWeight(Double insectWeight) {
        this.insectWeight = insectWeight;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}