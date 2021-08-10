package com.adapter.apiadapter.dto;

import java.util.ArrayList;
import java.util.List;

public class StateSummaryResponseDTO {

    private String state;
    private Integer count;
    private List<IssueResponseDTO> issues;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<IssueResponseDTO> getIssues() {
        return issues;
    }

    public void setIssues(List<IssueResponseDTO> issues) {
        this.issues = issues;
    }
}
