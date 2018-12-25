package com.sample.collections;

public class StaticSample {

	static int x=1;
	
	public StaticSample(){
		x++;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		new StaticSample();
		new StaticSample();
		new StaticSample();
		new StaticSample();
	}
	
}
