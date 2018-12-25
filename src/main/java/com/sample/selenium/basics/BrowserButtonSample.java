package com.sample.selenium.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserButtonSample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\SeleniumAutomation\\feb_batch\\ParasProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Download")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
