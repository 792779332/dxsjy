package com.example.dxsjy.Bean;

import java.io.Serializable;

public class RecruitmentWithBLOBs extends Recruitment implements Serializable {
    private String jobRequirement;

    private String otherTreatment;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public String getJobRequirement() {
        return jobRequirement;
    }

    public void setJobRequirement(String jobRequirement) {
        this.jobRequirement = jobRequirement == null ? null : jobRequirement.trim();
    }

    public String getOtherTreatment() {
        return otherTreatment;
    }

    public void setOtherTreatment(String otherTreatment) {
        this.otherTreatment = otherTreatment == null ? null : otherTreatment.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jobRequirement=").append(jobRequirement);
        sb.append(", otherTreatment=").append(otherTreatment);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}