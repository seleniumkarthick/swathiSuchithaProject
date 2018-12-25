package com.sample.java.oops;

public class PolymorphismClass extends  PolymorphismClass1{
	
	public void m1(){
		System.out.println("1111111111");
	}

	public void m1(int x){
		System.out.println("22222");
	}

	public void m1(int x,int y){
		System.out.println("33333");
	}
	

	public void m1(float x1){
		System.out.println("33333");
	}
	
	
	public static void main(String[] args) {
		PolymorphismClass obj=new PolymorphismClass();
		obj.m1(10,20);
	
		PolymorphismClass1 obj1=new PolymorphismClass1();
		obj1.m1(10,20);
	}

}
