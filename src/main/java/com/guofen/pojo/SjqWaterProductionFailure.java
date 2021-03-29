package com.guofen.pojo;

import java.io.Serializable;

public class SjqWaterProductionFailure implements Serializable {
    private Integer id;

    private String equipmentName;

    private String failureReason;

    private String maintenanceMethod;

    private String recoveryTime;

    private String examiner;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason == null ? null : failureReason.trim();
    }

    public String getMaintenanceMethod() {
        return maintenanceMethod;
    }

    public void setMaintenanceMethod(String maintenanceMethod) {
        this.maintenanceMethod = maintenanceMethod == null ? null : maintenanceMethod.trim();
    }

    public String getRecoveryTime() {
        return recoveryTime;
    }

    public void setRecoveryTime(String recoveryTime) {
        this.recoveryTime = recoveryTime == null ? null : recoveryTime.trim();
    }

    public String getExaminer() {
        return examiner;
    }

    public void setExaminer(String examiner) {
        this.examiner = examiner == null ? null : examiner.trim();
    }
}