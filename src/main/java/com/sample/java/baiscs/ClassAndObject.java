package com.sample.java.baiscs;

public class ClassAndObject {
	
	//class without parameter
	public void m1(){
		System.out.println("1111");
	}
	
	//class with parameter
	public void m2(int x,int y){
		int z=x+y;
		System.out.println(z);
	}

	//class with with return type
	public int m3(int a,int b){
		int c=a+b;
		return c;
	}
	
	public static void m4(){
		System.out.println("2222222");
	}
	
	public static void main(String[] args) {
		//classname objectname=new classname();
		ClassAndObject obj=new ClassAndObject();
		obj.m1();
		
		obj.m2(10, 20);
		obj.m2(130, 2440);
		obj.m2(1220, 230);
		
		int z1=obj.m3(10, 20);
		System.out.println(z1);
		
		m4();
		
		
	}
}
