package com.adapter.apiadapter.response;

import java.io.Serializable;
import java.math.BigDecimal;


public class PackageWiseSummaryResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	/*SUM (r.newActivation), SUM (r.deactivation), SUM (r.dailyRevenue),SUM (r.expiredUsers),SUM (r.winbackUsers), "
			+" MAX(r.activeUsers), MAX(r.chargedUsers), MAX(r.revgenUsers) "*/
	private long package_code;
	private String package_name;
	
	private BigDecimal sum_new_activation;
	private BigDecimal sum_deactivation;
	private double sum_daily_revenue;
	private BigDecimal sum_expired_users;
	private BigDecimal sum_winback_users;
	
	
	private BigDecimal max_active_users;
	private BigDecimal max_charged_users;
	private BigDecimal max_revgen_users;
	
	
	private String operator_name;
	private long operator_id;
	
	
	
	
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
	public BigDecimal getSum_new_activation() {
		return sum_new_activation;
	}
	public void setSum_new_activation(BigDecimal sum_new_activation) {
		this.sum_new_activation = sum_new_activation;
	}
	public BigDecimal getSum_deactivation() {
		return sum_deactivation;
	}
	public void setSum_deactivation(BigDecimal sum_deactivation) {
		this.sum_deactivation = sum_deactivation;
	}
	public double getSum_daily_revenue() {
		return sum_daily_revenue;
	}
	public void setSum_daily_revenue(double sum_daily_revenue) {
		this.sum_daily_revenue = sum_daily_revenue;
	}
	public BigDecimal getSum_expired_users() {
		return sum_expired_users;
	}
	public void setSum_expired_users(BigDecimal sum_expired_users) {
		this.sum_expired_users = sum_expired_users;
	}
	public BigDecimal getSum_winback_users() {
		return sum_winback_users;
	}
	public void setSum_winback_users(BigDecimal sum_winback_users) {
		this.sum_winback_users = sum_winback_users;
	}
	public BigDecimal getMax_active_users() {
		return max_active_users;
	}
	public void setMax_active_users(BigDecimal max_active_users) {
		this.max_active_users = max_active_users;
	}
	public BigDecimal getMax_charged_users() {
		return max_charged_users;
	}
	public void setMax_charged_users(BigDecimal max_charged_users) {
		this.max_charged_users = max_charged_users;
	}
	public BigDecimal getMax_revgen_users() {
		return max_revgen_users;
	}
	public void setMax_revgen_users(BigDecimal max_revgen_users) {
		this.max_revgen_users = max_revgen_users;
	}
	public String getOperator_name() {
		return operator_name;
	}
	public void setOperator_name(String operator_name) {
		this.operator_name = operator_name;
	}
	public long getOperator_id() {
		return operator_id;
	}
	public void setOperator_id(long operator_id) {
		this.operator_id = operator_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	

}