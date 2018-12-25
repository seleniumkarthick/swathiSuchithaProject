package com.sample.java.oops;

public class CallingAbstractClass extends SampleAbstract{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("2222222");
	}

	public static void main(String[] args) {
		CallingAbstractClass obj=new CallingAbstractClass();
		obj.m1();
		obj.m2();
		
		
	}
}
