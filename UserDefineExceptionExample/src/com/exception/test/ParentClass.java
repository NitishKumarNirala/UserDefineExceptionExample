package com.exception.test;

public class ParentClass extends Exception {

	private static final long serialVersionUID = 1L;

	  private String code;
	public ParentClass(String code, String message) throws ParentClass {
		super(message);
		 this.code = code;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "ParentClass [code=" + code + "]";
	}
	
	  
}
