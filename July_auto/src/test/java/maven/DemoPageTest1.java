package maven;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(listenersPackage.ListenersClass.class)
public class DemoPageTest1 extends BaseClass{
	By hoverObject = By.xpath("//*[@id='myDropdown']");
    By dropDown2Link = By.id("dropOption3");
    By heading3 = By.xpath("//h2");
    By slider = By.id("mySlider");
    By progressGraph = By.id("progressLabel");
    By iframeText = By.id("myFrame2");
    By button = By.id("myButton");
    By iframeHeaderText = By.xpath("//h4");
    public WebDriver driver;
    WebDriverWait wt;
    @BeforeMethod (alwaysRun = true)
    public void setup() throws IOException {
    	driver = lauchBrowser();
    }
	@Test(priority = 0,groups = {ProjectParameters.SMOKE,ProjectParameters.REGRESSION},retryAnalyzer = listenersPackage.RetryAnalyzer.class)//{"Smoke","Regression"})      //If we dont provide priority then that test is considered as high priority i.e.=0
	
	public void testHandleMouseHover() throws IOException {

    Actions act = new Actions(driver);
    SoftAssert sf= new SoftAssert();
    //ExplicitWait
    //WebDriverWait wt = new WebDriverWait(driver,20);
    //WebElement ele1 = wt.until(ExpectedConditions.visibilityOf(driver.findElement(hoverObject)));
    //act.moveToElement(ele1).perform();
    //FluentWait
    WebElement ele2 = fluentWaitImplementation(driver,hoverObject);
    act.moveToElement(ele2).perform();
    //act.moveToElement(driver.findElement(hoverObject)).perform();
    if(driver.findElement(dropDown2Link).isDisplayed()) {
    	driver.findElement(dropDown2Link).click();
    	sf.assertEquals(driver.findElement(heading3).getText(),"Link Two Selected");
    //	takeScreenshots("heading3");
    	sf.assertTrue(driver.findElement(progressGraph).isDisplayed());
    	//takeScreenshots("progressGraph");
       /* hard assertions assertEquals(driver.findElement(heading3).getText(),"Link Two Selected");
       assertTrue(driver.findElement(progressGraph).isDisplayed());
    */
    }
    	/*if(driver.findElement(heading3).getText().equals("Link Two Selected"))
    		System.out.println("Passed");
    	else
    		System.out.println("Failed");
    }*/else {
    	System.out.println("Mouse hover event failed");
    }
    WebElement ele = driver.findElement(slider);
    act.clickAndHold(ele)
       .dragAndDropBy(ele,30, 0)
       .release()
       .build()
       .perform();/*
      if(driver.findElement(progressGraph).getText().contains("70")) {
    	   System.out.println("Passed");}
    	  else {
    		  System.out.println("Failed");
      }*/
    sf.assertTrue(driver.findElement(progressGraph).getText().contains("30"));
    // sf.assertEquals(driver.findElement(progressGraph).getText(),"70");
   //  takeScreenshots("progressGraph");
     act.sendKeys(driver.findElement(By.id("myTextarea")),"Hello")
      .sendKeys(Keys.TAB)
      .sendKeys("Test")
      .sendKeys(Keys.TAB)
      .sendKeys(Keys.ENTER)
      .build()
      .perform();
    sf.assertAll();
    System.out.println("After Assertion");
}
	@Test(description = "This test will execute frames",timeOut = 2000,groups = "Regression",dependsOnGroups = "Smoke")//(enabled = false,dependsOnMethods = "a_iframeTest",description = "This test will execute frames",timeOut = 1000)//(dependsOnMethods = {"a_iframeTest","testHandleMouseHover"})
    public void z_iframeTest() throws IOException {
    	
    	driver.switchTo().frame(2);
    	driver.findElement(By.xpath("//*[@id='checkBox6']")).click();
    	driver.switchTo().defaultContent();
    	driver.switchTo().frame(driver.findElement(iframeText));
        System.out.println(driver.findElement(iframeHeaderText).getText());
    	driver.switchTo().defaultContent();
    	driver.findElement(button).click();  
}
@Test(priority = 2,groups = "Smoke")
    public void a_iframeTest() throws IOException {
    	
    	driver.switchTo().frame(2);
    	driver.findElement(By.xpath("//*[@id='checkBox6']")).click();
    	driver.switchTo().defaultContent();
    	driver.switchTo().frame(driver.findElement(iframeText));
        System.out.println(driver.findElement(iframeHeaderText).getText());
    	driver.switchTo().defaultContent();
    	driver.findElement(button).click();  
}
@AfterMethod(alwaysRun = true)
public void tearDown() {
	driver.quit();
}

}


