package com.sample.selenium.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\feb_batch\\ParasProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/product/admin/login.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("submit")).click();
		
		Alert val=driver.switchTo().alert();
		String x=val.getText();
		System.out.println(x);
		
		val.accept();
		
		driver.findElement(By.id("txtusername")).sendKeys(x);;
	}

}
