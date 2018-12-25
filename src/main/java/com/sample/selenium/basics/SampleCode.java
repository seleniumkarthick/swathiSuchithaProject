package com.sample.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleCode {
	
	public static void main(String[] args) {
		
		/*
		 * Integrate the jar file
		 * Download chromedriver(http://chromedriver.storage.googleapis.com/index.html) and set the property
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\feb_batch\\ParasProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Selenium ASasASasaS - Web Browser Automation")){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
		
		if(driver.getCurrentUrl().equals("https://www.seleniumhq.org/docs/")){
			
		}else{
			
		}
		
		driver.quit();
	}

}
