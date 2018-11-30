package com.exception.test;

public class TestMain {

	//null pointer validation checking
	public static void validation() throws ParentClass {
		String name = "";
		if(!name.isEmpty()) {
			System.out.println(name);
		}else {
			throw new ParentClass(MessageCode.NULL_POINTER_EXCEPTION.getDefault(), "getting Exception when checking student name");
		}
	}
	public static void validation1() throws ParentClass {
		System.out.println("Calling validation1()");
		String name = "AAAAAAA";
		if(!name.isEmpty()) {
			System.out.println(name);
		}else {
			throw new ParentClass(MessageCode.NULL_POINTER_EXCEPTION.getDefault(), "getting Exception when checking student name");
		}
	}
	public static void main(String[] args) throws ParentClass {
		 try {
		validation();
		 }catch (Exception e) {
			 e.printStackTrace();
			//checking after getting Exception.
			 validation1();
		}
	}
}
