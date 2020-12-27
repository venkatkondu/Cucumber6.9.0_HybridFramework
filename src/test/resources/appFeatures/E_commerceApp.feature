 Feature: Find the password of the konduvenkat@gmail.com
 
 Scenario Outline: E-commerce Application find the correct password of the application 
 Given url of the application
 When click on login page
 And pass the userName "<username>" and password  "<password>"
 # And pass the password <password>
 And click on the submit button
 Then get the title of the page
 And the page title should be "My account - My Store"
#Below are the possible combinations  
 Examples:
|      username       | password  |
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