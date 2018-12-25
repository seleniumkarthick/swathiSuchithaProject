package com.sample.selenium.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XmlParameterSample {
	
	@Parameters("browser")
	@Test
	public void m1(String x){
		System.out.println(x);
	}

}
