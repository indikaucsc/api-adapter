package com.adapter.apiadapter.response;

import java.util.ArrayList;
import java.util.List;


public class ResponseList {

	private List<Integer> success_list = new ArrayList<Integer>();
	private List<Integer> failure_list = new ArrayList<Integer>();
	private String failure_reason;
	
	
	
	
	public String getFailure_reason() {
		return failure_reason;
	}
	public void setFailure_reason(String failure_reason) {
		this.failure_reason = failure_reason;
	}
	public List<Integer> getSuccess_list() {
		return success_list;
	}
	public void setSuccess_list(List<Integer> success_list) {
		this.success_list = success_list;
	}
	public List<Integer> getFailure_list() {
		return failure_list;
	}
	public void setFailure_list(List<Integer> failure_list) {
		this.failure_list = failure_list;
	}
	
	
	
	
}
