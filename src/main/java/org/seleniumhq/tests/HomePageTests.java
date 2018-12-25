package org.seleniumhq.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.pages.HomePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTests {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\feb_batch\\ParasProject\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
	}

	@Test
	public void validateSeleniumWebdriverLogo(){
		HomePage homePageObj=new HomePage(driver);
		homePageObj.clickSeleniumWebdriverIcon();
	}
}
