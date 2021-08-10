package com.adapter.apiadapter.response;

public class OperatorWiseRevenueSummary {

	
	private long operator_id;
	private String operator_name;
	private double sum_daily_revenue;
	
	
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
	public double getSum_daily_revenue() {
		return sum_daily_revenue;
	}
	public void setSum_daily_revenue(double sum_daily_revenue) {
		this.sum_daily_revenue = sum_daily_revenue;
	}
	
	public OperatorWiseRevenueSummary(){
		
	}
	
	public OperatorWiseRevenueSummary(long operator_id, String operator_name, double sum_daily_revenue){
		this.operator_id = operator_id;
		this.operator_name = operator_name;
		this.sum_daily_revenue = sum_daily_revenue;
	}

}
