package com.guofen.pojo;

import java.io.Serializable;

public class SjqDeodorizationCraft implements Serializable {
    private Integer id;

    private String date;

    private Double dungWeight;

    private Double solidliquidWeight;

    private Double flocculationWeight;

    private Double compostWeight;

    private Double outdoorWeight;

    private Double enzymeWeight;

    private Double othersWeight;

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

    public Double getDungWeight() {
        return dungWeight;
    }

    public void setDungWeight(Double dungWeight) {
        this.dungWeight = dungWeight;
    }

    public Double getSolidliquidWeight() {
        return solidliquidWeight;
    }

    public void setSolidliquidWeight(Double solidliquidWeight) {
        this.solidliquidWeight = solidliquidWeight;
    }

    public Double getFlocculationWeight() {
        return flocculationWeight;
    }

    public void setFlocculationWeight(Double flocculationWeight) {
        this.flocculationWeight = flocculationWeight;
    }

    public Double getCompostWeight() {
        return compostWeight;
    }

    public void setCompostWeight(Double compostWeight) {
        this.compostWeight = compostWeight;
    }

    public Double getOutdoorWeight() {
        return outdoorWeight;
    }

    public void setOutdoorWeight(Double outdoorWeight) {
        this.outdoorWeight = outdoorWeight;
    }

    public Double getEnzymeWeight() {
        return enzymeWeight;
    }

    public void setEnzymeWeight(Double enzymeWeight) {
        this.enzymeWeight = enzymeWeight;
    }

    public Double getOthersWeight() {
        return othersWeight;
    }

    public void setOthersWeight(Double othersWeight) {
        this.othersWeight = othersWeight;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}