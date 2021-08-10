package com.adapter.apiadapter.response;

public class MessageContent {

	private int code;
	private int serviceCode;
	private String message;

	public int getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(int serviceCode) {
		this.serviceCode = serviceCode;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
