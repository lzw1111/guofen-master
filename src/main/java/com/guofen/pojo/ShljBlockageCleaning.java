package com.guofen.pojo;

import java.io.Serializable;

public class ShljBlockageCleaning implements Serializable {
    private Integer id;

    private String date;

    private String time;

    private String blockagePosition;

    private String cleaningPerson;

    private String recordingPerson;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getBlockagePosition() {
        return blockagePosition;
    }

    public void setBlockagePosition(String blockagePosition) {
        this.blockagePosition = blockagePosition == null ? null : blockagePosition.trim();
    }

    public String getCleaningPerson() {
        return cleaningPerson;
    }

    public void setCleaningPerson(String cleaningPerson) {
        this.cleaningPerson = cleaningPerson == null ? null : cleaningPerson.trim();
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
}