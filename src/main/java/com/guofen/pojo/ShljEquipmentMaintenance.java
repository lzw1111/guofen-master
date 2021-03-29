package com.guofen.pojo;

import java.io.Serializable;

public class ShljEquipmentMaintenance implements Serializable {
    private Integer id;

    private String date;

    private String equipmentName;

    private String maintenanceContent;

    private String planAintenanceWeek;

    private String actualAintenanceWeek;

    private String actualAintenanceDay;

    private String operator;

    private String method;

    private String examiner;

    private String result;

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

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public String getMaintenanceContent() {
        return maintenanceContent;
    }

    public void setMaintenanceContent(String maintenanceContent) {
        this.maintenanceContent = maintenanceContent == null ? null : maintenanceContent.trim();
    }

    public String getPlanAintenanceWeek() {
        return planAintenanceWeek;
    }

    public void setPlanAintenanceWeek(String planAintenanceWeek) {
        this.planAintenanceWeek = planAintenanceWeek == null ? null : planAintenanceWeek.trim();
    }

    public String getActualAintenanceWeek() {
        return actualAintenanceWeek;
    }

    public void setActualAintenanceWeek(String actualAintenanceWeek) {
        this.actualAintenanceWeek = actualAintenanceWeek == null ? null : actualAintenanceWeek.trim();
    }

    public String getActualAintenanceDay() {
        return actualAintenanceDay;
    }

    public void setActualAintenanceDay(String actualAintenanceDay) {
        this.actualAintenanceDay = actualAintenanceDay == null ? null : actualAintenanceDay.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getExaminer() {
        return examiner;
    }

    public void setExaminer(String examiner) {
        this.examiner = examiner == null ? null : examiner.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

}