package com.example.dxsjy.Bean;

import java.io.Serializable;
import java.util.Date;

public class Graduate implements Serializable {
    private Integer sId;

    private Integer userId1;

    private String sname;

    private String ssex;

    private String country;

    private Date birth;

    private String maritalStatus;

    private Integer height;

    private Integer id;

    private String nativePlace;

    private Integer tel;

    private Integer qq;

    private String eMail;

    private Integer postalCode;

    private String address;

    private String selfAssessment;

    private String graduateInstitutions;

    private String major;

    private String degree;

    private String rank;

    private String firstForeignLanguages;

    private String firstLevel;

    private String secondForeignLanguages;

    private String secondLevel;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getUserId1() {
        return userId1;
    }

    public void setUserId1(Integer userId1) {
        this.userId1 = userId1;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus == null ? null : maritalStatus.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public Integer getQq() {
        return qq;
    }

    public void setQq(Integer qq) {
        this.qq = qq;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getSelfAssessment() {
        return selfAssessment;
    }

    public void setSelfAssessment(String selfAssessment) {
        this.selfAssessment = selfAssessment == null ? null : selfAssessment.trim();
    }

    public String getGraduateInstitutions() {
        return graduateInstitutions;
    }

    public void setGraduateInstitutions(String graduateInstitutions) {
        this.graduateInstitutions = graduateInstitutions == null ? null : graduateInstitutions.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    public String getFirstForeignLanguages() {
        return firstForeignLanguages;
    }

    public void setFirstForeignLanguages(String firstForeignLanguages) {
        this.firstForeignLanguages = firstForeignLanguages == null ? null : firstForeignLanguages.trim();
    }

    public String getFirstLevel() {
        return firstLevel;
    }

    public void setFirstLevel(String firstLevel) {
        this.firstLevel = firstLevel == null ? null : firstLevel.trim();
    }

    public String getSecondForeignLanguages() {
        return secondForeignLanguages;
    }

    public void setSecondForeignLanguages(String secondForeignLanguages) {
        this.secondForeignLanguages = secondForeignLanguages == null ? null : secondForeignLanguages.trim();
    }

    public String getSecondLevel() {
        return secondLevel;
    }

    public void setSecondLevel(String secondLevel) {
        this.secondLevel = secondLevel == null ? null : secondLevel.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sId=").append(sId);
        sb.append(", userId1=").append(userId1);
        sb.append(", sname=").append(sname);
        sb.append(", ssex=").append(ssex);
        sb.append(", country=").append(country);
        sb.append(", birth=").append(birth);
        sb.append(", maritalStatus=").append(maritalStatus);
        sb.append(", height=").append(height);
        sb.append(", id=").append(id);
        sb.append(", nativePlace=").append(nativePlace);
        sb.append(", tel=").append(tel);
        sb.append(", qq=").append(qq);
        sb.append(", eMail=").append(eMail);
        sb.append(", postalCode=").append(postalCode);
        sb.append(", address=").append(address);
        sb.append(", selfAssessment=").append(selfAssessment);
        sb.append(", graduateInstitutions=").append(graduateInstitutions);
        sb.append(", major=").append(major);
        sb.append(", degree=").append(degree);
        sb.append(", rank=").append(rank);
        sb.append(", firstForeignLanguages=").append(firstForeignLanguages);
        sb.append(", firstLevel=").append(firstLevel);
        sb.append(", secondForeignLanguages=").append(secondForeignLanguages);
        sb.append(", secondLevel=").append(secondLevel);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}