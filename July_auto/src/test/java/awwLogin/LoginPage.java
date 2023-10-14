package awwLogin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver;
	@Given("<User open Browser and navigates to landing page$")
    public void user_open_browser_and_navigates_to_landing_page() {
          WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://awww.co.in/");
        
    }

    @Given("User is on login pop")
    public void user_is_on_login_pop() throws InterruptedException {
          driver.findElement(By.xpath("//*[@class='btn loginbtn']")).click();
          Thread.sleep(2000);
        
    }
    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
        Thread.sleep(2000);
    }
    @When("click on Login")
    public void click_on_login() throws InterruptedException {
    driver.findElement(By.xpath("//*[@class='submit_button']")).click();
          
        
    }
    @Then("{string} Error should be displayed on the Popup")
    public void error_should_be_displayed_on_the_popup(String error) {
       String s1=driver.findElement(By.xpath("//*[@class='status']")).getText();
       if(s1.equalsIgnoreCase(error))
       {
             System.out.println("Error message is displayed");
       }
       else
       {
             System.out.println("Error message is not displayed");
       }
    }
    @Then("{string} and {string} are retained")
    public void and_are_retained(String string, String string2) {
          String s1=driver.findElement(By.xpath("//*[@id='username']")).getAttribute("value");
          String s2=driver.findElement(By.xpath("//*[@id='password']")).getAttribute("value");
          if(s1.contains(string) & s2.contains(string2))
          {
                System.out.println("username and password is displayed");
          }
          else
          {
                System.out.println("username and password is not displayed");
          }
        
    }
    @Then("{string} should be displayed on the POpup")
    public void should_be_displayed_on_the_p_opup(String success) {
          String s2=driver.findElement(By.xpath("//*[@class='status']")).getText();
             if(s2.equalsIgnoreCase(success))
             {
                   System.out.println("Login message is displayed");
             }
             else
             {
                   System.out.println("Login message is not displayed");
             }
    }
    @Then("MyAccount should be displayed after redirecting from login pop up")
    public void my_account_should_be_displayed_after_redirecting_from_login_pop_up() {
        boolean b1=driver.findElement(By.xpath("//*[@class='btn signupbtn']")).isDisplayed();
        if(b1=true)
        {
          System.out.println("MyAccount button is displayed");
        }
        else
        {
          System.out.println("MyAccount button is not displayed");
        }
    }
    @When("User mouse Hover on Maternity Service")
    public void user_mouse_hover_on_maternity_service() throws InterruptedException {
        Actions action=new Actions(driver);
        Thread.sleep(3000);
        WebElement ele=driver.findElement(By.xpath("//li[@id='menu-item-3813']/a"));
        action.moveToElement(ele)
              .perform();
    }
    @When("Select BabyShower")
    public void select_baby_shower() throws InterruptedException {
        driver.findElement(By.xpath("//li[@id='menu-item-3809']/a")).click();
        Thread.sleep(2000);
    }
    @When("Select {string} Package")
    public void select_package(String string) throws InterruptedException {
        driver.findElement(By.xpath("(//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[2]")).click();
        Thread.sleep(2000);
    }
    @Then("Package detail page should displayed")
    public void package_detail_page_should_displayed() {
       String s3=driver.getTitle();
       if(s3.equalsIgnoreCase("Awww Baby Shower Package – All Maternity Needs Under One Roof – Awww India"))
       {
             System.out.println("Package details is displayed");
       }
       else
       {
             System.out.println("Package details is not displayed");
       }
    }
    @When("User enters BookingDate as\"{int}\\/{int}\\/{int}\"")
    public void user_enters_booking_date_as(Integer date, Integer month, Integer year) {
       driver.findElement(By.xpath("//*[@id='pa_booking-date']")).sendKeys("30/06/2021");
    }
    @When("click on AddtoCart button")
    public void click_on_addto_cart_button() {
        driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
        
    }
    @Then("Alert pop up should displayed with text {string}")
    public void alert_pop_up_should_displayed_with_text(String string) {
        Alert alert=driver.switchTo().alert();
        String message=alert.getText();
        if(message.equalsIgnoreCase(string))
        {
          System.out.println("Alert is Displayed");
        }
       else
        {
          System.out.println("Alert is not Displayed");
        }
        alert.accept();
    }
    @Then("After accepting that pop up User stays on same page")
    public void after_accepting_that_pop_up_user_stays_on_same_page() {
        String s4=driver.getTitle();
        if(s4.equalsIgnoreCase("Awww Baby Shower Package – All Maternity Needs Under One Roof – Awww India"))
             {
                   System.out.println("Package details is displayed");
             }
             else
             {
                   System.out.println("Package details is not displayed");
             }
        
    }
    
    
    @When("Select Baby Photoshoot")
    public void select_baby_photoshoot() {
        
    }
    @When("Update the filter to {int}")
    public void update_the_filter_to(Integer int1) {
        
    }
    @When("Click on image of the product")
    public void click_on_image_of_the_product() {
        
    }
    @Then("Product detail page should displayed with View prop button")
    public void product_detail_page_should_displayed_with_view_prop_button() {
       
    }
    @When("User clicks on View Prop button")
    public void user_clicks_on_view_prop_button() {
        
    }
    @Then("new window will open with drive link")
    public void new_window_will_open_with_drive_link() {
        
    }
    @When("User close the second page and switch to parent page")
    public void user_close_the_second_page_and_switch_to_parent_page() {
        
    }
    @When("click on Add to cart")
    public void click_on_add_to_cart() {
        
    }
    @Then("Addtocart successful message will be displayed")
    public void addtocart_successful_message_will_be_displayed() {
        
    }
    @When("User clicks on view cart button")
    public void user_clicks_on_view_cart_button() {
        
    }
    @Then("User navigates to cart and product is added with quantity {int}")
    public void user_navigates_to_cart_and_product_is_added_with_quantity(Integer int1) {
        
    }
    @When("User Increases the cart quantity to {string}")
    public void user_increases_the_cart_quantity_to(String string) {
        
    }
    @When("User click on Checkout")
    public void user_click_on_checkout() {
        
    }
    @Then("Billing page should be displayed")
    public void billing_page_should_be_displayed() {
        
    }
    @When("User clicks on Proced")
    public void user_clicks_on_proced() {
        
    }
    @Then("User can see error message on the top of the page")
    public void user_can_see_error_message_on_the_top_of_the_page() {
        
    }
    
    @When("User clicks on Logout")
    public void user_clicks_on_logout() {
        
    }
    @Then("User should be logged out and My Account button should not be displayed.")
    public void user_should_be_logged_out_and_my_account_button_should_not_be_displayed(String docString) {
        
    }


}
