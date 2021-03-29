package com.guofen.pojo;

import java.io.Serializable;

public class KitchenwasteExport implements Serializable {
    private Integer id;

    private String exportDate;

    private Double insectExportWeight;

    private Double insectDungExportWeight;

    private String companyName;

    private String contacter;

    private String telephone;

    private String yongfa;

    private String feedback;

    private String remark;

    private static final long serialVersionUID = 1L;

    public KitchenwasteExport(Integer id, String exportDate, Double insectExportWeight, Double insectDungExportWeight, String companyName, String contacter, String telephone, String yongfa, String feedback, String remark) {
        this.id = id;
        this.exportDate = exportDate;
        this.insectExportWeight = insectExportWeight;
        this.insectDungExportWeight = insectDungExportWeight;
        this.companyName = companyName;
        this.contacter = contacter;
        this.telephone = telephone;
        this.yongfa = yongfa;
        this.feedback = feedback;
        this.remark = remark;
    }

    public KitchenwasteExport(String exportDate, Double insectExportWeight, Double insectDungExportWeight, String companyName, String contacter, String telephone, String yongfa, String feedback, String remark) {
        this.exportDate = exportDate;
        this.insectExportWeight = insectExportWeight;
        this.insectDungExportWeight = insectDungExportWeight;
        this.companyName = companyName;
        this.contacter = contacter;
        this.telephone = telephone;
        this.yongfa = yongfa;
        this.feedback = feedback;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExportDate() {
        return exportDate;
    }

    public void setExportDate(String exportDate) {
        this.exportDate = exportDate == null ? null : exportDate.trim();
    }

    public Double getInsectExportWeight() {
        return insectExportWeight;
    }

    public void setInsectExportWeight(Double insectExportWeight) {
        this.insectExportWeight = insectExportWeight;
    }

    public Double getInsectDungExportWeight() {
        return insectDungExportWeight;
    }

    public void setInsectDungExportWeight(Double insectDungExportWeight) {
        this.insectDungExportWeight = insectDungExportWeight;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getContacter() {
        return contacter;
    }

    public void setContacter(String contacter) {
        this.contacter = contacter == null ? null : contacter.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getyongfa() {
        return yongfa;
    }

    public void setyongfa(String yongfa) {
        this.yongfa = yongfa == null ? null : yongfa.trim();
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback == null ? null : feedback.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}