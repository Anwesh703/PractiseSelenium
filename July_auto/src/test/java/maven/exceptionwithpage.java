package maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class exceptionwithpage extends BaseClass{
@Test	
	public void method() throws IOException {
		WebDriver driver = lauchBrowser();
		//driver.findElement(By.id("myLink1")).click();
		try {
			if(driver.findElement(By.id("mySelect")).isDisplayed()) {
				System.out.println("Current test case failed");
			}else {
				System.out.println("Test case failed but element is not visible");
			}
		}catch(Exception e) {
			if(driver.getCurrentUrl().contains("https://seleniumbase.com/")) {
				System.out.println("the Dropdown element does not exist on the page");
			}else {
				System.out.println("Nothing Required");
			}
		}
		
	}
}
