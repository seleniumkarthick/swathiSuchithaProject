package com.sample.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebMail {


	public static void main(String[] args) {
		
		//https://webmail.6dg.co.uk/owa/snow-catchall@6dg.co.uk
		//akhil.kattela@6dg.co.uk
		//Test123@
		
		System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\feb_batch\\ParasProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webmail.6dg.co.uk/owa/snow-catchall@6dg.co.uk");
		driver.findElement(By.id("username")).sendKeys("akhil.kattela@6dg.co.uk");
		driver.findElement(By.id("password")).sendKeys("Test123@");
		driver.findElement(By.className("signinTxt")).click();
		/*
		(new WebDriverWait(driver, 50))
				  .until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingLogo")));
		driver.findElement(By.xpath("//span[text()='Search mail and people']")).click();
		driver.findElement(By.tagName("input")).sendKeys("\"Please sign ORD0001330\"");
		driver.findElement(By.xpath("//button[@aria-label='Start search']")).click();
		(new WebDriverWait(driver, 50))
		 .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'to review and')]")));
		String url=driver.findElement(By.xpath("//div[@id='main']/table//a")).getAttribute("href");
		driver.get(url);
		(new WebDriverWait(driver, 50))
		 .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='document']/button")));
		driver.findElement(By.xpath("//*[@id=\"document\"]/button")).click();
		driver.findElement(By.name("fullname")).clear();
		driver.findElement(By.name("fullname")).sendKeys("test");
		driver.findElement(By.name("position")).clear();
		driver.findElement(By.name("position")).sendKeys("test");
		(new WebDriverWait(driver, 50))
		 .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@aria-label='Click here to sign']")));
		driver.findElement(By.xpath("//div[@aria-label='Click here to sign']")).click();
		(new WebDriverWait(driver, 50))
		 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[6]/div/div[2]/div[2]/div/div/div/div[5]/div[1]/input")));
		driver.findElement(By.xpath("//div[6]/div/div[2]/div[2]/div/div/div/div[5]/div[1]/input")).sendKeys("test");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		(new WebDriverWait(driver, 50))
		 .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click to Sign']")));
		driver.findElement(By.xpath("//button[text()='Click to Sign']")).click();
		String sucessText=driver.findElement(By.xpath("//h1")).getText();
		System.out.println(sucessText);
		*/
		
		(new WebDriverWait(driver, 50))
		  .until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingLogo")));
		driver.findElement(By.xpath("//span[text()='Search mail and people']")).click();
		driver.findElement(By.tagName("input")).sendKeys("\"Adobe Sign API Has Sent You 6DG\"");
		driver.findElement(By.xpath("//button[@aria-label='Start search']")).click();
		(new WebDriverWait(driver, 50))
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'to review and')]")));
		String url=driver.findElement(By.xpath("//div[@id='main']/table//a")).getAttribute("href");
		driver.get(url);
		(new WebDriverWait(driver, 50))
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='document']/button")));
		driver.findElement(By.xpath("//*[@id=\"document\"]/button")).click();
		(new WebDriverWait(driver, 50))
		 .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@aria-label='Click here to sign']")));
		driver.findElement(By.xpath("//div[@aria-label='Click here to sign']")).click();
		(new WebDriverWait(driver, 50))
		 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[6]/div/div[2]/div[2]/div/div/div/div[5]/div[1]/input")));
		driver.findElement(By.xpath("//div[6]/div/div[2]/div[2]/div/div/div/div[5]/div[1]/input")).sendKeys("test");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		(new WebDriverWait(driver, 50))
		 .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click to Sign']")));
		driver.findElement(By.xpath("//button[text()='Click to Sign']")).click();
		(new WebDriverWait(driver, 50))
		 .until(ExpectedConditions.elementToBeClickable(By.xpath("//h1")));
		String sucessText=driver.findElement(By.xpath("//h1")).getText();
		System.out.println(sucessText);
	}
	
}
