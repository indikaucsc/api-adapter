package com.adapter.apiadapter.response;


public class ChargeData  {

	private double amount;
	private String method;  
	private String transaction_id;
	private String url;
	private String reference;
	private String charging_type;


	public String getCharging_type() {
		return charging_type;
	}

	public void setCharging_type(String charging_type) {
		this.charging_type = charging_type;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

	
}
