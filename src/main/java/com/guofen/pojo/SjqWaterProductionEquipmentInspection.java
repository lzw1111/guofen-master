package com.guofen.pojo;

import java.io.Serializable;

public class SjqWaterProductionEquipmentInspection implements Serializable {
    private Integer id;

    private String date;

    private String refluxPump;

    private String sludgePump;

    private String pneumaticValve1;

    private String pneumaticValve2;

    private String membraneModule1;

    private String membraneModule2;

    private String membraneLevel;

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

    public String getRefluxPump() {
        return refluxPump;
    }

    public void setRefluxPump(String refluxPump) {
        this.refluxPump = refluxPump == null ? null : refluxPump.trim();
    }

    public String getSludgePump() {
        return sludgePump;
    }

    public void setSludgePump(String sludgePump) {
        this.sludgePump = sludgePump == null ? null : sludgePump.trim();
    }

    public String getPneumaticValve1() {
        return pneumaticValve1;
    }

    public void setPneumaticValve1(String pneumaticValve1) {
        this.pneumaticValve1 = pneumaticValve1 == null ? null : pneumaticValve1.trim();
    }

    public String getPneumaticValve2() {
        return pneumaticValve2;
    }

    public void setPneumaticValve2(String pneumaticValve2) {
        this.pneumaticValve2 = pneumaticValve2 == null ? null : pneumaticValve2.trim();
    }

    public String getMembraneModule1() {
        return membraneModule1;
    }

    public void setMembraneModule1(String membraneModule1) {
        this.membraneModule1 = membraneModule1 == null ? null : membraneModule1.trim();
    }

    public String getMembraneModule2() {
        return membraneModule2;
    }

    public void setMembraneModule2(String membraneModule2) {
        this.membraneModule2 = membraneModule2 == null ? null : membraneModule2.trim();
    }

    public String getMembraneLevel() {
        return membraneLevel;
    }

    public void setMembraneLevel(String membraneLevel) {
        this.membraneLevel = membraneLevel == null ? null : membraneLevel.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}