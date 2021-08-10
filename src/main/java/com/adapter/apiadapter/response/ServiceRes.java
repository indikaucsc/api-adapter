package com.adapter.apiadapter.response;



public class ServiceRes {

	
	private int service_code;
	private String service_name;
    private int package_code;
	private String mtrcomment;
	private int parent_code;
	private int status;
	private int retry;
	private int app_id;
	private int operator_id;
	private String operator_name;

	public String getOperator_name() {
		return operator_name;
	}

	public void setOperator_name(String operator_name) {
		this.operator_name = operator_name;
	}

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
	public int getPackage_code() {
		return package_code;
	}
	public void setPackage_code(int package_code) {
		this.package_code = package_code;
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
	public int getApp_id() {
		return app_id;
	}
	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}
	public int getOperator_id() {
		return operator_id;
	}
	public void setOperator_id(int operator_id) {
		this.operator_id = operator_id;
	}
	
	
	
	
}