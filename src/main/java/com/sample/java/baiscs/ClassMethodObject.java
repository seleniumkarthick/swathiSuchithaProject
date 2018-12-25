package com.sample.java.baiscs;

public class ClassMethodObject {
	
	//method without parameter or arguments
	public static void m1(){
		System.out.println("111111111");
	}
	public void m2(){
		ClassMethodObject obj=new ClassMethodObject();
		obj.m1();
		System.out.println("222222");
	}

	//method with parameter
	public void m3(int x,int y){
		int z1=x+y;
		System.out.println(z1);
		
	}
	
	public int m4(int a,int b,int c){
		
		int z1=a+b+c;
		
		return z1;
	}
	
	public static void main(String[] args) {
		//classname objectname=new classname();
		ClassMethodObject obj=new ClassMethodObject();
		obj.m2();
		m1();
		
		
		obj.m3(10, 20);
		obj.m3(140, 250);
		obj.m3(1660, 20);
		obj.m3(14550, 2330);
		obj.m3(1550, 202222);
		
		
		int x1=obj.m4(10,20, 30);
		System.out.println(x1);
		
		System.out.println(obj.m4(10,20, 30));
		
		
		if(x1==60){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
		
		
		
	}
}
