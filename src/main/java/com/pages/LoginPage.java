package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	By email=By.id("email");
	By password=By.id("passwd");
	By submit=By.id("SubmitLogin");
	By forgotPassswordLink=By.partialLinkText("Forgot your password");
	
	
	// And some other things are there we have to cover later on 
	
	/*
	 * By email=By.id("email"); By password=By.id("passwd"); By
	 * submit=By.id("SubmitLogin");
	 * 
	 * By forgotPasswordLink=By.partialLinkText("Forgot your password?"); // etccc
	 * ...
	 */
	
	// In this class only userName and password and click on submit or login button and relevent things 
	public LoginPage(WebDriver rDriver)
	{
		//Where I have to assign this rDriver reference things 
		this.driver=rDriver;
		//PageFactory.initElements(rDriver, this);
	// Is here any required PageFactory.init() // normally not required 
	}
	
	
	public String getPageTitle()
	{
						// Mostly we will use this thing why because we are achieving the Thread Local concept or not I will check this scenario
		return DriverFactory.getDriver().getTitle(); // this one or 
		//return driver.getTitle();// this one 
		
	}
	
	
	public HomePage doLogIn(String userName,String pwd)
	{
		
		driver.findElement(email).sendKeys(userName);
		try {Thread.sleep(300);	} catch (InterruptedException e) {	e.printStackTrace();		}

		driver.findElement(this.password).sendKeys(pwd);
		try {Thread.sleep(300);	} catch (InterruptedException e) {	e.printStackTrace();		}
		driver.findElement(submit).click();
		try {Thread.sleep(300);	} catch (InterruptedException e) {	e.printStackTrace();		}

		
		return new HomePage(this.driver); // I have to pass this current class driver 
		
	}
	

}
