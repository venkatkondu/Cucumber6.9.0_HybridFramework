package com.stepDefination;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import com.pages.IndexPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class E_CommerceIndexAppStep1 {

	ConfigReader reader=new ConfigReader();
	
	Properties properties=reader.init_Properties(); // This will return the properties file values
String title=null;
IndexPage iPage=new IndexPage(DriverFactory.getDriver()); // How this will work 

@Given("user pass the url of the application")
public void user_pass_the_url_of_the_application() {
// Here we will pass the url of the Application 
	// How to do this      // How to get the values from properties file her 
	DriverFactory.getDriver().get(properties.getProperty("url")); // this value I want to get from the url of the application How to do this
	DriverFactory.getDriver().manage().window().maximize();	
	DriverFactory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	DriverFactory.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	DriverFactory.getDriver().manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
	
	/*
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 * driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		 */	
}

@When("user get the title of the page")
public void user_get_the_title_of_the_page() {
// Here user get the title of the page 
	this.title=DriverFactory.getDriver().getTitle(); // or any other function I will use
//	this.title=iPage.getIndexPageTitle(); // or the above one are use full 
	   // The above one will work only for IndexPage only 
	// 
}

@Then("title of the page should be {string}")
public void title_of_the_page_should_be(String expectedTitle) {
// In this we have to perform assertion of the title expected and actual found by the 
	
	Assert.assertEquals(expectedTitle, title);
	Assert.assertEquals("Title of the page I'm asserting Here", expectedTitle, title); //check this will work or not 
}

	/*
	 * @Then("assert of the actual and expected titles") 
	 * public void assert_of_the_actual_and_expected_titles() {
	 * 
	 * }
	 */
@When("user click on sign In link")
public void user_click_on_sign_in_link() {
iPage.clickOnSignLink();
}

	/*
	 * @Then("user get the title of the page") public void
	 * user_get_the_title_of_the_page() {
	 * 
	 * }
	 */
@Then("user pass the userName {string}")
public void user_pass_the_user_name(String userName) {
iPage.enterUserName(userName);
}

@Then("user pass the password {string}")
public void user_pass_the_password(String password) {
iPage.enterPassword(password);  // I need to click on sign in button 
iPage.clickSubmitBtn();

}

	
}
