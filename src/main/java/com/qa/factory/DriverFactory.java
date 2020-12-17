package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<WebDriver>();
	
	
	public static WebDriver getDriver()
	{
		return tlDriver.get();
		
	}
	
	public WebDriver init_Driver(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			//tlDriver=new ChromeDriver();
			tlDriver.set(new ChromeDriver());
			
			
		}else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
			
		}else if(browser.equalsIgnoreCase("safari"))
		{
			//WebDriverManager.edgedriver().setup();
		// for safari not available this WebDriverManager 
			
			tlDriver.set(new SafariDriver()); // will is work I will check
		
		}else
		{
			System.out.println("You enterd browser name is worng check broser name :: "+browser);
		System.exit(0);// I don't want to execute unncessary thiggs after thins 
		}
		
		
		return getDriver(); // for parallel execution purpose 
	}
	
	
}
