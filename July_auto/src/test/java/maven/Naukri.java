package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.*;

public class Naukri {
	@Test
	public void method() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	String parent = driver.getWindowHandle();
	System.out.println("Parent address is "+parent);
	Set<String> str = driver.getWindowHandles();
	System.out.println("Total opened tabs "+str.size());
	 Iterator<String> it= str.iterator();
     while(it.hasNext()) {
    	 String child = it.next();
    	 if(!parent.equals(child)) {
     	driver.switchTo().window(child);
     	Thread.sleep(2000);
     	driver.close();
     }}driver.switchTo().window(parent);
} }
