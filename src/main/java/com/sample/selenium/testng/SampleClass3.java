package com.sample.selenium.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleClass3 {
	
	
	@Test(description="to validate username",priority=1)
	public void b_m1(){
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\feb_batch\\ParasProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/product/admin/login.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("submit")).click();
		
		Alert val=driver.switchTo().alert();
		String actualVal=val.getText();
		val.accept();
		
		Assert.assertEquals(actualVal, "Please enter admin Username");
	}

	@Test(priority=2,dependsOnMethods="b_m1")
	public void c_m2(){
		System.out.println("2222");
	}

	@Test(priority=3)
	public void a_m3(){
		System.out.println("333333");
	}

	@Test(priority=4)
	public void e_m4(){
		System.out.println("4444444");
	}

	@Test(priority=5)
	public void d_m5(){
		System.out.println("55555");
	}

	@BeforeTest
	public void setup(){
		System.out.println("before test");
	}
	

	@AfterTest
	public void m7(){
		System.out.println("after test");
	}
	
}
