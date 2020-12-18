Feature: This feature tests the application on E-Commersse Type 

#This scenario is common for all the scenarios How to do this By using Background gherkhin key word I will use
Background: E-comerce Application login and get the detais of the HomePage
Given user pass the Url of the appliacation
When user cilick on Login page Link
Then user goes to the Login page
Then user enters the credientials 
|			userName						|	password	|
|konduvenkatTest@gmail.com|Venkat@1920|


Scenario: Test the title of the Home page of the 
# for the user pass the credentials like the above scenario 
# user in Log in page 
Given user is on Account page
Then user get the title of the pagee
Then title of the HomePage should be "My account - My Store"

Scenario: Test the some features Account section Things 
Given user is on Account page
Then user get the Accounts details like below
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESSES|
|MY PERSONAL INFORMATION|
|MY WISHlISTS|
|Home|
And account count should be 6