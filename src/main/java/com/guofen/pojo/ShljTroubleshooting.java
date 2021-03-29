package com.guofen.pojo;

import java.io.Serializable;
import io.swagger.annotations.ApiModelProperty;

public class ShljTroubleshooting implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "日期")
    private String date;

    @ApiModelProperty(value = "负责人")
    private String personInCharge;

    @ApiModelProperty(value = "系统名称")
    private String systemName;

    @ApiModelProperty(value = "设备名称")
    private String equipmentName;

    @ApiModelProperty(value = "阶段")
    private String stage;

    @ApiModelProperty(value = "记录人")
    private String recordingPerson;

    @ApiModelProperty(value = "故障发生时间")
    private String timeOfFailure;

    @ApiModelProperty(value = "故障描述")
    private String faultDescription;

    @ApiModelProperty(value = "故障原因")
    private String faultReasion;

    @ApiModelProperty(value = "维修方法")
    private String faultRepairMethod;

    @ApiModelProperty(value = "维修开始时间")
    private String repairStartTime;

    @ApiModelProperty(value = "维修结束时间")
    private String repairEndTime;

    @ApiModelProperty(value = "维修人")
    private String repairPerson;

    @ApiModelProperty(value = "方法提出人")
    private String methodProposer;

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

    public String getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge == null ? null : personInCharge.trim();
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName == null ? null : systemName.trim();
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage == null ? null : stage.trim();
    }

    public String getRecordingPerson() {
        return recordingPerson;
    }

    public void setRecordingPerson(String recordingPerson) {
        this.recordingPerson = recordingPerson == null ? null : recordingPerson.trim();
    }

    public String getTimeOfFailure() {
        return timeOfFailure;
    }

    public void setTimeOfFailure(String timeOfFailure) {
        this.timeOfFailure = timeOfFailure == null ? null : timeOfFailure.trim();
    }

    public String getFaultDescription() {
        return faultDescription;
    }

    public void setFaultDescription(String faultDescription) {
        this.faultDescription = faultDescription == null ? null : faultDescription.trim();
    }

    public String getFaultReasion() {
        return faultReasion;
    }

    public void setFaultReasion(String faultReasion) {
        this.faultReasion = faultReasion == null ? null : faultReasion.trim();
    }

    public String getFaultRepairMethod() {
        return faultRepairMethod;
    }

    public void setFaultRepairMethod(String faultRepairMethod) {
        this.faultRepairMethod = faultRepairMethod == null ? null : faultRepairMethod.trim();
    }

    public String getRepairStartTime() {
        return repairStartTime;
    }

    public void setRepairStartTime(String repairStartTime) {
        this.repairStartTime = repairStartTime == null ? null : repairStartTime.trim();
    }

    public String getRepairEndTime() {
        return repairEndTime;
    }

    public void setRepairEndTime(String repairEndTime) {
        this.repairEndTime = repairEndTime == null ? null : repairEndTime.trim();
    }

    public String getRepairPerson() {
        return repairPerson;
    }

    public void setRepairPerson(String repairPerson) {
        this.repairPerson = repairPerson == null ? null : repairPerson.trim();
    }

    public String getMethodProposer() {
        return methodProposer;
    }

    public void setMethodProposer(String methodProposer) {
        this.methodProposer = methodProposer == null ? null : methodProposer.trim();
    }
}