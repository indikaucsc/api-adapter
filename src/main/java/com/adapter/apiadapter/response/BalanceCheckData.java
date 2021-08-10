package com.adapter.apiadapter.response;


public class BalanceCheckData {

	private double chargeable_amount;
	private double total_amount;
	private String transaction_id;
	
	private String method;

	private String charging_type;


	public String getCharging_type() {
		return charging_type;
	}

	public void setCharging_type(String charging_type) {
		this.charging_type = charging_type;
	}
	
//	private double available_balance;
//	private String package_type;

	
	
	public double getChargeable_amount() {
		return chargeable_amount;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public void setChargeable_amount(double chargeable_amount) {
		this.chargeable_amount = chargeable_amount;
	}

	public String getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	
	

}
