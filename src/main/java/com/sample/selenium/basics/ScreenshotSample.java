package com.sample.selenium.basics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenshotSample {
	
	public static void main(String[] args) throws IOException {
		
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
		
		  TakesScreenshot scrShot =((TakesScreenshot)driver);
	        //Call getScreenshotAs method to create image file
	        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	        
	        System.out.println(SrcFile);
	            
	        //Move image file to new destination
	        File DestFile=new File("E:\\testing123.png");
	        //Copy file at destination
	        FileUtils.copyFile(SrcFile, DestFile);

	        
		
	}

}
