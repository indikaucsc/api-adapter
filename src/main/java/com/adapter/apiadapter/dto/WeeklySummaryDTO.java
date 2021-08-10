package com.adapter.apiadapter.dto;

import java.util.ArrayList;
import java.util.List;

public class WeeklySummaryDTO {

    private Integer id;
    private String project_id;
    private String from_week;
    private String to_week;

    private List<String> types;
    private List<String> states;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getFrom_week() {
        return from_week;
    }

    public void setFrom_week(String from_week) {
        this.from_week = from_week;
    }

    public String getTo_week() {
        return to_week;
    }

    public void setTo_week(String to_week) {
        this.to_week = to_week;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getStates() {
        return states;
    }

    public void setStates(List<String> states) {
        this.states = states;
    }
}
