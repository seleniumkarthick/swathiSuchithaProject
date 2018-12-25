package com.sample.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsConcept {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\feb_batch\\ParasProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/product/admin/login.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtusername")).sendKeys("admin");
		driver.findElement(By.id("txtpassword")).sendKeys("admin");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.linkText("Category Managment")).click();
		//driver.findElement(By.linkText("karthick kumar")).click();
		
		
		String parentWindow=driver.getWindowHandle();
		
		for(String xx:driver.getWindowHandles()){
			driver.switchTo().window(xx);
		}
		
		System.out.println(driver.getCurrentUrl());
		
		
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		
		
	}

}
