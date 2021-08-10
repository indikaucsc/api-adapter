package com.adapter.apiadapter.response;

import java.io.Serializable;


public class PaymentMethodWiseSummaryResponseV2 implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String method;
	private double sum_hutch;
	private double sum_etisalat;
	private double sum_dialog;
	private double sum_mobitel;
	private double sum_airtel;
	private double sum_other;
	
	
	
	
	public double getSum_other() {
		return sum_other;
	}
	public void setSum_other(double sum_other) {
		this.sum_other = sum_other;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public double getSum_hutch() {
		return sum_hutch;
	}
	public void setSum_hutch(double sum_hutch) {
		this.sum_hutch = sum_hutch;
	}
	public double getSum_etisalat() {
		return sum_etisalat;
	}
	public void setSum_etisalat(double sum_etisalat) {
		this.sum_etisalat = sum_etisalat;
	}
	public double getSum_dialog() {
		return sum_dialog;
	}
	public void setSum_dialog(double sum_dialog) {
		this.sum_dialog = sum_dialog;
	}
	public double getSum_mobitel() {
		return sum_mobitel;
	}
	public void setSum_mobitel(double sum_mobitel) {
		this.sum_mobitel = sum_mobitel;
	}
	public double getSum_airtel() {
		return sum_airtel;
	}
	public void setSum_airtel(double sum_airtel) {
		this.sum_airtel = sum_airtel;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}