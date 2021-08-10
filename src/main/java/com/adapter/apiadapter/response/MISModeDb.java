package com.adapter.apiadapter.response;

public class MISModeDb {

	/*summaryResponse.setSum_new_activation((long) tuple[0]);
	summaryResponse.setSum_deactivation((long) tuple[1]);
	summaryResponse.setSum_daily_revenue((double) tuple[2]);
	summaryResponse.setSum_expired_users((long) tuple[3]);
	summaryResponse.setSum_winback_users((long) tuple[4]);*/
	
	
	private long sum_new_activation;
	private long sum_deactivation;
	private double sum_daily_revenue;
	private long sum_expired_users;
	private long sum_winback_users;
	
	
	
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
	
	
	
	
	
	/*
	public MISModeDb(String mode, long count){
		this.mode = mode;
		this.count = count;
	}
*/

	

}
