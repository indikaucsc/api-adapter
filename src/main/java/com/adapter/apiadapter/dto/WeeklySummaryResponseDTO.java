package com.adapter.apiadapter.dto;

import java.util.ArrayList;
import java.util.List;

public class WeeklySummaryResponseDTO {

    private String week;

    private List<StateSummaryResponseDTO> state_summaries;

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public List<StateSummaryResponseDTO> getState_summaries() {
        return state_summaries;
    }

    public void setState_summaries(List<StateSummaryResponseDTO> state_summaries) {
        this.state_summaries = state_summaries;
    }
}
