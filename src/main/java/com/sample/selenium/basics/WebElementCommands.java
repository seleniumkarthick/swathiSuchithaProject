package com.sample.selenium.basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
	
	public static void main(String[] args) {
		
		/*
		 * Integrate the jar file
		 * Download chromedriver(http://chromedriver.storage.googleapis.com/index.html) and set the property
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\feb_batch\\ParasProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		
		/*
		 * click
		 * clear
		 * sendKeys
		 * 
		 */
		
		driver.findElement(By.linkText("Download")).click();
		
		driver.findElement(By.name("q")).sendKeys("testing");
		
		WebElement search=driver.findElement(By.name("q"));
		search.clear();
		search.sendKeys("testing123");
		
		
		driver.findElement(By.name("submit")).click();
		
	}
	

}
