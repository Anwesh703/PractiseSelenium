package maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverFun{
	WebDriver driver;
@Test
public  void browser(String s,String d) {
	
	/*switch(s) {
	    case "chrome":
		    WebDriverManager.chromedriver().setup();
		     return driver = new ChromeDriver();
		     break;
	    case "chrom":
		    WebDriverManager.chromedriver().setup();
		     driver = new ChromeDriver();
		     break;*/
	if(s.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver().get(d);
	}	}
public void ma() {
	//driver = browser("chrome","https://www.youtube.com/watch?v=Lga-_DV5Rx4");
}
	}
