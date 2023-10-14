package maven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class GetCurrentUrl {
	
	   public static void main(String[] args) {
	      System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      String url = "https://www.tutorialspoint.com/index.htm";
	      driver.get(url);
	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      // get current URL and print
	      String strUrl = driver.getCurrentUrl();
	      System.out.println("Current Url is:"+ strUrl);
	      System.out.println("Page title is : " + driver.getTitle());
	      driver.navigate().to("https://seleniumbase.io/demo_page/");
	      String strUrl1 = driver.getCurrentUrl();
	      if(strUrl1.contains("https://seleniumbase.io/demo_page/")) {
				System.out.println("Test passed");
			}else {
				System.out.println("Test failed");
			}
	      // driver.quit();
	   }
	}
