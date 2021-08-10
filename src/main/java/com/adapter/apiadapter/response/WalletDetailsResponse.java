package com.adapter.apiadapter.response;

import java.util.Date;


public class WalletDetailsResponse {
//	Table: wallet_logs
//	Columns:
//	transaction_id	int(11) AI PK
//	datetime	datetime
//	msisdn	varchar(50)
//	service_code	int(11)
//	wallet_id	int(11)
//	action	int(11)
//	amount	decimal(12,2)
//	comment	varchar(50)
	
	
	private int transaction_id;
	private Date datetime;
	private String msisdn;
	private int service_code;
	private String service_name;
	private int wallet_id;
	private String wallet_name;
	private int action;
	private double balance;
	private String comment;
	
	
	
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
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
	public int getWallet_id() {
		return wallet_id;
	}
	public void setWallet_id(int wallet_id) {
		this.wallet_id = wallet_id;
	}
	public String getWallet_name() {
		return wallet_name;
	}
	public void setWallet_name(String wallet_name) {
		this.wallet_name = wallet_name;
	}
	public int getAction() {
		return action;
	}
	public void setAction(int action) {
		this.action = action;
	}
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
