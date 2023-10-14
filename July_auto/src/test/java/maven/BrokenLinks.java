package maven;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenLinks extends BaseClass{
@Test
	public void test001() throws IOException {
	WebDriver driver = lauchBrowser();
	List<WebElement> li = driver.findElements(By.xpath("//a"));
   System.out.println(li.size());
	for(WebElement e:li) {
    	String URL = e.getAttribute("href");
    	if(URL.isEmpty() || URL == null) {
    		System.out.println("URL is Broken "+ e.getAttribute("class"));
    	}
    	else {
    		try {
    		HttpURLConnection conn = (HttpURLConnection) new URL(URL).openConnection();
    	  conn.connect();
    	  int responseCode = conn.getResponseCode();
    	  conn.disconnect();
    	  if(responseCode!=200 && responseCode!=201) {
    		  System.out.println("URL is Broken "+URL+" "+responseCode);
    	  }else {
    		  System.out.println("URL is Working "+URL+" "+responseCode);
    	  }
    	}catch(Exception e1) {
    		e1.printStackTrace();
    		System.out.println("URL is Broken "+URL);
    	}
    	
    	}}
	


}
}
