package com.adapter.apiadapter.response;

import java.util.ArrayList;
import java.util.List;


public class MethodsPermissionData {

	private String username;
	private int service_id;
	private List<MethodRes> method_list = new ArrayList<MethodRes>();
	
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
	public List<MethodRes> getMethod_list() {
		return method_list;
	}
	public void setMethod_list(List<MethodRes> method_list) {
		this.method_list = method_list;
	}
	
	
}
