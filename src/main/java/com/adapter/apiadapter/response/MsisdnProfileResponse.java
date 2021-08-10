package com.adapter.apiadapter.response;


public class MsisdnProfileResponse {

	private String package_type;

	public MsisdnProfileResponse(String packageType){
		this.package_type=packageType;
	}

	public String getPackage_type() {
		return package_type;
	}

	public void setPackage_type(String package_type) {
		this.package_type = package_type;
	}
	
	
}
