Feature: test the E_commerce Application with log in and Log out operations 

Scenario: LogIn and LogOut the E_Commerce Aplicaiton
Given user pass the url of the application
Then user get the title of the page
And title should be "My Store"

When user click on Login button
When user get the title of the page
And title should be "Login - My Store"

When user pass the userName "konduvenakatTest@gmail.com"
And user pass the password "Venkat@1920"
And user click on submit buttonn

Then user get the title of the page
# just checking purpose I am writing this scenario How it will work 
And title should be "My account - My Store"
But user get did get the login page again
# Then I perform Logout operation here

When user click on Logout Link in Home page
Then user get the title of the page
And title should be "Login - My Store"
When quit the Browser
#When user click on logOut link 