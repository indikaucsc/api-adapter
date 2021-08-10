package com.adapter.apiadapter.response;

import java.util.ArrayList;

public class Response {

	private boolean status;
	private ArrayList<Message> messages;
	private Object data;
	
	public Response()	{
		data = null;
		messages = new ArrayList<Message>();
		status = false;
	}
	
	public ArrayList<Message> getMessages() {
		return messages;
	}

	public void setMessages(ArrayList<Message> messages) {
		this.messages = messages;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	

}
