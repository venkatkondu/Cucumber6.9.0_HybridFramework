Feature: find the password of the given username

Scenario: E-commerce application I know the userName=konduvekat@gmail.com but I dont know  the password 


#Use dryRun in CucumberOption in runnerFile through JUnit
Given url of the application
When click on login page
When enters the given data
|konduvenkat@gmail.com|venkat@1920|  
|konduvenkat@gmail.com|Venkat@1920|
|konduvenkat@gmail.com|konduvenkat|
|konduvenkat@gmail.com|KonduVenkat|
|konduvenkat@gmail.com|VenkatKondu|
|konduvenkat@gmail.com|venkat1920@|
|konduvenkat@gmail.com|Venkat1920@|
|konduvenkat@gmail.com|9885861920@|
|konduvenkat@gmail.com|@9885861920|
|konduvenkat@gmail.com|95029265820@|
|konduvenkat@gmail.com|@95029265820|