package maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listenersPackage.ListenersClass.class)
public class JSExecutiorExample extends BaseClass{
public WebDriver driver;
By tableObject = By.id("product");
	@Test
	public void demo() throws IOException, InterruptedException {
		driver = lauchBrowser();
     /*   JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,600)");
	WebElement element = driver.findElement(By.id("mousehover"));
	js.executeScript("arguments[0].scrollIntoView(true);",element);
	log.info("Scrolled till table object");
	*/
		scrolltoElement(tableObject);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=300");
		
		}
}
