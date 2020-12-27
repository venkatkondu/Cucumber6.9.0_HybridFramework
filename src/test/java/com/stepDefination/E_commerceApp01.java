package com.stepDefination;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.IndexPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class E_commerceApp01 {
 // I have to get the Index page things here 
	// How to get tht Index page here 
	WebDriver driver;
	
	IndexPage iPage=new IndexPage(DriverFactory.getDriver()); // it will get the current running the page driver 
	LoginPage lPage; // whenever I click on LoginPahr link I will get that page 
	HomePage hPage;
	ConfigReader config=new ConfigReader();
	
	Properties prop=config.init_Properties();
	
	
	String getTitle; // this String is get from the actual String 
	
	String userName;
	String password;
	// is it requird Properties file object here to get the properties values form that file 
	
	
@Given("url of the application")
public void url_of_the_application() {
	//How to launch the browser is important here And How to pass the Url of the Application 
// How to do this 
	
	//prop=config.init_Properties(); // for url of the application THis is requied 
	//DriverFactory.
	//iPage=new IndexPage(DriverFactory.getDriver());
	//driver.get(prop.getProperty("url"));
	 DriverFactory.getDriver().get(prop.getProperty("url"));
}

@Then("get the title of the page")
public void get_the_title_of_the_page() { // By the belw this mens get the current dirver window title 
	this.getTitle=DriverFactory.getDriver().getTitle(); // this one we will use to achieve the ThreadLocal concept I will update later on as per my requrement 

}

@Then("the page title should be {string}")
public void the_page_title_should_be(String expectedTitle) {
// here Actually I going to assert the page title 
	Assert.assertEquals(expectedTitle, this.getTitle); // this is required and update any other things later on 
}
//
//@When("click on login page") // don't write 
//											 step definition files  we will get the ambugity stepDefiniton Exception 
//public void clink_on_login_page() {
//// If I click on Login page from the IndexPage I would be landing to the Login Page
//	lPage=iPage.clikOnSingInLink();
//
//}
	/*
	 * @Then("page title should be {string}") public void
	 * page_title_should_be(String string) {
	 * 
	 * 
	 * }
	 */
	/*
	 * @Given("get the url of the application") public void
	 * get_the_url_of_the_application() {
	 * 
	 * 
	 * }
	 */

@When("click on login page")
public void click_on_login_page() {
lPage=iPage.clikOnSingInLink();

}

@When("pass the userName {string}")
public void pass_the_user_name(String uName) {
this.userName=uName;

}

@When("pass the password {string}")
public void pass_the_password(String password) {
this.password=password;

}

@When("click on the submit button")
public void click_on_the_submit_button() {
	System.out.println("Here I am passing the userName "+this.userName);
	System.out.println("\t\t And Password = "+this.password);
	System.out.println("\t\t And do login method  through StepDefiniton file");
	hPage=lPage.doLogIn(userName, password); // By this we can achieve the more relevnt thigs
// The above line of code is return the HomePage reference 
}

@When("click on logoutLink")
public void click_on_Logout_Link()
{
	// Here what I will use I need any other things or later on I will update as per my requirement 
System.out.println("Here I performing the Logout Link action in through StepDefinition");
	lPage=hPage.logOut(); // this statement is required to know about the application flow
	
	 // I will update the scenario file is working as per my expectation 
}


@When("pass the userName {string} and password  {string}")
public void pass_the_user_name_and_password(String uName, String pwd) {
	this.userName=uName;
	this.password=pwd;
	
lPage.doLogIn(uName, pwd);


}

}
