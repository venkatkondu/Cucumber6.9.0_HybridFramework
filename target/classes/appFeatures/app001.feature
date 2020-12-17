Feature: this is for my project is correctly working or not I am gonna checking 

Scenario: Login Page Title
Given user is on LoginPage
When user get the title of the page
Then page title should be "My Store"

Scenario: in Login Page forgotpassword sould be displayed
Given user is on LoginPage
Then click on signIn link
Then user get the title of the page
#And page title should be "Login - My Store"
And page title should be "Login - My Store"
Then forgot password link should be displayed


Scenario: Longin into the Application with correct credientials
Given user is on LoginPage
Then click on signIn link

Then user get the title of the page
#Then user get the titile of the page
And page title should be "Login - My Store"
When user enters UserName "konduvenkatTest@gmail.com"
And user enters Password "Venkat@1920"
And user click on Login button
Then user get the title of the page
And page title should be "My account - My Store"
Then user click on logOut link
Then user get the title of the page
Then user is on Login Page
Then page title should be "Login - My Store"
Then I concluded user is in Login page