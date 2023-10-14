package maven;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import page_classes.SpiceJetHomePage;
import util.ReadPropertyFile;

public class BaseClass {
SpiceJetHomePage sp;
public WebDriver driver;
public static Logger log = LogManager.getLogger(BaseClass.class.getName());
ReadPropertyFile rp = new ReadPropertyFile();
public WebDriver lauchBrowser() throws IOException {
      String browser = rp.getDataFromProperty("browser");
      String URL = rp.getDataFromProperty("URL");
     /* if(rp.getDataFromProperty("grid").equals("YES")) {
    	  DesiredCapabilities ds = new DesiredCapabilities();
    	    ds.setBrowserName("chrome");//BrowserType.CHROME
    	    ds.setPlatform(Platform.WINDOWS);
    	    driver = new RemoteWebDriver(new URL("http://192.168.0.5:4444/wd/hub"),ds);
      }else {  */
     if(browser.equalsIgnoreCase("Chrome")) {
    	 WebDriverManager.chromedriver().setup();
    	 ChromeOptions co = new ChromeOptions();
    	 co.addArguments("--disable-notifications");
    	 co.setAcceptInsecureCerts(true);
    	 co.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
    	 co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
    	 driver = new ChromeDriver(co);
     }else if(browser.equalsIgnoreCase("Firefox")) {
    	 WebDriverManager.firefoxdriver().setup();
    	 FirefoxOptions fo = new FirefoxOptions();
    	 fo.setAcceptInsecureCerts(true);
    	 driver = new FirefoxDriver(fo);
     }else if(browser.equalsIgnoreCase("Edge")) {
    	 WebDriverManager.edgedriver().setup();
    	 EdgeOptions eo = new EdgeOptions();
    	 eo.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
    	 eo.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
    	 driver = new EdgeDriver(eo);
     }
     else {
    	 System.out.println("Mention correct browser name - Chrome / Firefox");
    	 return null;
    	 
     }
     //}
      driver.get(URL);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	return driver;}
 public void switchToWindow(String title) {
	 Set<String> windows = driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		boolean flag = false;
	     while(it.hasNext()) {
	    	 String handle = it.next();
	    	 driver.switchTo().window(handle);
	    	 if(driver.getTitle().equals(title)) {
	    		flag = true;
	    		driver.findElement(By.xpath("//img")).click();
	    		 break;
	    		 }
	    	 }
	     if(flag) {
	    System.out.println("driver switched to correct window");
	     }else {
	    	 System.out.println("no window available");
	     }
	     }
 public Boolean verifyElement() {
	 try {
		 return true;
	 }catch(Exception e) {
		 return false; 
	 }
 }
 public String takeScreenshots(WebDriver driver,String methodName) throws IOException {
TakesScreenshot ts = (TakesScreenshot)driver;
File ss = ts.getScreenshotAs(OutputType.FILE);
String path = System.getProperty("user.dir")+"\\screenshot\\screen"+methodName+".png";
FileUtils.copyFile(ss,new File(path));
return path;
//"C:\\Users\\anwreddy\\eclipse-workspace\\demo"
}

public WebElement fluentWaitImplementation(WebDriver driver,final By locator) {
Wait<WebDriver> wt = new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(20))
.pollingEvery(Duration.ofSeconds(2))
.ignoring(NoSuchElementException.class);

return wt.until(new Function<WebDriver,WebElement>(){
	public WebElement apply(WebDriver driver) {
		return driver.findElement(locator);}
});
} 
public void scrolltoElement(By ele) {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(ele);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		log.info("Scrolled to element");
}
public WebElement expandRootElement(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
    WebElement ele = (WebElement) js.executeScript("return arguments[0].shadowRoot",element);
    return ele;
}
}
/*WebElement element = driver.findElement(By.id("gbqfd"));
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", element);*/