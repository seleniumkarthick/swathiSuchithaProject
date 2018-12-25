package com.sample.java.baiscs;

public class MethodWithReturnType {
	
	

	//method with parameter
	public void m3(int x,int y){
		
		MethodWithReturnType obj=new MethodWithReturnType();
		int z=obj.m4(20, 30, 40);
		
		int sum=x+y+z;
		System.out.println(sum);
	}
	
	public int m4(int a,int b,int c){
		
		int z1=a+b+c;
		
		return z1;
	}
	
	public static void main(String[] args) {
		//classname objectname=new classname();
		MethodWithReturnType obj=new MethodWithReturnType();
		obj.m3(10, 20);
		
	}
}
