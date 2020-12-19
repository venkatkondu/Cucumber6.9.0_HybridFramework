package com.stepDefination;

import org.junit.Assert;

import com.pages.IndexPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class E_CommerceIndexAppStep1 {

String title=null;
IndexPage iPage=new IndexPage(DriverFactory.getDriver()); // How this will work 

@Given("user pass the url of the application")
public void user_pass_the_url_of_the_application() {
// Here we will pass the url of the Application 
	// How to do this 
	DriverFactory.getDriver().get(""); // this value I want to get from the url of the application How to do this

}

@When("user get the title of the page")
public void user_get_the_title_of_the_page() {
// Here user get the title of the page 
	this.title=DriverFactory.getDriver().getTitle(); // or any other function I will use
	
	
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

}

	/*
	 * @Then("user get the title of the page") public void
	 * user_get_the_title_of_the_page() {
	 * 
	 * }
	 */
@Then("user pass the userName {string}")
public void user_pass_the_user_name(String string) {

}

@Then("user pass the password {string}")
public void user_pass_the_password(String string) {

}

	
}
