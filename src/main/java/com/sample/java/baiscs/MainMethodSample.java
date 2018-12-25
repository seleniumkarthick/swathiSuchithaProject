package com.sample.java.baiscs;

public class MainMethodSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String x="hai Hello how are you";
		
		if(x.equals("hai hello how are you")){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
		
		if(x.equalsIgnoreCase("hai hello how are you")){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
		
		System.out.println(x.toUpperCase());
		
		System.out.println(x.length());
	}

}
