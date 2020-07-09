package com.example.dxsjy.Bean.EX;

import com.example.dxsjy.Bean.RecruitmentWithBLOBs;

import java.util.List;

public class BusinessEX {
    private Integer bId;

    private Integer userId;

    private String bName;

    private String bAddress;

    private String bTel;

    private String bPeople;

    private String bEmail;

    private String bWebsite;

    private List<RecruitmentWithBLOBs> recruitment;

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
        this.bName = bName;
    }

    public String getbAddress() {
        return bAddress;
    }

    public void setbAddress(String bAddress) {
        this.bAddress = bAddress;
    }

    public String getbTel() {
        return bTel;
    }

    public void setbTel(String bTel) {
        this.bTel = bTel;
    }

    public String getbPeople() {
        return bPeople;
    }

    public void setbPeople(String bPeople) {
        this.bPeople = bPeople;
    }

    public String getbEmail() {
        return bEmail;
    }

    public void setbEmail(String bEmail) {
        this.bEmail = bEmail;
    }

    public String getbWebsite() {
        return bWebsite;
    }

    public void setbWebsite(String bWebsite) {
        this.bWebsite = bWebsite;
    }

    public List<RecruitmentWithBLOBs> getRecruitment() {
        return recruitment;
    }

    public void setRecruitment(List<RecruitmentWithBLOBs> recruitment) {
        this.recruitment = recruitment;
    }
}
