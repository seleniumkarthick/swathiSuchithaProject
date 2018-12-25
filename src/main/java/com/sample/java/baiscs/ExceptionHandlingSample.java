package com.sample.java.baiscs;

public class ExceptionHandlingSample {
	
	
	public static void main(String[] args) {
		

		try{
			int x1=10/0;
			System.out.println(x1);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("111111");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//multiple catch
/*
		try{
			int[] x={10,20,30,40};
			System.out.println(x[10]);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}catch(NumberFormatException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	*/	
		
		try{
			int x=10/0;
			System.out.println("11111");
		}finally{
			System.out.println("finall block");
		}
		System.out.println("end");
		
	}

}
