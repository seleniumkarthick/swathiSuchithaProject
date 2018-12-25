package com.sample.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCommand {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\feb_batch\\ParasProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/product/admin/login.php");
		driver.findElement(By.id("txtusername")).sendKeys("admin");
		driver.findElement(By.id("txtpassword")).sendKeys("admin");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.linkText("Category/Subcategory")).click();
		
		Select drowndown=new Select(driver.findElement(By.xpath("//select")));
		drowndown.selectByVisibleText("50");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		drowndown.selectByIndex(3);
	}

}
