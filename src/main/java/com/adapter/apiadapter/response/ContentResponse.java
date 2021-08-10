package com.adapter.apiadapter.response;

import java.io.Serializable;
import java.util.Date;

public class ContentResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private int content_id;
	private String content;
	private Date content_time;
	private int retry;
	private Date timeout;
	private int service_code;
    private String service_name;
    private String msisdn;
    private int subscriber_id;
    
    
    
    
	public int getContent_id() {
		return content_id;
	}
	public void setContent_id(int content_id) {
		this.content_id = content_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getContent_time() {
		return content_time;
	}
	public void setContent_time(Date content_time) {
		this.content_time = content_time;
	}
	public int getRetry() {
		return retry;
	}
	public void setRetry(int retry) {
		this.retry = retry;
	}
	public Date getTimeout() {
		return timeout;
	}
	public void setTimeout(Date timeout) {
		this.timeout = timeout;
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
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public int getSubscriber_id() {
		return subscriber_id;
	}
	public void setSubscriber_id(int subscriber_id) {
		this.subscriber_id = subscriber_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}