package com.example.dxsjy.Bean;

import java.io.Serializable;

public class Business implements Serializable {
    private Integer bId;

    private Integer userId;

    private String bName;

    private String bAddress;

    private String bTel;

    private String bPeople;

    private String bEmail;

    private String bWebsite;

    private static final long serialVersionUID = 1L;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public String getbAddress() {
        return bAddress;
    }

    public void setbAddress(String bAddress) {
        this.bAddress = bAddress == null ? null : bAddress.trim();
    }

    public String getbTel() {
        return bTel;
    }

    public void setbTel(String bTel) {
        this.bTel = bTel == null ? null : bTel.trim();
    }

    public String getbPeople() {
        return bPeople;
    }

    public void setbPeople(String bPeople) {
        this.bPeople = bPeople == null ? null : bPeople.trim();
    }

    public String getbEmail() {
        return bEmail;
    }

    public void setbEmail(String bEmail) {
        this.bEmail = bEmail == null ? null : bEmail.trim();
    }

    public String getbWebsite() {
        return bWebsite;
    }

    public void setbWebsite(String bWebsite) {
        this.bWebsite = bWebsite == null ? null : bWebsite.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bId=").append(bId);
        sb.append(", userId=").append(userId);
        sb.append(", bName=").append(bName);
        sb.append(", bAddress=").append(bAddress);
        sb.append(", bTel=").append(bTel);
        sb.append(", bPeople=").append(bPeople);
        sb.append(", bEmail=").append(bEmail);
        sb.append(", bWebsite=").append(bWebsite);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}