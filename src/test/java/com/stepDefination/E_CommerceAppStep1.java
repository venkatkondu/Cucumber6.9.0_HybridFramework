package com.stepDefination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.HomePage;
import com.pages.Page001;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class E_CommerceAppStep1 {
	static String title;
	private Page001 indexPage= new Page001(DriverFactory.getDriver()); // in this I have to create one 
	private HomePage homePage;
@Given("user pass the Url of the appliacation") // Here I want  to pass the Url of the application 
public void user_pass_the_url_of_the_appliacation() {
DriverFactory.getDriver().get("http://automationpractice.com/index.php");// Here  I have to pass the url of the application 
}

@When("user cilick on Login page Link") // Here I need Index page of the E-commerce application
public void user_cilick_on_login_page_link() {
indexPage.clickOnSignLink(); // this is for click on sign in button in the Index Page 
}

@Then("user goes to the Login page")
public void user_goes_to_the_login_page() { // How what should I do here 

}

@Then("user enters the credientials") // I'm using List<Map<String,String>> here by using key value pair format
public void user_enters_the_credientials(DataTable dataTable) {
List<Map<String,String>> cred=dataTable.asMaps(); // How to get the data form the table like Map and List 

String userName=cred.get(0).get("userName");// Yes I am getting the table data in form of Key value formats 
String password=cred.get(0).get("password");

this.homePage=indexPage.doLogIn(userName, password); // this method will return the above things 
// By the above details I will create the Object of the HomePage object I will initialize 



	
	
}

@Given("user is on Account page") // How would I know 
public void user_is_on_account_page() { //What is this is about 
System.out.println(" User is on Account page in wich scenario I will use this thing ");
}
@Then("user get the title of the pagee")
public void user_Get_The_Title_Of_The_Pagee()
{
 title=homePage.getTitle();

System.out.println("Title of the page is :: "+title);

}

@Then("title of the HomePage should be {string}")
public void title_of_the_home_page_should_be(String homeTitle) {
// here I need the Title of the Home Page to assert for Landing the home page or not I will gonna check about this 
	
	//Assert.assertEquals(homeTitle, homePage.getTitle());// this Assert from the org.JUnit.Assert 
	// if it fails the scenario is fail  // How to change the background color for which working I will cover later on 
	Assert.assertEquals(homeTitle, this.title); // will it work I will check 

}

@Then("user get the Accounts details like below")
public void user_get_the_accounts_details_like_below(DataTable dataTable) {
// Here I will do some other things as per the requirements 
	
	homePage.getListOfTheCenter();
	
}

@Then("account count should be {int}")
public void account_count_should_be(Integer list) {
// How to get the number How many 
}


}
