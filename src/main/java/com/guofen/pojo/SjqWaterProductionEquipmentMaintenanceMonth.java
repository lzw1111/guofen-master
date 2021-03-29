package com.guofen.pojo;

import java.io.Serializable;

public class SjqWaterProductionEquipmentMaintenanceMonth implements Serializable {
    private Integer id;

    private Integer equipmentId;

    private String maintenanceId;

    private String planMaintenanceDate;

    private String actualMaintenanceDate;

    private String maintenanceResult;

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

    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getMaintenanceId() {
        return maintenanceId;
    }

    public void setMaintenanceId(String maintenanceId) {
        this.maintenanceId = maintenanceId == null ? null : maintenanceId.trim();
    }

    public String getPlanMaintenanceDate() {
        return planMaintenanceDate;
    }

    public void setPlanMaintenanceDate(String planMaintenanceDate) {
        this.planMaintenanceDate = planMaintenanceDate == null ? null : planMaintenanceDate.trim();
    }

    public String getActualMaintenanceDate() {
        return actualMaintenanceDate;
    }

    public void setActualMaintenanceDate(String actualMaintenanceDate) {
        this.actualMaintenanceDate = actualMaintenanceDate == null ? null : actualMaintenanceDate.trim();
    }

    public String getMaintenanceResult() {
        return maintenanceResult;
    }

    public void setMaintenanceResult(String maintenanceResult) {
        this.maintenanceResult = maintenanceResult == null ? null : maintenanceResult.trim();
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