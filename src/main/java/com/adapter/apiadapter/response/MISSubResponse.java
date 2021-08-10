package com.adapter.apiadapter.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class MISSubResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Date from;
	private Date to;
	
//	private int week;
//	private int month;
//	private int year;
	
	
	private BigDecimal sum_new_activation;
	private BigDecimal sum_deactivation;
	private double sum_daily_revenue;
	private BigDecimal sum_expired_users;
	private BigDecimal sum_winback_users;
	
	
	private BigDecimal sum_active_users;
	private BigDecimal sum_charged_users;
	private BigDecimal sum_revgen_users;
	
	
	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public Date getTo() {
		return to;
	}
	public void setTo(Date to) {
		this.to = to;
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
	public BigDecimal getSum_active_users() {
		return sum_active_users;
	}
	public void setSum_active_users(BigDecimal sum_active_users) {
		this.sum_active_users = sum_active_users;
	}
	public BigDecimal getSum_charged_users() {
		return sum_charged_users;
	}
	public void setSum_charged_users(BigDecimal sum_charged_users) {
		this.sum_charged_users = sum_charged_users;
	}
	public BigDecimal getSum_revgen_users() {
		return sum_revgen_users;
	}
	public void setSum_revgen_users(BigDecimal sum_revgen_users) {
		this.sum_revgen_users = sum_revgen_users;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}