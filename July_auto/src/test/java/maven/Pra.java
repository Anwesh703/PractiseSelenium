package maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Pra extends BaseClass{
	By link1= By.linkText("seleniumbase.com");
@Test
public void link() throws IOException {
	WebDriver driver = lauchBrowser();
	driver.findElement(link1).click();
	
	String s = driver.getTitle();
	
	if(driver.getTitle().equalsIgnoreCase(s)) {
    	//driver.close();
    	driver.get("https://seleniumbase.io/demo_page");
    }
   By link2 = By.linkText("SeleniumBase on GitHub");
   driver.findElement(link2).click();
}
}
