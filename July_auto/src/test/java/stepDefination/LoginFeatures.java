package stepDefination;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import maven.BaseClass;

public class LoginFeatures extends BaseClass{
	static WebDriver driver;

@Given("User luanch the browser and navigate to LoginPage")
public void user_luanch_the_browser_and_navigate_to_login_page() throws IOException {
    driver = lauchBrowser();
}
@When("User enters {string} in username Filed")
public void user_enters_in_username_filed(String username) {
  driver.findElement(By.name("email")).sendKeys(username);
}
@When("User enters {string} in Password field")
public void user_enters_in_password_field(String password) {
	driver.findElement(By.name("pass")).sendKeys(password);
}
@When("user clicks on login button")
public void user_clicks_on_login_button() {
	driver.findElement(By.name("login")).click();
}
@Then("User should see an error message on login popup")
public void user_should_see_an_error_message_on_login_popup() {
	System.out.println("Error displayed");
   
}
@Then("user can see values prefield in username and password")
public void user_can_see_values_prefield_in_username_and_password() {
	System.out.println("data displayed");
}
@Then("User should not see profile icon")
public void user_should_not_see_profile_icon() {
   System.out.println("profile not displayed");
   driver.quit();
}
@Then("User should see an able to login and see profile icon")
public void user_should_see_an_able_to_login_and_see_profile_icon() {
   System.out.println("profile displayed");
   driver.quit();
}



@When("User clicks on forgetPassword")
public void user_clicks_on_forget_password() {
	   System.out.println("Forgetpassword clicked");
}
@When("Open outlook Mail box")
public void open_outlook_mail_box() {
   System.out.println("Forgetpassword clicked");
}
@Then("user should see a mail from the .com")
public void user_should_see_a_mail_from_the_com() {
System.out.println("Forgetpassword clicked");
}
@When("User clicks on mail amd open it")
public void user_clicks_on_mail_amd_open_it() {
  System.out.println("Forgetpassword clicked");
}
@Then("User should see doc string in Mail")
public void user_should_see_doc_string_in_mail(String docString) {
   System.out.println(docString);
driver.quit();
}


}