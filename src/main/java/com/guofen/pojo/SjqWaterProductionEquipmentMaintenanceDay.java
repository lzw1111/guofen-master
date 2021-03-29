package com.guofen.pojo;

import java.io.Serializable;

public class SjqWaterProductionEquipmentMaintenanceDay implements Serializable {
    private Integer id;

    private String date;

    private String runningStatusSubmarinePump;

    private String runningStatusBlender;

    private String oNoiseFan1;

    private String oNoiseFan2;

    private String membraneNoiseFan1;

    private String membraneNoiseFan2;

    private String membraneNoiseFan3;

    private String runningStatusRefluxPump;

    private String oSurfaceElectronicControlSystem;

    private String membraneSurfaceElectronicControlSystem;

    private String operator;

    private String examiner;

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

    public String getRunningStatusSubmarinePump() {
        return runningStatusSubmarinePump;
    }

    public void setRunningStatusSubmarinePump(String runningStatusSubmarinePump) {
        this.runningStatusSubmarinePump = runningStatusSubmarinePump == null ? null : runningStatusSubmarinePump.trim();
    }

    public String getRunningStatusBlender() {
        return runningStatusBlender;
    }

    public void setRunningStatusBlender(String runningStatusBlender) {
        this.runningStatusBlender = runningStatusBlender == null ? null : runningStatusBlender.trim();
    }

    public String getoNoiseFan1() {
        return oNoiseFan1;
    }

    public void setoNoiseFan1(String oNoiseFan1) {
        this.oNoiseFan1 = oNoiseFan1 == null ? null : oNoiseFan1.trim();
    }

    public String getoNoiseFan2() {
        return oNoiseFan2;
    }

    public void setoNoiseFan2(String oNoiseFan2) {
        this.oNoiseFan2 = oNoiseFan2 == null ? null : oNoiseFan2.trim();
    }

    public String getMembraneNoiseFan1() {
        return membraneNoiseFan1;
    }

    public void setMembraneNoiseFan1(String membraneNoiseFan1) {
        this.membraneNoiseFan1 = membraneNoiseFan1 == null ? null : membraneNoiseFan1.trim();
    }

    public String getMembraneNoiseFan2() {
        return membraneNoiseFan2;
    }

    public void setMembraneNoiseFan2(String membraneNoiseFan2) {
        this.membraneNoiseFan2 = membraneNoiseFan2 == null ? null : membraneNoiseFan2.trim();
    }

    public String getMembraneNoiseFan3() {
        return membraneNoiseFan3;
    }

    public void setMembraneNoiseFan3(String membraneNoiseFan3) {
        this.membraneNoiseFan3 = membraneNoiseFan3 == null ? null : membraneNoiseFan3.trim();
    }

    public String getRunningStatusRefluxPump() {
        return runningStatusRefluxPump;
    }

    public void setRunningStatusRefluxPump(String runningStatusRefluxPump) {
        this.runningStatusRefluxPump = runningStatusRefluxPump == null ? null : runningStatusRefluxPump.trim();
    }

    public String getoSurfaceElectronicControlSystem() {
        return oSurfaceElectronicControlSystem;
    }

    public void setoSurfaceElectronicControlSystem(String oSurfaceElectronicControlSystem) {
        this.oSurfaceElectronicControlSystem = oSurfaceElectronicControlSystem == null ? null : oSurfaceElectronicControlSystem.trim();
    }

    public String getMembraneSurfaceElectronicControlSystem() {
        return membraneSurfaceElectronicControlSystem;
    }

    public void setMembraneSurfaceElectronicControlSystem(String membraneSurfaceElectronicControlSystem) {
        this.membraneSurfaceElectronicControlSystem = membraneSurfaceElectronicControlSystem == null ? null : membraneSurfaceElectronicControlSystem.trim();
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
}