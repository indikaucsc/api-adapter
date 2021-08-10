package com.adapter.apiadapter.response;

import java.util.ArrayList;
import java.util.List;


public class ServiceResList {

	
	private int service_code;
	private String service_name;
    private int packages_code;
	private String mtrcomment;
	private int parent_code;
	private int status;
	private int retry;
	
	private List<ServiceRes> child_list = new ArrayList<ServiceRes>();

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

	public int getPackages_code() {
		return packages_code;
	}

	public void setPackages_code(int packages_code) {
		this.packages_code = packages_code;
	}

	public String getMtrcomment() {
		return mtrcomment;
	}

	public void setMtrcomment(String mtrcomment) {
		this.mtrcomment = mtrcomment;
	}

	public int getParent_code() {
		return parent_code;
	}

	public void setParent_code(int parent_code) {
		this.parent_code = parent_code;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getRetry() {
		return retry;
	}

	public void setRetry(int retry) {
		this.retry = retry;
	}

	public List<ServiceRes> getChild_list() {
		return child_list;
	}

	public void setChild_list(List<ServiceRes> child_list) {
		this.child_list = child_list;
	}

	
	
}