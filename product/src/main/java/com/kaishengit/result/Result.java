package com.kaishengit.result;

public class Result {

	private String message;
	private Object data;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Result(String message, Object data) {
		super();
		this.message = message;
		this.data = data;
	}
	
	public Result(String message) {
		super();
		this.message = message;
	}
	
	
}
