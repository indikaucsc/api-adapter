package com.adapter.apiadapter.response;

public class ValidatePatternResponse {
	
	private static final long serialVersionUID = 1L;

	private boolean status;
	private String message;
	
	/*public ValidatePatternResponse(){
		this.status = status;
		this.message = message;
	}
*/
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
