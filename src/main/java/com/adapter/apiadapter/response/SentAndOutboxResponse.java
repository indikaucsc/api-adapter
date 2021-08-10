package com.adapter.apiadapter.response;

import java.io.Serializable;

public class SentAndOutboxResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private int content_id;
	private String content;
	private String content_time;
	private String retry;
	private String timeout;
	private int service_code;
    private String service_name;
    private int app_id;
    private String app_name;
    private String msisdn;
    private String mask;




	private int is_bulk;
	private int is_free;
	private int send_expired_users;


	public String getMask() {
		return mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	public int getIs_bulk() {
		return is_bulk;
	}

	public void setIs_bulk(int is_bulk) {
		this.is_bulk = is_bulk;
	}

	public int getIs_free() {
		return is_free;
	}

	public void setIs_free(int is_free) {
		this.is_free = is_free;
	}

	public int getSend_expired_users() {
		return send_expired_users;
	}

	public void setSend_expired_users(int send_expired_users) {
		this.send_expired_users = send_expired_users;
	}

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
	public String getContent_time() {
		return content_time;
	}
	public void setContent_time(String content_time) {
		this.content_time = content_time;
	}
	public String getRetry() {
		return retry;
	}
	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getTimeout() {
		return timeout;
	}
	public void setTimeout(String timeout) {
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
	public int getApp_id() {
		return app_id;
	}
	public void setApp_id(int app_id) {
		this.app_id = app_id;
	}
	public String getApp_name() {
		return app_name;
	}
	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
    
    
     
    
    

}