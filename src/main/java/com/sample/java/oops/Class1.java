package com.sample.java.oops;

public class Class1 extends Class2{
	
	public void m1(){
		System.out.println("1111");
	}

	public void m2(){
		System.out.println("2222");
	}

	public void m3(){
		System.out.println("3333");
	}
	
	public static void main(String[] args) {
		Class1 obj=new Class1();
		obj.m1();
		obj.m2();
		obj.m3();
		
		obj.m4();
		obj.m5();
		
		obj.m6();
		obj.m7();
	}

}
