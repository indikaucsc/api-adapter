package com.adapter.apiadapter.response;

public class SubscriberMessage extends Message {

	private String msisdn;
	private String reference;
	private String url;
	private String charging_type;


	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}


	public String getCharging_type() {
		return charging_type;
	}

	public void setCharging_type(String charging_type) {
		this.charging_type = charging_type;
	}
}
