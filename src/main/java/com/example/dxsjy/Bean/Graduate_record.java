package com.example.dxsjy.Bean;

import java.io.Serializable;
import java.util.Date;

public class Graduate_record implements Serializable {
    private Integer id;

    private Integer graduateId1;

    private String trainning;

    private Date startTime;

    private Date stopTime;

    private Integer allTime;

    private String major;

    private String trainningDepart;

    private Integer trainningMoney;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGraduateId1() {
        return graduateId1;
    }

    public void setGraduateId1(Integer graduateId1) {
        this.graduateId1 = graduateId1;
    }

    public String getTrainning() {
        return trainning;
    }

    public void setTrainning(String trainning) {
        this.trainning = trainning == null ? null : trainning.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public Integer getAllTime() {
        return allTime;
    }

    public void setAllTime(Integer allTime) {
        this.allTime = allTime;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getTrainningDepart() {
        return trainningDepart;
    }

    public void setTrainningDepart(String trainningDepart) {
        this.trainningDepart = trainningDepart == null ? null : trainningDepart.trim();
    }

    public Integer getTrainningMoney() {
        return trainningMoney;
    }

    public void setTrainningMoney(Integer trainningMoney) {
        this.trainningMoney = trainningMoney;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", graduateId1=").append(graduateId1);
        sb.append(", trainning=").append(trainning);
        sb.append(", startTime=").append(startTime);
        sb.append(", stopTime=").append(stopTime);
        sb.append(", allTime=").append(allTime);
        sb.append(", major=").append(major);
        sb.append(", trainningDepart=").append(trainningDepart);
        sb.append(", trainningMoney=").append(trainningMoney);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}