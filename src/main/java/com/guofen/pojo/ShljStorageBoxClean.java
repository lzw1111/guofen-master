package com.guofen.pojo;

import java.io.Serializable;
import io.swagger.annotations.ApiModelProperty;

public class ShljStorageBoxClean implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "日期")
    private String date;

    @ApiModelProperty(value = "车号")
    private String wagonNumber;

    @ApiModelProperty(value = "到厂时间")
    private String arrivalTime;

    @ApiModelProperty(value = "离厂时间")
    private String leaveTime;

    @ApiModelProperty(value = "清运物料重量")
    private Double cleanWeight;

    @ApiModelProperty(value = "剩余物料重量")
    private Double residueWeight;

    @ApiModelProperty(value = "记录人")
    private String recordingPerson;

    @ApiModelProperty(value = "备注")
    private String remarks;

    @ApiModelProperty(value = "清运物料类型")
    private String cleanType;

    @ApiModelProperty(value = "剩余物料类型")
    private String residueType;

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

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime == null ? null : arrivalTime.trim();
    }

    public String getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime == null ? null : leaveTime.trim();
    }

    public Double getCleanWeight() {
        return cleanWeight;
    }

    public void setCleanWeight(Double cleanWeight) {
        this.cleanWeight = cleanWeight;
    }

    public Double getResidueWeight() {
        return residueWeight;
    }

    public void setResidueWeight(Double residueWeight) {
        this.residueWeight = residueWeight;
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

    public String getCleanType() {
        return cleanType;
    }

    public void setCleanType(String cleanType) {
        this.cleanType = cleanType == null ? null : cleanType.trim();
    }

    public String getResidueType() {
        return residueType;
    }

    public void setResidueType(String residueType) {
        this.residueType = residueType == null ? null : residueType.trim();
    }
}