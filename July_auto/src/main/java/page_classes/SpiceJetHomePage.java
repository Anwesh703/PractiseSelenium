package page_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpiceJetHomePage {
	WebDriver driver;
	public SpiceJetHomePage(WebDriver driver) {
		this.driver=driver;
	}
	 By dept = By.name("ctl00$mainContent$ddl_originStation1");
	   By to = By.name("ctl00$mainContent$ddl_destinationStation1");
	   By destCity = By.xpath("//a[@value='DEL')[2]");
	   public WebElement departureCity() {
		return driver.findElement(dept);
	   }
	   public WebElement toCity() {
			return driver.findElement(to);
		   }
	   public WebElement destCity() {
			return driver.findElement(destCity);
		   }
	   public void setupFlightDetails() {
		   departureCity().sendKeys("AMD");
		   toCity().sendKeys("DEL");
		   destCity().click();
	   }
}
