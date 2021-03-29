package com.guofen.pojo;

import java.io.Serializable;

public class SjqSolidliquidProduceFault implements Serializable {
    private Integer id;

    private String fillTime;

    private String equipmentName;

    private String faultTime;

    private String operator;

    private String faultContent;

    private String serviceTimeStart;

    private String serviceTimeEnd;

    private String servicemanInCharge;

    private String serviceman;

    private String faultReason;

    private String serviceMethod;

    private String proposer;

    private String recoverTime;

    private String inspector;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFillTime() {
        return fillTime;
    }

    public void setFillTime(String fillTime) {
        this.fillTime = fillTime == null ? null : fillTime.trim();
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public String getFaultTime() {
        return faultTime;
    }

    public void setFaultTime(String faultTime) {
        this.faultTime = faultTime == null ? null : faultTime.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getFaultContent() {
        return faultContent;
    }

    public void setFaultContent(String faultContent) {
        this.faultContent = faultContent == null ? null : faultContent.trim();
    }

    public String getServiceTimeStart() {
        return serviceTimeStart;
    }

    public void setServiceTimeStart(String serviceTimeStart) {
        this.serviceTimeStart = serviceTimeStart == null ? null : serviceTimeStart.trim();
    }

    public String getServiceTimeEnd() {
        return serviceTimeEnd;
    }

    public void setServiceTimeEnd(String serviceTimeEnd) {
        this.serviceTimeEnd = serviceTimeEnd == null ? null : serviceTimeEnd.trim();
    }

    public String getServicemanInCharge() {
        return servicemanInCharge;
    }

    public void setServicemanInCharge(String servicemanInCharge) {
        this.servicemanInCharge = servicemanInCharge == null ? null : servicemanInCharge.trim();
    }

    public String getServiceman() {
        return serviceman;
    }

    public void setServiceman(String serviceman) {
        this.serviceman = serviceman == null ? null : serviceman.trim();
    }

    public String getFaultReason() {
        return faultReason;
    }

    public void setFaultReason(String faultReason) {
        this.faultReason = faultReason == null ? null : faultReason.trim();
    }

    public String getServiceMethod() {
        return serviceMethod;
    }

    public void setServiceMethod(String serviceMethod) {
        this.serviceMethod = serviceMethod == null ? null : serviceMethod.trim();
    }

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer == null ? null : proposer.trim();
    }

    public String getRecoverTime() {
        return recoverTime;
    }

    public void setRecoverTime(String recoverTime) {
        this.recoverTime = recoverTime == null ? null : recoverTime.trim();
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector == null ? null : inspector.trim();
    }
}