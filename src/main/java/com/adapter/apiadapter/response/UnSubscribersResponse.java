package com.adapter.apiadapter.response;

import java.io.Serializable;

public class UnSubscribersResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private long subscriber_id;
	private String msisdn;
	private int service_code;
	private String service_name;
	private String message;
	private int code;
	public long getSubscriber_id() {
		return subscriber_id;
	}
	public void setSubscriber_id(long subscriber_id) {
		this.subscriber_id = subscriber_id;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}