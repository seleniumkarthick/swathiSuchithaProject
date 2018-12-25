package com.sample.selenium.basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionSample {
	
public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\feb_batch\\ParasProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html5demos.com/drag/#");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		int count=driver.findElements(By.xpath("//ul/li")).size();
		
		for(int i=1;i<=count;i++){
			
			System.out.println("//ul/li["+i+"]");
			WebElement element = driver.findElement(By.xpath("//ul/li["+i+"]"));
			WebElement target = driver.findElement(By.id("bin"));

			  //Using Action class for drag and drop.		
	        Actions act=new Actions(driver);					
			act.dragAndDrop(element, target).perform();
		
		}
		
		
	}
	
}
