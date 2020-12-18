package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebDriver driver;
	// OR // what ever I want to 
	
	By addressList=By.className("row addresses-lists"); // check this will work or not 
	By addressColumns=By.id("center_column"); // By this how will I get the list of the lists from this 
	
	public HomePage(WebDriver rDriver)
	{
		this.driver=rDriver;
		
	}
	
	// Methods here 
	/*
	 * public HomePage(WebDriver driver2) { // TODO Auto-generated constructor stub
	 * this.driver=driver2; }
	 */
	public String getTitle() // I need this to be Test 
	{
		return driver.getTitle();
	}
	
	
	public String getWindowHandle() // This will get the window To navigate to one window to another window
	{	// To handle window things I used this 
		
		return driver.getWindowHandle();
	}
	
	public void getListOfTheCenter()
	{
		
		List<String> list=null;
		List<WebElement> eles=driver.findElements(addressColumns); //check this will work or not 
		for(WebElement ele:eles	)
		{
			String text=ele.getText();
			System.out.println(text);
			list.add(text);
			
		}
	
	
	}
	

}
