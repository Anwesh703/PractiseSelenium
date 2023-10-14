package maven;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Naukrimain extends BaseClass{
	@Test
	public void cogni() throws IOException {
		WebDriver driver = lauchBrowser();
		//driver.get("https://company.naukri.com/landing-page/techmahindra/18062021/index.html");
		//driver.switchTo().window("https://company.naukri.com/landing-page/techmahindra/18062021/index.html");
		//System.out.println(driver.getTitle());
	    //driver.findElement(By.xpath("//img")).click();
		switchToWindow("Tech Mahindra");
	    
		
		
	}

}
