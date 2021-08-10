package com.adapter.apiadapter.response;

import java.io.Serializable;
import java.math.BigDecimal;


public class PaymentMethodWiseSummaryResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String method;
	//private List<OperatorWiseSummary> operator_summary = new ArrayList<OperatorWiseSummary>();
	
	private long operator_id;
	private String operator_name;
	private double sum;
	private double amount;
	private BigDecimal count;
	
	
	
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
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
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public BigDecimal getCount() {
		return count;
	}
	public void setCount(BigDecimal count) {
		this.count = count;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
		
		

}