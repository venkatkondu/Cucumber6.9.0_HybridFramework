package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page001 {
	WebDriver driver;

	// Object Repositories ;
	By signIn=By.partialLinkText("Sign in");
	By email=By.id("email");
	By password=By.id("passwd");
	By submit=By.id("SubmitLogin");
	
	By forgotPasswordLink=By.partialLinkText("Forgot your password?"); // etccc ... 
	By signOut=By.partialLinkText("Sign out");
	
public Page001(WebDriver rDriver)
{
	this.driver=rDriver;
	
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}


public String getLoginPageTitle()
{
return driver.getTitle();	

}

public void clickOnSignLink()// later on I will update to if sign Link is displayed then only it will be click 
{
driver.findElement(signIn).click();	
}
public void clickOnLogOutLink()
{
driver.findElement(signOut).click();	
}
public boolean isForgotPwdLinkExits()
{
return driver.findElement(forgotPasswordLink).isDisplayed();

}

public void enterUserName(String userName)
{
	driver.findElement(email).sendKeys(userName);// Never Assert Here in this page 
}

public void enterPassword(String pass)
{
	driver.findElement(password).sendKeys(pass);
}

public void clickSubmitBtn()
{
driver.findElement(submit).click();	
}
}
