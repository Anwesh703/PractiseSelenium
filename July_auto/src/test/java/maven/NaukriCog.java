package maven;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriCog {
	@Test
	public void method() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	//driver.get("https://company.naukri.com/landing-page/cognizant/05072021/index.html");
	driver.get("https://www.naukri.com/");
	String parent = driver.getWindowHandle();
	System.out.println("Parent address is "+parent);
	Set<String> str = driver.getWindowHandles();
	System.out.println("Total opened tabs "+str.size());
	 Iterator<String> it= str.iterator();
     while(it.hasNext()) {
    	 String child = it.next();
    	 if(!parent.equals(child)) {
     	//driver.switchTo().window(child).manage().window().maximize();
     	
     	driver.switchTo().window(child);
     	Thread.sleep(2000);
        driver.findElement(By.xpath("//img[1]")).click();
       // driver.findElement(By.xpath("//a[@href='https://www.naukri.com/job-listings-050721901233']")).click();
     break;}
    	 String cog = driver.getWindowHandle();
         driver.switchTo().window(cog).findElement(By.xpath("//a[@href='https://www.naukri.com/job-listings-050721901233']")).click();
    
	}  //driver.findElement(By.xpath("//a[@href='https://www.naukri.com/job-listings-050721901233']")).click();
        //driver.switchTo().window(parent).close();
    // driver.findElement(By.xpath("//a[@href='http://w28.naukri.com/advertiser/bms_hits.php?banner=7305498']")).click();
     
} }
