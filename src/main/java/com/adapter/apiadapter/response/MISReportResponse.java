package com.adapter.apiadapter.response;

import java.io.Serializable;


public class MISReportResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private int service_code;
	private String service_name;
	private String date;
	private int new_activation;
	private int deactivation;
	private double daily_revenue;
	private int mtd_unique_users;
	private double mtd_revenue;
	private int mtd_renewals;
	private int active_users;
	private int sms_activations;
	private int ussd_activations;
	private int other_activations;
	private int sms_deactivations;
	private int ussd_deactivations;
	private int manual_deactivations;
	private int expired_deactivations;
	private int other_deactivations;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNew_activation() {
		return new_activation;
	}
	public void setNew_activation(int new_activation) {
		this.new_activation = new_activation;
	}
	public int getDeactivation() {
		return deactivation;
	}
	public void setDeactivation(int deactivation) {
		this.deactivation = deactivation;
	}
	public double getDaily_revenue() {
		return daily_revenue;
	}
	public void setDaily_revenue(double daily_revenue) {
		this.daily_revenue = daily_revenue;
	}
	public int getMtd_unique_users() {
		return mtd_unique_users;
	}
	public void setMtd_unique_users(int mtd_unique_users) {
		this.mtd_unique_users = mtd_unique_users;
	}
	public double getMtd_revenue() {
		return mtd_revenue;
	}
	public void setMtd_revenue(double mtd_revenue) {
		this.mtd_revenue = mtd_revenue;
	}
	public int getMtd_renewals() {
		return mtd_renewals;
	}
	public void setMtd_renewals(int mtd_renewals) {
		this.mtd_renewals = mtd_renewals;
	}
	public int getActive_users() {
		return active_users;
	}
	public void setActive_users(int active_users) {
		this.active_users = active_users;
	}
	public int getSms_activations() {
		return sms_activations;
	}
	public void setSms_activations(int sms_activations) {
		this.sms_activations = sms_activations;
	}
	public int getUssd_activations() {
		return ussd_activations;
	}
	public void setUssd_activations(int ussd_activations) {
		this.ussd_activations = ussd_activations;
	}
	public int getOther_activations() {
		return other_activations;
	}
	public void setOther_activations(int other_activations) {
		this.other_activations = other_activations;
	}
	public int getSms_deactivations() {
		return sms_deactivations;
	}
	public void setSms_deactivations(int sms_deactivations) {
		this.sms_deactivations = sms_deactivations;
	}
	public int getUssd_deactivations() {
		return ussd_deactivations;
	}
	public void setUssd_deactivations(int ussd_deactivations) {
		this.ussd_deactivations = ussd_deactivations;
	}
	public int getManual_deactivations() {
		return manual_deactivations;
	}
	public void setManual_deactivations(int manual_deactivations) {
		this.manual_deactivations = manual_deactivations;
	}
	public int getExpired_deactivations() {
		return expired_deactivations;
	}
	public void setExpired_deactivations(int expired_deactivations) {
		this.expired_deactivations = expired_deactivations;
	}
	public int getOther_deactivations() {
		return other_deactivations;
	}
	public void setOther_deactivations(int other_deactivations) {
		this.other_deactivations = other_deactivations;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	

}