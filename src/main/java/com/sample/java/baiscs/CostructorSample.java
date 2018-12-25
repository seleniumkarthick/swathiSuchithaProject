package com.sample.java.baiscs;

public class CostructorSample {
	
	/*
	 * 1. Method name and class name should be same
	 * 2. it will not have any return type
	 * 3. It will run first before all methods
	 * 4. No need to create object for calling the constructor
	 */

	public CostructorSample(){
		System.out.println("11111");
	}
	
	public void m1(){
		System.out.println("22222");
	}
	
	
	public static void m2(){
		System.out.println("3333");
	}
	
	public static void main(String[] args) {
		
		new CostructorSample();
		
		CostructorSample obj=new CostructorSample();
		obj.m1();
		
		m2();
	}
}
