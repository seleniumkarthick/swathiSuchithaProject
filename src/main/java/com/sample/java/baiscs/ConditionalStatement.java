package com.sample.java.baiscs;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if
		 * if...else
		 * if...else if...else
		 * 
		 */
		
		int x=30;
		
		
		if(x==100){
			System.out.println("the value is 100");
		}
		
		
		if(x<=10){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
		
		if(x<10){
			System.out.println("11111");
		}else if(x==100 || x>20){
			System.out.println("2222");
		}else{
			System.out.println("3333");
		}
		
		
	}

}
