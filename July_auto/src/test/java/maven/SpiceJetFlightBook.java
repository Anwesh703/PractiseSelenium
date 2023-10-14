package maven;
	import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

	public class SpiceJetFlightBook extends BaseClass {
	   WebDriver driver;
	   //ReadDataFromExcel;
	   @Test(/*dataProvider = "cities"*/)
	   
	   public void testDropDown(/*String from,String toCity,String curr*/) throws IOException, InterruptedException {
		  By dept = By.name("ctl00$mainContent$ddl_originStation1");//(//select[@class='wHuges station ddlfromto formSelect CustomizableDD required'])[1]
		  By to = By.name("ctl00$mainContent$ddl_destinationStation1");//(//select[@class='wHuges station ddlfromto formSelect CustomizableDD required'])[2]"
		  // By destCity = By.xpath("");
		   //By dept = By.xpath("(//select[@class='wHuges station ddlfromto formSelect CustomizableDD required'])[1]");
		   //By to = By.xpath("(//select[@class='wHuges station ddlfromto formSelect CustomizableDD required'])[2]");
		  // ArrayList<String> data = rd.getData("testDropDown");
		   driver = lauchBrowser();
		   //Actions act = new Actions(driver);
		   //WebDriverWait wt = new WebDriverWait(driver,20);
		    WebElement wb=driver.findElement(dept);
		    wb.click();
		    wb.sendKeys("HYD");
		    Thread.sleep(2000);
		    
		   // WebElement ele1 = wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//select[@value='HYD']"))));
		    //act.moveToElement(ele1).perform();
		    WebElement wt=driver.findElement(to);
		    wt.click();
		    wt.sendKeys("DEL");
		    Thread.sleep(2000);
		    //driver.findElement(to).sendKeys("DEL");
	       //WebElement ele2 = wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//a[@value='DEL'])[1]"))));
	       //act.moveToElement(ele2).perform();
		    
	       //driver.findElement(destCity).click();
	   }
	  /* @DataProvider (name="cities")
	   public Object[][] setupData(){
		   return new Object[][] {{arr1.get(2),arr1.get(3),"GBP"},{"AMD","MAA","GBP"}};
	   }*/
}
