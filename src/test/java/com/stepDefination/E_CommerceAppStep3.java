package com.stepDefination;

import org.junit.Assert;

import com.pages.HomePage;
import com.pages.IndexPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class E_CommerceAppStep3 {
	String title;
	
	String user,pass;
	
IndexPage iPage=new IndexPage(DriverFactory.getDriver());
HomePage hPage;
// can I get this thing from another stepDefintion 
	/*
	 * @Given("user pass the url of the application") public void
	 * user_pass_the_url_of_the_application() { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * 
	 * @Then("user get the title of the page") public void
	 * user_get_the_title_of_the_page() { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 */  
	 
	
	@When("quit the Browser")
	public void quit_The_Browser()
	{
		DriverFactory.getDriver().quit();
		
	}
	@Then("title should be {string}")
	public void title_should_be(String expectedTitle) {
//How to assert this things 
		Assert.assertEquals(expectedTitle, DriverFactory.getDriver().getTitle());
	
	}

	@When("user click on Login button")
	public void user_click_on_login_button() {
// for  perform this operation I need Indexpage object 
		iPage.clickOnSignLink();
	
	}
	// can I get this thing from another stepDefinitin java file
	/*
	 * @When("user get the title of the page") public void
	 * user_get_the_title_of_the_page() { // Write code here that turns the phrase
	 * above into concrete actions throw new io.cucumber.java.PendingException(); }
	 * 
	 * @When("title should be {string}") public void title_should_be(String string)
	 * { // Write code here that turns the phrase above into concrete actions throw
	 * new io.cucumber.java.PendingException(); }
	 */

	@When("user pass the userName {string}")
	public void user_pass_the_user_name(String userName) {
this.user=userName;
	
	}
	@When("user pass the password {string}")
	public void user_pass_the_password(String password) {
this.pass=password;
	
	}

	@When("user click on submit buttonn")
	public void click_On_submit_Button()
	{
		this.hPage=iPage.doLogIn(user, pass);
		
	}


	@Then("user get did get the login page again")
	public void user_get_did_get_the_login_page_again() {
System.out.println("In this home page User not able to again not get the logIn link ");
	}
	@When("user click on Logout Link in Home page")
	public void user_click_on_logout_link_in_home_page() {
	//	hPage.logOut();
		hPage.logOut();
	}

}
