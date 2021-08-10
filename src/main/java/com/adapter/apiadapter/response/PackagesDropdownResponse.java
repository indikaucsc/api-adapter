package com.adapter.apiadapter.response;

import java.io.Serializable;


public class PackagesDropdownResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long package_code;
	private String package_name;
	
	public PackagesDropdownResponse(){
		
	}

public PackagesDropdownResponse(long packageCode, String packageName){
		this.package_code=packageCode;
		this.package_name=packageName;
	}

public long getPackage_code() {
	return package_code;
}

public void setPackage_code(long package_code) {
	this.package_code = package_code;
}

public String getPackage_name() {
	return package_name;
}

public void setPackage_name(String package_name) {
	this.package_name = package_name;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}



}