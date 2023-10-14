@Regression
Feature: Login Feature- 
User tries to login

Background:
 Given User luanch the browser and navigate to LoginPage

@Smoke @E2E
Scenario Outline: Users tries to login with invalid Credentials
 When User enters "<username>" in username Filed
 And User enters "<password>" in Password field
 And user clicks on login button
 Then User should see an error message on login popup
 And user can see values prefield in username and password
 But User should not see profile icon
 
 Examples:
  |username|password|
  |anwesh|xyzxyz|
  |sarthak|dear|
  |vaishnavi|Fire|
  
  @Regression
 Scenario:  Users tries to login with valid Credentials
 When User enters "anwesh" in username Filed
 And User enters "Deloitte" in Password field
 And user clicks on login button
 Then User should see an able to login and see profile icon
 
  @Regression
  Scenario:  Users tries to click on forgetpassword
 When User clicks on forgetPassword
 And Open outlook Mail box
 Then user should see a mail from the .com
 When User clicks on mail amd open it
 Then User should see doc string in Mail
 """
 Hey Anwesh
 This is mail intended for you to verify and document string
 Thanks
 .com
 """
 