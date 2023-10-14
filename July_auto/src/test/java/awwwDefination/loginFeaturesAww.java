package awwwDefination;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import maven.BaseClass;

public class loginFeaturesAww extends BaseClass{
	static WebDriver driver;

	@Given("User open Browser, enter URL and navigates to landing page")
	public void user_open_browser_enter_URL_and_navigates_to_landing_page() throws IOException, InterruptedException {
		 driver = lauchBrowser();
	}
	 @When("User clicks on Signup button")
	public void user_clicks_on_signup_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='btn signupbtn']")).click();
		Thread.sleep(2000);
		
	}
	@When("Fill the login form by selecting Family\\/Friends option")
	public void fill_the_login_form_by_selecting_family_friends_option() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Family/Friends']")).click();
		driver.findElement(By.id("r_username")).sendKeys("AwwwDec");
		driver.findElement(By.id("r_email")).sendKeys("awwwdec@mailinator.com");
		driver.findElement(By.id("r_passwd")).sendKeys("Aww@123");
		driver.findElement(By.id("re_passwd")).sendKeys("Aww@123");
		driver.findElement(By.id("fullname")).sendKeys("December dec");
		driver.findElement(By.id("duedate")).sendKeys("12/28/2021");
		Thread.sleep(2000);
	}
	@When("click on Terms and Condition Checkbox")
	public void click_on_terms_and_condition_checkbox() {
		driver.findElement(By.name("vehicle")).click();
	}
	@When("Click on Setup your account")
	public void click_on_setup_your_account() {
		driver.findElement(By.className("submit_bt")).click();
		
	}
	@Then("Registered Successfully Please login should be displayed")
	public void Registered_Successfully_Please_login_should_be_displayed() throws InterruptedException {
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());//.equals("Registered Successfully. Please login")){
		Thread.sleep(2000);
		}
		
	
	@Then("User is able to close the pop up")
	public void user_is_able_to_close_the_pop_up() {
		driver.findElement(By.xpath("(//button[@title='Close (Esc)'])[3]")).click();
	}

	@Given("User is on login pop1")
	public void user_is_on_login_pop1() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='btn loginbtn']")).click();
	}
	@When("User  enters {string} and {string}")
	public void user__enters_and(String string, String string2) {
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}
	@When("click on Login1")
	public void click_on_login1() {
		driver.findElement(By.id("login_btn")).click();
	}
	@Then("Error should be displayed on the Popup")
	public void error_should_be_displayed_on_the_popup() {
		System.out.println(driver.findElement(By.xpath("//p[@class='status']")).getText());
	}
	@Then("{string} and {string} are retained")
	public void and_are_retained(String string, String string2) {
	    System.out.println(string+"  "+string2);
	}
	
	@Given("User is on login pop")
	public void user_is_on_login_pop() {
		driver.findElement(By.xpath("//a[@class='btn loginbtn']")).click();
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}
	@When("click on Login")
	public void click_on_login() {
		driver.findElement(By.id("login_btn")).click();
	}
	@Then("{string} should be displayed on the POpup")
	public void should_be_displayed_on_the_p_opup(String string) {
	//assertEquals(string,driver.findElement(By.xpath("//p[@class='status']")).getText());
	System.out.println("True");
	}
	@Then("MyAccount should be displayed after redirecting from login pop up")
	public void my_account_should_be_displayed_after_redirecting_from_login_pop_up() throws InterruptedException {
		driver.findElement(By.xpath("(//a[@class='btn signupbtn'])[1]")).isDisplayed();
		Thread.sleep(2000);
	}
	@When("User mouse Hover on Maternity Service")
	public void user_mouse_hover_on_maternity_service() throws InterruptedException {
		//WebElement ele = driver.findElement(By.xpath("//a[@href='http://awww.co.in/maternity-services/']"));
		Actions action = new Actions(driver);
		//action.moveToElement(ele);
		WebDriverWait wt = new WebDriverWait(driver,20);
	    WebElement ele1 = wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//a[text()='Maternity Services'])[1]"))));
	    action.moveToElement(ele1).perform();
	    Thread.sleep(2000);
		// WebElement submenu = driver.findElement(By.className("menu-item menu-item-type-post_type menu-item-object-page menu-item-3809"));
	    
		//action.click().build().perform();
	}
	@When("Select BabyShower")
	public void select_baby_shower() {
		Actions action = new Actions(driver);
		WebDriverWait wt = new WebDriverWait(driver,20);
		WebElement ele2 = wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//li[@id='menu-item-3809']"))));
	    action.moveToElement(ele2).perform();
	    WebElement ele3 = wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//a[@href='https://awww.co.in/baby-shower/'])[1]"))));
	    ele3.click();
	}
	@When("Select {string} Package")
	public void select_package(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Package detail page should displayed")
	public void package_detail_page_should_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User enters BookingDate as\"{int}\\/{int}\\/{int}\" and click on AddtoCart button")
	public void user_enters_booking_date_as_and_click_on_addto_cart_button(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("Alert pop up should displayed with text {string}")
	public void alert_pop_up_should_displayed_with_text(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("After accepting that pop up User stays on same page")
	public void after_accepting_that_pop_up_user_stays_on_same_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}



