Feature: Book a Slot for baby photoshoot
Background:
 Given User open Browser, enter URL and navigates to landing page
@Regression
Scenario: User is registering on the application
	When User clicks on Signup button
	And Fill the login form by selecting Family/Friends option
	And click on Terms and Condition Checkbox
	And Click on Setup your account
	Then Registered Successfully Please login should be displayed
	And User is able to close the pop up

@Regression
Scenario Outline: User is trying to login with incorrect credentials

	Given User is on login pop
	When User  enters "<UserName>" and "<Password>"
	And click on Login
	Then Error should be displayed on the Popup
	And "<UserName>" and "<Password>" are retained
 Examples:
	|UserName|Password|
	|Cusion	 |Cusion123@|
	|June	 |June123@|
	
	
@Regression
Scenario: User is trying to purchase Baby Shower before photoshoot in the cart
	Given User is on login pop
	When User enters "<UserName>" and "<Password>"
	And click on Login
	Then "Login Successful. Redirecting..." should be displayed on the POpup
	And MyAccount should be displayed after redirecting from login pop up
	When User mouse Hover on Maternity Service 
	And Select BabyShower
	And Select "Awww Baby Shower Package" Package
	Then Package detail page should displayed
	When User enters BookingDate as"30/06/2021" and click on AddtoCart button
	Then Alert pop up should displayed with text "Please select some product options before adding this product to your cart."
	And After accepting that pop up User stays on same page
Examples:
	|UserName|Password|
	|AwwwDec|Aww@123|


Scenario: User add photoshoot to cart and then see error on the billing page
	Given User is on login pop
	When User enters "<UserName>" and "<Password>"
	And click on Login
	Then "Login Successful. Redirecting..." should be displayed on the POpup
	And MyAccount should be displayed after redirecting from login pop up
	When User mouse Hover on Maternity Service
	And Select Baby Photoshoot
	And Update the filter to 12800
	And Click on image of the product
	Then Product detail page should displayed with View prop Button
	When User clicks on View Prop button
	Then new window will open with drive link
	When User close the second page and switch to parent page
	And click on Add to cart
	Then Addtocart successful message will be displayed
	When user clicks on view cart button
	Then User navigates to cart and product is added with quantity 1
	When user Increases the cart quantity to "2"
	And User click on Checkout
	Then Billing page should be displayed
	When User clicks on Proced
	Then User can see error message on the top of the page
	

Scenario: User trying to logout from application
	Given User is on login pop
	When User enters "<UserName>" and "<Password>"
	And click on Login
	Then "Login Successful. Redirecting..." should be displayed on the POpup
	And MyAccount should be displayed after redirecting from login pop up
	When User clicks on Logout
	Then User should be logged out and My Account button should not be displayed.
      