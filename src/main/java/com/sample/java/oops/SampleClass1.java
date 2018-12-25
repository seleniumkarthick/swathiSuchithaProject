package com.sample.java.oops;

public class SampleClass1 extends SampleClass2{
	
	protected void m1(){
		System.out.println("11111");
	}

	public void m2(){
		System.out.println("22222");
	}

	public void m3(){
		System.out.println("33333");
	}
	
	public static void main(String[] args) {
		SampleClass1 obj=new SampleClass1();
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		obj.m5();
		obj.m6();
		obj.m7();
	}

}
