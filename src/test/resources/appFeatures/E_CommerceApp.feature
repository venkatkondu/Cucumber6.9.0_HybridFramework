Feature: Test the E-commerce Application

#Background: user pass the url of the Application
#Given user pass the url of the application

Scenario: Test the title of the Index page is load or not
Given user pass the url of the application
When user get the title of the page
Then title of the page should be "My Store"
#Then assert of the actual and expected titles

# these two thigs bacground we have to set later on I will do this
Scenario: click on  Login link of the E-commerce Application
Given user pass the url of the application
When user click on sign In link
When user get the title of the page
Then title of the page should be "Login - My Store"

Scenario: Login to the E-commerce application
Given user pass the url of the application
When user click on sign In link
Then user pass the userName "konduvenkatTest@gmail.com"
And user pass the password "Venkat@1920"
# How would I know weather I'm in user Home page or not 
When user get the title of the page
Then title of the page should be "My account - My Store"