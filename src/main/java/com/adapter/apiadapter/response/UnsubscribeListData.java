package com.adapter.apiadapter.response;

import java.util.ArrayList;
import java.util.List;


public class UnsubscribeListData {

	
	private List<UnSubscribersResponse> detailed;
	private ArrayList<Summary> summary;
	
	
	public List<UnSubscribersResponse> getDetailed() {
		return detailed;
	}
	public void setDetailed(List<UnSubscribersResponse> detailed) {
		this.detailed = detailed;
	}
	public ArrayList<Summary> getSummary() {
		return summary;
	}
	public void setSummary(ArrayList<Summary> summary) {
		this.summary = summary;
	}
	
	
	
}
