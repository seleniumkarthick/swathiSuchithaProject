package com.sample.selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingSample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\feb_batch\\ParasProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/product/user_product_upload.php");
		
		//Implicity wait - it will wait for entire pae to be loaded
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select category=new Select(driver.findElement(By.id("drop_1")));
		category.selectByVisibleText("Footwears");
		
		//Explicity Wait - It will wait for particular component to be loaded.
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.id("tier_two")));
		
		Select sub_category=new Select(driver.findElement(By.id("tier_two")));
		sub_category.selectByVisibleText("testsubcat");
		
	}

}
