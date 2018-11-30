package com.exception.test;

public class TestMain {

	public static void validation() throws ParentClass {
		String name = "";
		if(!name.isEmpty()) {
			System.out.println(name);
		}else {
			throw new ParentClass(MessageCode.NULL_POINTER_EXCEPTION.getDefault(), "getting Exception when checking student name");
		}
	}
	public static void main(String[] args) throws ParentClass {
		 
		validation();
	}
}
