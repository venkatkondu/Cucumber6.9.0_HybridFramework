Feature: Test the E-Commerce Application

Scenario: Index Page Testing
Given url of the application
#Below these two are  used to all the scenarios and stepDefinition
Then get the title of the page
And the page title should be "My Store"

Scenario: login Page Testing
Given url of the application
Then get the title of the page
And the page title should be "My Store"
When click on login page
Then get the title of the page
And the page title should be "Login - My Store"

Scenario: Home Page Testing

Given url of the application
Then get the title of the page
Then the page title should be "My Store"
When click on login page
Then get the title of the page
Then the page title should be "Login - My Store"
When pass the userName "konduvenkatTest@gmail.com"
And pass the password "Venkat@1920"
And click on the submit button
Then get the title of the page
And the page title should be "My account - My Store"

When click on logoutLink

# later onI will update this feature file as per my expectation like pass different random data on feilds 
# background and scenarion ouline
# etcc 