package com.adapter.apiadapter.response;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SubscribersListResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private List<SubscribersResponseForInfor> subscriber_list = new ArrayList<SubscribersResponseForInfor>();
	private BigInteger numberOfRecords;
	
	public List<SubscribersResponseForInfor> getSubscriber_list() {
		return subscriber_list;
	}
	public void setSubscriber_list(List<SubscribersResponseForInfor> subscriber_list) {
		this.subscriber_list = subscriber_list;
	}
	public BigInteger getNumberOfRecords() {
		return numberOfRecords;
	}
	public void setNumberOfRecords(BigInteger numberOfRecords) {
		this.numberOfRecords = numberOfRecords;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}