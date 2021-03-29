package com.guofen.pojo;

import java.io.Serializable;

public class RdDischarge implements Serializable {
    private Integer id;

    private String dischargeDate;

    private String dischargeStarttime;

    private String dischargeEndtime;

    private String sieveStarttime;

    private String sieveEndtime;

    private String insectSeparateStarttime;

    private String insectSeparateEndtime;

    private String deviceName;

    private String batch;

    private Integer zubie;

    private Integer boxNumber;

    private Double dischargeBoxWeight;

    private Double boxWeight;

    private Double insectImpurityWeight;

    private Double insectDungWeight;

    private Double sieveWeight;

    private Double surfaceFiberWeight;

    private Double insectWeight;

    private Double impurityWeight;

    private String remark;

    private static final long serialVersionUID = 1L;

    public RdDischarge(Integer id, String dischargeDate, String dischargeStarttime, String dischargeEndtime, String sieveStarttime, String sieveEndtime, String insectSeparateStarttime, String insectSeparateEndtime, String deviceName, String batch, Integer zubie, Integer boxNumber, Double dischargeBoxWeight, Double boxWeight, Double insectImpurityWeight, Double insectDungWeight, Double sieveWeight, Double surfaceFiberWeight, Double insectWeight, Double impurityWeight, String remark) {
        this.id = id;
        this.dischargeDate = dischargeDate;
        this.dischargeStarttime = dischargeStarttime;
        this.dischargeEndtime = dischargeEndtime;
        this.sieveStarttime = sieveStarttime;
        this.sieveEndtime = sieveEndtime;
        this.insectSeparateStarttime = insectSeparateStarttime;
        this.insectSeparateEndtime = insectSeparateEndtime;
        this.deviceName = deviceName;
        this.batch = batch;
        this.zubie = zubie;
        this.boxNumber = boxNumber;
        this.dischargeBoxWeight = dischargeBoxWeight;
        this.boxWeight = boxWeight;
        this.insectImpurityWeight = insectImpurityWeight;
        this.insectDungWeight = insectDungWeight;
        this.sieveWeight = sieveWeight;
        this.surfaceFiberWeight = surfaceFiberWeight;
        this.insectWeight = insectWeight;
        this.impurityWeight = impurityWeight;
        this.remark = remark;
    }

    public RdDischarge(String dischargeDate, String dischargeStarttime, String dischargeEndtime, String sieveStarttime, String sieveEndtime, String insectSeparateStarttime, String insectSeparateEndtime, String deviceName, String batch, Integer zubie, Integer boxNumber, Double dischargeBoxWeight, Double boxWeight, Double insectImpurityWeight, Double insectDungWeight, Double sieveWeight, Double surfaceFiberWeight, Double insectWeight, Double impurityWeight, String remark) {
        this.dischargeDate = dischargeDate;
        this.dischargeStarttime = dischargeStarttime;
        this.dischargeEndtime = dischargeEndtime;
        this.sieveStarttime = sieveStarttime;
        this.sieveEndtime = sieveEndtime;
        this.insectSeparateStarttime = insectSeparateStarttime;
        this.insectSeparateEndtime = insectSeparateEndtime;
        this.deviceName = deviceName;
        this.batch = batch;
        this.zubie = zubie;
        this.boxNumber = boxNumber;
        this.dischargeBoxWeight = dischargeBoxWeight;
        this.boxWeight = boxWeight;
        this.insectImpurityWeight = insectImpurityWeight;
        this.insectDungWeight = insectDungWeight;
        this.sieveWeight = sieveWeight;
        this.surfaceFiberWeight = surfaceFiberWeight;
        this.insectWeight = insectWeight;
        this.impurityWeight = impurityWeight;
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

    public String getDischargeStarttime() {
        return dischargeStarttime;
    }

    public void setDischargeStarttime(String dischargeStarttime) {
        this.dischargeStarttime = dischargeStarttime == null ? null : dischargeStarttime.trim();
    }

    public String getDischargeEndtime() {
        return dischargeEndtime;
    }

    public void setDischargeEndtime(String dischargeEndtime) {
        this.dischargeEndtime = dischargeEndtime == null ? null : dischargeEndtime.trim();
    }

    public String getSieveStarttime() {
        return sieveStarttime;
    }

    public void setSieveStarttime(String sieveStarttime) {
        this.sieveStarttime = sieveStarttime == null ? null : sieveStarttime.trim();
    }

    public String getSieveEndtime() {
        return sieveEndtime;
    }

    public void setSieveEndtime(String sieveEndtime) {
        this.sieveEndtime = sieveEndtime == null ? null : sieveEndtime.trim();
    }

    public String getInsectSeparateStarttime() {
        return insectSeparateStarttime;
    }

    public void setInsectSeparateStarttime(String insectSeparateStarttime) {
        this.insectSeparateStarttime = insectSeparateStarttime == null ? null : insectSeparateStarttime.trim();
    }

    public String getInsectSeparateEndtime() {
        return insectSeparateEndtime;
    }

    public void setInsectSeparateEndtime(String insectSeparateEndtime) {
        this.insectSeparateEndtime = insectSeparateEndtime == null ? null : insectSeparateEndtime.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public Integer getzubie() {
        return zubie;
    }

    public void setzubie(Integer zubie) {
        this.zubie = zubie;
    }

    public Integer getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber(Integer boxNumber) {
        this.boxNumber = boxNumber;
    }

    public Double getDischargeBoxWeight() {
        return dischargeBoxWeight;
    }

    public void setDischargeBoxWeight(Double dischargeBoxWeight) {
        this.dischargeBoxWeight = dischargeBoxWeight;
    }

    public Double getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(Double boxWeight) {
        this.boxWeight = boxWeight;
    }

    public Double getInsectImpurityWeight() {
        return insectImpurityWeight;
    }

    public void setInsectImpurityWeight(Double insectImpurityWeight) {
        this.insectImpurityWeight = insectImpurityWeight;
    }

    public Double getInsectDungWeight() {
        return insectDungWeight;
    }

    public void setInsectDungWeight(Double insectDungWeight) {
        this.insectDungWeight = insectDungWeight;
    }

    public Double getSieveWeight() {
        return sieveWeight;
    }

    public void setSieveWeight(Double sieveWeight) {
        this.sieveWeight = sieveWeight;
    }

    public Double getSurfaceFiberWeight() {
        return surfaceFiberWeight;
    }

    public void setSurfaceFiberWeight(Double surfaceFiberWeight) {
        this.surfaceFiberWeight = surfaceFiberWeight;
    }

    public Double getInsectWeight() {
        return insectWeight;
    }

    public void setInsectWeight(Double insectWeight) {
        this.insectWeight = insectWeight;
    }

    public Double getImpurityWeight() {
        return impurityWeight;
    }

    public void setImpurityWeight(Double impurityWeight) {
        this.impurityWeight = impurityWeight;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}