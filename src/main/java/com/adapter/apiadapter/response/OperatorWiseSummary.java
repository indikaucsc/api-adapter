package com.adapter.apiadapter.response;

public class OperatorWiseSummary {

	
	private long operator_id;
	private String operator_name;
	private long count;
	
	
	
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
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	
	public OperatorWiseSummary(long operator_id, String operator_name, long count){
		this.operator_id = operator_id;
		this.operator_name = operator_name;
		this.count = count;
	}

}
