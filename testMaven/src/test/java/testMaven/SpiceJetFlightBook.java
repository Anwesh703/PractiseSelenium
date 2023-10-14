package testMaven;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SpiceJetFlightBook extends BaseClass {
   WebDriver driver;
   ReadDataFrom rd;
   @Test(dataProvider = "cities")
   
   public void testDropDown(String from,String toCity,String curr) {
	   By dept = By.name("ctl00$mainContent$ddl_originStation1");
	   By to = By.name("ctl00$mainContent$ddl_destinationStation1");
	   By destCity = By.xpath("");
	   ArrayList<String> data = rd.getData("testDropDown");
	   driver = launchBrowser());
	   sp=new SpiceJetHomePage(driver);
       driver.findElement(dept).sendKeys(from);
       driver.findElement(to).sendKeys(toCity);
       driver.findElement(destCity).click();
   }
   @DataProvider (name="cities")
   public Object[][] setupData(){
	   return new Object[][] {{arr1.get(2),arr1.get(3),"GBP"},{"AMD","MAA","GBP"}};
   }
   
}
