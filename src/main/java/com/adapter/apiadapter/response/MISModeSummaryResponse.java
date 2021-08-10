package com.adapter.apiadapter.response;

public class MISModeSummaryResponse {

	
	private String mode;
	private long count;
	
	
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	
	

	
	
	public MISModeSummaryResponse(String mode, long count){
		this.mode = mode;
		this.count = count;
	}




	
}
