package com.stepDefination;

import org.junit.Assert;

import com.pages.Page001;

import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class App001_stepDefination {
	static String pageTitle; // dynamically change the title of the page 
	private Page001 page=new Page001(DriverFactory.getDriver());
							// make that getDriver method as static then only we will get directly driver reference and send to the Pages 
	
	@Given("user is on LoginPage")// here we have to pass the url of the application 
	public void user_in_Login_Page()
	{
		DriverFactory.getDriver().get("http://automationpractice.com/index.php"); // pass the usl of the application 
			
	}
	
	@Given("user pass the URL of the application") // her we have to pass the usl of the application 
	public void user_pass_the_url_of_the_application() {

	// How to pass the or Open the url of the application 
		DriverFactory.getDriver().get("http://automationpractice.com/index.php"); // pass the usl of the application 
	}

	@When("user get the title of the page")
	public void user_get_the_title_of_the_page() {
		pageTitle = page.getLoginPageTitle();
	//How to assert here 
	}
	
	
		  // click on signIn link
	//     click on signIn link
	@Then("click on signIn link")
	public void click_On_SignIn_Link()
	{
		
		page.clickOnSignLink();
	}
	
	//user click on logOut link user click on logOut link
	@Then("user click on logOut link")
	public void user_Click_On_LogOut_Link()	
	{
	
	page.clickOnLogOutLink();
	
	}

	@Then("page title should be {string}") // this will depends on two pages
	public void page_titile_should_be(String title) {
	Assert.assertEquals(title, pageTitle);// Assert import from JUnit
	
	}
	@Then("I concluded user is in Login page")
	public void user_Is_In_LogInPage()
	{
		
	}
	@Then("user is on Login Page")
	public void user_Is_On_LoginPage()
	{
		
	}
	@Then("forgot password link should be displayed")
	public void forgot_password_link_should_be_displayed() {

	// Here directly we have to assert 
		
		Assert.assertTrue(page.isForgotPwdLinkExits());
		
	}

	@When("user enters UserName {string}")
	public void user_enters_user_name(String userName) {

page.enterUserName(userName);	
	}

	@When("user enters Password {string}")
	public void user_enters_password(String password) {

	page.enterPassword(password);
	}

	@When("user click on Login button")
	public void user_click_on_login_button() {
		page.clickSubmitBtn();
	
	}

	@Then("user gets the Title of the Home page") // I think this is not required 
	public void user_gets_the_title_of_the_home_page() {

	pageTitle=DriverFactory.getDriver().getTitle(); // I need this 
			
	}
}
