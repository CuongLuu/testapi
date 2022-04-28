package com.sinhvien.restful.service;

public class ServiceResult {
	  private Status status = Status.SUCCESS;
	  private String message;
	  private Object data;
	  public enum Status {
	    SUCCESS, FAILED, UNAUTHORIZED;
	  }
	  //Constructor
	  public ServiceResult() {
			
		}
	  
	  
	  public ServiceResult(Status status, String message) {
		super();
		this.status = status;
		this.message = message;
	}


	// getter - setter
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
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
	  


}
