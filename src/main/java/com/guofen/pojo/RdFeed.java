package com.guofen.pojo;

import java.io.Serializable;

public class RdFeed implements Serializable {
    private Integer id;

    private String feedDate;

    private String crushStarttime;

    private String crushEndtime;

    private String mixStarttime;

    private String mixEndtime;

    private String feedStarttime;

    private String feedEndtime;

    private String deviceName;

    private String batch;

    private Integer zubie;

    private Integer boxNumber;

    private Double feedWeight;

    private Double insectResidusBoxWeight;

    private Double boxWeight;

    private String recorder;

    private String remark;

    public RdFeed(Integer id, String feedDate, String crushStarttime, String crushEndtime, String mixStarttime, String mixEndtime, String feedStarttime, String feedEndtime, String deviceName, String batch, Integer zubie, Integer boxNumber, Double feedWeight, Double insectResidusBoxWeight, Double boxWeight, String recorder, String remark) {
        this.id = id;
        this.feedDate = feedDate;
        this.crushStarttime = crushStarttime;
        this.crushEndtime = crushEndtime;
        this.mixStarttime = mixStarttime;
        this.mixEndtime = mixEndtime;
        this.feedStarttime = feedStarttime;
        this.feedEndtime = feedEndtime;
        this.deviceName = deviceName;
        this.batch = batch;
        this.zubie = zubie;
        this.boxNumber = boxNumber;
        this.feedWeight = feedWeight;
        this.insectResidusBoxWeight = insectResidusBoxWeight;
        this.boxWeight = boxWeight;
        this.recorder = recorder;
        this.remark = remark;
    }

    public RdFeed(String feedDate, String crushStarttime, String crushEndtime, String mixStarttime, String mixEndtime, String feedStarttime, String feedEndtime, String deviceName, String batch, Integer zubie, Integer boxNumber, Double feedWeight, Double insectResidusBoxWeight, Double boxWeight, String recorder, String remark) {
        this.feedDate = feedDate;
        this.crushStarttime = crushStarttime;
        this.crushEndtime = crushEndtime;
        this.mixStarttime = mixStarttime;
        this.mixEndtime = mixEndtime;
        this.feedStarttime = feedStarttime;
        this.feedEndtime = feedEndtime;
        this.deviceName = deviceName;
        this.batch = batch;
        this.zubie = zubie;
        this.boxNumber = boxNumber;
        this.feedWeight = feedWeight;
        this.insectResidusBoxWeight = insectResidusBoxWeight;
        this.boxWeight = boxWeight;
        this.recorder = recorder;
        this.remark = remark;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeedDate() {
        return feedDate;
    }

    public void setFeedDate(String feedDate) {
        this.feedDate = feedDate == null ? null : feedDate.trim();
    }

    public String getCrushStarttime() {
        return crushStarttime;
    }

    public void setCrushStarttime(String crushStarttime) {
        this.crushStarttime = crushStarttime == null ? null : crushStarttime.trim();
    }

    public String getCrushEndtime() {
        return crushEndtime;
    }

    public void setCrushEndtime(String crushEndtime) {
        this.crushEndtime = crushEndtime == null ? null : crushEndtime.trim();
    }

    public String getMixStarttime() {
        return mixStarttime;
    }

    public void setMixStarttime(String mixStarttime) {
        this.mixStarttime = mixStarttime == null ? null : mixStarttime.trim();
    }

    public String getMixEndtime() {
        return mixEndtime;
    }

    public void setMixEndtime(String mixEndtime) {
        this.mixEndtime = mixEndtime == null ? null : mixEndtime.trim();
    }

    public String getFeedStarttime() {
        return feedStarttime;
    }

    public void setFeedStarttime(String feedStarttime) {
        this.feedStarttime = feedStarttime == null ? null : feedStarttime.trim();
    }

    public String getFeedEndtime() {
        return feedEndtime;
    }

    public void setFeedEndtime(String feedEndtime) {
        this.feedEndtime = feedEndtime == null ? null : feedEndtime.trim();
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

    public Double getFeedWeight() {
        return feedWeight;
    }

    public void setFeedWeight(Double feedWeight) {
        this.feedWeight = feedWeight;
    }

    public Double getInsectResidusBoxWeight() {
        return insectResidusBoxWeight;
    }

    public void setInsectResidusBoxWeight(Double insectResidusBoxWeight) {
        this.insectResidusBoxWeight = insectResidusBoxWeight;
    }

    public Double getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(Double boxWeight) {
        this.boxWeight = boxWeight;
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder == null ? null : recorder.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}