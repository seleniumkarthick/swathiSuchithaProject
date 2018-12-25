package org.seleniumhq.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//img[@alt='Selenium Logo']")
	WebElement seleniumWebdriverLogo;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSeleniumWebdriverIcon(){
		seleniumWebdriverLogo.click();
	}

}
