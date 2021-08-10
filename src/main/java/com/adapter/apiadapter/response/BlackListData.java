package com.adapter.apiadapter.response;

import java.util.ArrayList;
import java.util.List;


public class BlackListData {

	private int service_code;
	private String service_name;
	private String description;
	private ArrayList<Summary> summary;
	private List<AddBlacklistedResponse> detailed;
	
	
	
	public int getService_code() {
		return service_code;
	}
	public void setService_code(int service_code) {
		this.service_code = service_code;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<Summary> getSummary() {
		return summary;
	}
	public void setSummary(ArrayList<Summary> summary) {
		this.summary = summary;
	}
	public List<AddBlacklistedResponse> getDetailed() {
		return detailed;
	}
	public void setDetailed(List<AddBlacklistedResponse> detailed) {
		this.detailed = detailed;
	}
	
	
	
	
	
}
