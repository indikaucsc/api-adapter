package com.adapter.apiadapter.response;

import java.io.Serializable;

public class BlacklistedResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String mobile;
	private int service_code;
    private String service_name;
	private String addby;
	private String comment;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	public String getAddby() {
		return addby;
	}
	public void setAddby(String addby) {
		this.addby = addby;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}