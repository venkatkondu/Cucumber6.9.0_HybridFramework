package com.appHooks;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks001 {

	private WebDriver driver;
	private DriverFactory factory;
	private ConfigReader config;
	Properties prop;
	
	
	@Before(order=0)
	public void getProperty()
	{
		config=new ConfigReader();
		prop=config.init_Properties();
		/*
		 * factory=new DriverFactory();
		 * driver=factory.init_Driver(prop.getProperty("browser"));// this brwser value
		 * getting from the properties file how
		 */
		}
	@Before(order=1)
	public void initialazation() {
		
	factory=new DriverFactory();
	driver=factory.init_Driver(prop.getProperty("browser"));// her we have to pass the browser value from the properties file 
	
	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	
		
	} 
	
	
	@After(order=0) // this order is execute in reverse order like 0 will execute in last time 
	public void quit()
	{
	driver.quit();	
	}
	
	@After(order=1)
	public void afterScenario(Scenario sc) // about Scenario this will check 
	{
		// Here I want to take screenshot 
		if(sc.isFailed())
		{
		String screenshotName=sc.getName().replaceAll(" ", "_");// for name of the screenshot 
		
		byte[] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(sourcePath, "image/jpg", screenshotName); // for taking the screenshot 
		
 		}
		
	}
}
