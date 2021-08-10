package com.adapter.apiadapter.response;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ContentListResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<SentAndOutboxResponse> content_list = new ArrayList<SentAndOutboxResponse>();
	private BigInteger numberOfRecords;
	
	public List<SentAndOutboxResponse> getContent_list() {
		return content_list;
	}
	public void setContent_list(List<SentAndOutboxResponse> content_list) {
		this.content_list = content_list;
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