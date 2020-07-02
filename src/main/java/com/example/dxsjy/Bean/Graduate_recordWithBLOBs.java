package com.example.dxsjy.Bean;

import java.io.Serializable;

public class Graduate_recordWithBLOBs extends Graduate_record implements Serializable {
    private String trainningText;

    private String trainningResult;

    private static final long serialVersionUID = 1L;

    public String getTrainningText() {
        return trainningText;
    }

    public void setTrainningText(String trainningText) {
        this.trainningText = trainningText == null ? null : trainningText.trim();
    }

    public String getTrainningResult() {
        return trainningResult;
    }

    public void setTrainningResult(String trainningResult) {
        this.trainningResult = trainningResult == null ? null : trainningResult.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", trainningText=").append(trainningText);
        sb.append(", trainningResult=").append(trainningResult);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}