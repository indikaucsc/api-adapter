package com.adapter.apiadapter.response;

import java.io.Serializable;


public class MISSummaryReportResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	// part-01
	private long sum_new_activation;
	private long sum_deactivation;
	private double sum_daily_revenue;
	private long sum_expired_users;
	private long sum_winback_users;
	
	
	private double sum_mtd_new_act_revenue;
	private double sum_mtd_deact_revenue;
	
	/*private long max_active_users;
	private long max_charged_users;
	private long max_revgen_users;*/
	
	// part-02
	private long sum_active_users;
	private long sum_charged_users;
	private long sum_revgen_users;
	
	// part-03
//	private long sum_mtd_new_act_revenue;
//	private long sum_mtd_deact_revenue;
	private double sum_mtd_revenue;
	private long sum_mtd_renewals;
	private long sum_mtd_lowbal_users;
	
	// part-04
	private long count_subscriber;
	private long count_subscriber_mobile;

	private int operator_id;
	private String operator_name;

	public int getOperator_id() {
		return operator_id;
	}

	public void setOperator_id(int operator_id) {
		this.operator_id = operator_id;
	}

	public String getOperator_name() {
		return operator_name;
	}

	public void setOperator_name(String operator_name) {
		this.operator_name = operator_name;
	}

	public long getSum_new_activation() {
		return sum_new_activation;
	}
	public void setSum_new_activation(long sum_new_activation) {
		this.sum_new_activation = sum_new_activation;
	}
	public long getSum_deactivation() {
		return sum_deactivation;
	}
	public void setSum_deactivation(long sum_deactivation) {
		this.sum_deactivation = sum_deactivation;
	}
	public double getSum_daily_revenue() {
		return sum_daily_revenue;
	}
	public void setSum_daily_revenue(double sum_daily_revenue) {
		this.sum_daily_revenue = sum_daily_revenue;
	}
	public long getSum_expired_users() {
		return sum_expired_users;
	}
	public void setSum_expired_users(long sum_expired_users) {
		this.sum_expired_users = sum_expired_users;
	}
	public long getSum_winback_users() {
		return sum_winback_users;
	}
	public void setSum_winback_users(long sum_winback_users) {
		this.sum_winback_users = sum_winback_users;
	}
	public double getSum_mtd_new_act_revenue() {
		return sum_mtd_new_act_revenue;
	}
	public void setSum_mtd_new_act_revenue(double sum_mtd_new_act_revenue) {
		this.sum_mtd_new_act_revenue = sum_mtd_new_act_revenue;
	}
	public double getSum_mtd_deact_revenue() {
		return sum_mtd_deact_revenue;
	}
	public void setSum_mtd_deact_revenue(double sum_mtd_deact_revenue) {
		this.sum_mtd_deact_revenue = sum_mtd_deact_revenue;
	}
	public long getSum_active_users() {
		return sum_active_users;
	}
	public void setSum_active_users(long sum_active_users) {
		this.sum_active_users = sum_active_users;
	}
	public long getSum_charged_users() {
		return sum_charged_users;
	}
	public void setSum_charged_users(long sum_charged_users) {
		this.sum_charged_users = sum_charged_users;
	}
	public long getSum_revgen_users() {
		return sum_revgen_users;
	}
	public void setSum_revgen_users(long sum_revgen_users) {
		this.sum_revgen_users = sum_revgen_users;
	}
	public double getSum_mtd_revenue() {
		return sum_mtd_revenue;
	}
	public void setSum_mtd_revenue(double sum_mtd_revenue) {
		this.sum_mtd_revenue = sum_mtd_revenue;
	}
	public long getSum_mtd_renewals() {
		return sum_mtd_renewals;
	}
	public void setSum_mtd_renewals(long sum_mtd_renewals) {
		this.sum_mtd_renewals = sum_mtd_renewals;
	}
	public long getSum_mtd_lowbal_users() {
		return sum_mtd_lowbal_users;
	}
	public void setSum_mtd_lowbal_users(long sum_mtd_lowbal_users) {
		this.sum_mtd_lowbal_users = sum_mtd_lowbal_users;
	}
	public long getCount_subscriber() {
		return count_subscriber;
	}
	public void setCount_subscriber(long count_subscriber) {
		this.count_subscriber = count_subscriber;
	}
	public long getCount_subscriber_mobile() {
		return count_subscriber_mobile;
	}
	public void setCount_subscriber_mobile(long count_subscriber_mobile) {
		this.count_subscriber_mobile = count_subscriber_mobile;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
}