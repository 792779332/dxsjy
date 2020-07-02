package com.example.dxsjy.Bean;

import java.io.Serializable;
import java.util.Date;

public class Recruitment implements Serializable {
    private Integer id;

    private Integer bId;

    private String jobName;

    private String workAddress;

    private Integer recNumber;

    private Float salary;

    private Date closingDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress == null ? null : workAddress.trim();
    }

    public Integer getRecNumber() {
        return recNumber;
    }

    public void setRecNumber(Integer recNumber) {
        this.recNumber = recNumber;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bId=").append(bId);
        sb.append(", jobName=").append(jobName);
        sb.append(", workAddress=").append(workAddress);
        sb.append(", recNumber=").append(recNumber);
        sb.append(", salary=").append(salary);
        sb.append(", closingDate=").append(closingDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}