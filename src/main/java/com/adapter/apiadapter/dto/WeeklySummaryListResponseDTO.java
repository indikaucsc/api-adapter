package com.adapter.apiadapter.dto;

import java.util.ArrayList;
import java.util.List;

public class WeeklySummaryListResponseDTO {

    private String project_id;
    private List<WeeklySummaryResponseDTO> weekly_summaries;

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public List<WeeklySummaryResponseDTO> getWeekly_summaries() {
        return weekly_summaries;
    }

    public void setWeekly_summaries(List<WeeklySummaryResponseDTO> weekly_summaries) {
        this.weekly_summaries = weekly_summaries;
    }
}
