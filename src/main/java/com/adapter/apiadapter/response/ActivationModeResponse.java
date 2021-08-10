package com.adapter.apiadapter.response;

public class ActivationModeResponse {

	
	private String activation_mode;
	private long count_new_activation;
	
	
	public ActivationModeResponse(String activation_mode, long count_new_activation){
		this.activation_mode = activation_mode;
		this.count_new_activation = count_new_activation;		
	}
	
	public String getActivation_mode() {
		return activation_mode;
	}
	public void setActivation_mode(String activation_mode) {
		this.activation_mode = activation_mode;
	}
	public long getCount_new_activation() {
		return count_new_activation;
	}
	public void setCount_new_activation(long count_new_activation) {
		this.count_new_activation = count_new_activation;
	}
	
	
	
}
