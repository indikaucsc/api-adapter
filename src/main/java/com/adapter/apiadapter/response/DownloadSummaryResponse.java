package com.adapter.apiadapter.response;

import java.io.Serializable;
import java.math.BigDecimal;


public class DownloadSummaryResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	/*SUM (r.newActivation), SUM (r.deactivation), SUM (r.dailyRevenue),SUM (r.expiredUsers),SUM (r.winbackUsers), "
			+" MAX(r.activeUsers), MAX(r.chargedUsers), MAX(r.revgenUsers) "*/
	private long service_code;
	private String service_name;

	private long operator_id;
	private String operator_name;
	
	private BigDecimal new_activation;
	private BigDecimal deactivation;
	private double daily_revenue;
	private BigDecimal expired_users;
	private BigDecimal winback_users;
	
	
	private BigDecimal active_users;
	private BigDecimal charged_users;
	private BigDecimal revgen_users;


	public long getOperator_id() {
		return operator_id;
	}

	public void setOperator_id(long operator_id) {
		this.operator_id = operator_id;
	}

	public String getOperator_name() {
		return operator_name;
	}

	public void setOperator_name(String operator_name) {
		this.operator_name = operator_name;
	}

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
	public BigDecimal getNew_activation() {
		return new_activation;
	}
	public void setNew_activation(BigDecimal new_activation) {
		this.new_activation = new_activation;
	}
	public BigDecimal getDeactivation() {
		return deactivation;
	}
	public void setDeactivation(BigDecimal deactivation) {
		this.deactivation = deactivation;
	}
	public double getDaily_revenue() {
		return daily_revenue;
	}
	public void setDaily_revenue(double daily_revenue) {
		this.daily_revenue = daily_revenue;
	}
	public BigDecimal getExpired_users() {
		return expired_users;
	}
	public void setExpired_users(BigDecimal expired_users) {
		this.expired_users = expired_users;
	}
	public BigDecimal getWinback_users() {
		return winback_users;
	}
	public void setWinback_users(BigDecimal winback_users) {
		this.winback_users = winback_users;
	}
	public BigDecimal getActive_users() {
		return active_users;
	}
	public void setActive_users(BigDecimal active_users) {
		this.active_users = active_users;
	}
	public BigDecimal getCharged_users() {
		return charged_users;
	}
	public void setCharged_users(BigDecimal charged_users) {
		this.charged_users = charged_users;
	}
	public BigDecimal getRevgen_users() {
		return revgen_users;
	}
	public void setRevgen_users(BigDecimal revgen_users) {
		this.revgen_users = revgen_users;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}