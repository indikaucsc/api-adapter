package com.adapter.apiadapter.response;

import java.util.ArrayList;
import java.util.List;


public class SetPermissionData {

	private String username;
	private int service_id;
	private List<Integer> method_list = new ArrayList<Integer>();
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	public List<Integer> getMethod_list() {
		return method_list;
	}
	public void setMethod_list(List<Integer> method_list) {
		this.method_list = method_list;
	}
	
	
}
