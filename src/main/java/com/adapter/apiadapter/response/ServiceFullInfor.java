package com.adapter.apiadapter.response;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class ServiceFullInfor {

	
	private long service_code;
	private String service_name;
	
    private BigInteger package_code;
    private String package_name;
    
    private BigInteger operator_id;
    private String operator_name;
    
    private BigInteger app_id;
    private String app_name;
    
    List<Method> method_list =new ArrayList<Method>();
    
	private String mtrcomment;
	private long parent_code;
	private int status;
	private int retry;
	
	
	
	
	public long getService_code() {
		return service_code;
	}
	public void setService_code(long service_code) {
		this.service_code = service_code;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public BigInteger getPackage_code() {
		return package_code;
	}
	public void setPackage_code(BigInteger package_code) {
		this.package_code = package_code;
	}
	public String getPackage_name() {
		return package_name;
	}
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	public BigInteger getOperator_id() {
		return operator_id;
	}
	public void setOperator_id(BigInteger operator_id) {
		this.operator_id = operator_id;
	}
	public String getOperator_name() {
		return operator_name;
	}
	public void setOperator_name(String operator_name) {
		this.operator_name = operator_name;
	}
	public List<Method> getMethod_list() {
		return method_list;
	}
	public void setMethod_list(List<Method> method_list) {
		this.method_list = method_list;
	}
	public String getMtrcomment() {
		return mtrcomment;
	}
	public void setMtrcomment(String mtrcomment) {
		this.mtrcomment = mtrcomment;
	}
	public long getParent_code() {
		return parent_code;
	}
	public void setParent_code(long parent_code) {
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
	public BigInteger getApp_id() {
		return app_id;
	}
	public void setApp_id(BigInteger app_id) {
		this.app_id = app_id;
	}
	public String getApp_name() {
		return app_name;
	}
	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}
	
	
	
	
	
	
	
	
}