package com.sample.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\feb_batch\\ParasProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		try{
			driver.switchTo().frame("vizury-notification-template");
			driver.findElement(By.xpath("//img")).click();
			driver.switchTo().defaultContent();
		}catch(Exception e){
			
		}
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("sample");
		

		
		String x=driver.findElement(By.xpath("//input[@placeholder='Search']")).getAttribute("placeholder");

		if(x.equals("Search")){
				System.out.println("pass");
			}else{
				System.out.println("fail");
			}
	
	}
}
