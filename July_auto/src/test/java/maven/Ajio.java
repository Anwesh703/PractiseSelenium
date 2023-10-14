package maven;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import page_classes.AjioHomePage;

public class Ajio extends BaseClass{
	WebDriver driver;
	AjioHomePage aj;
	@Test
	public void test() throws IOException, InterruptedException {
		driver = lauchBrowser();
		//Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		
		aj=new AjioHomePage(driver);
		//aj.search().click();
		aj.search().sendKeys("shoes");
		aj.searchIcon().click();
		Thread.sleep(2000);
		aj.men().click();
		Thread.sleep(2000);
		aj.formal().click();
		scrolltoElement(aj.company);
		/*Thread.sleep(2000);
		aj.company().click();
		Thread.sleep(2000);
		aj.brandSelection().click();
		*/
	}

	
}
