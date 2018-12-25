package com.sample.java.oops;

public class SamplePolyClass1 extends SamplePolyClass2{
	
	public void m1(){
		System.out.println("11111");
	}


	public void m1(int x){
		System.out.println(x);
	}


	public void m1(char y){
		System.out.println(y);
	}

	public static void main(String[] args) {
		SamplePolyClass1 obj=new SamplePolyClass1();
		obj.m1();
		obj.m1(20);
		obj.m1('a');
		
		SamplePolyClass2 obj1=new SamplePolyClass2();
		obj1.m1();
		obj1.m1(30);
		obj1.m1('x');
		
	}
}
