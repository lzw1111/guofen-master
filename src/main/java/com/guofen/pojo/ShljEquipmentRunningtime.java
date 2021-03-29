package com.guofen.pojo;

import java.io.Serializable;

public class ShljEquipmentRunningtime implements Serializable {
    private Integer id;

    private String date;

    private String startupTime;

    private String shutdownTime;

    private String shutdownReasion;

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

    public String getStartupTime() {
        return startupTime;
    }

    public void setStartupTime(String startupTime) {
        this.startupTime = startupTime == null ? null : startupTime.trim();
    }

    public String getShutdownTime() {
        return shutdownTime;
    }

    public void setShutdownTime(String shutdownTime) {
        this.shutdownTime = shutdownTime == null ? null : shutdownTime.trim();
    }

    public String getShutdownReasion() {
        return shutdownReasion;
    }

    public void setShutdownReasion(String shutdownReasion) {
        this.shutdownReasion = shutdownReasion == null ? null : shutdownReasion.trim();
    }
}