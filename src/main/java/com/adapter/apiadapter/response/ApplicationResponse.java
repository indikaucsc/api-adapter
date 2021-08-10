package com.adapter.apiadapter.response;

public class ApplicationResponse {

	private long app_id;
	private String app_name;
	private String description;
	private String image_url;
	
	public ApplicationResponse(long appId, String appName) {
		this.app_id=appId;
		this.app_name=appName;
		
	}
	
	public ApplicationResponse() {
	}
	
	public long getApp_id() {
		return app_id;
	}
	public void setApp_id(long app_id) {
		this.app_id = app_id;
	}
	public String getApp_name() {
		return app_name;
	}
	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	

	
	
	
	
	
}
