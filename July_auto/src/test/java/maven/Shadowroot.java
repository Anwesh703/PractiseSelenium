package maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shadowroot extends BaseClass{
public void test01() throws IOException {
	WebDriver driver = lauchBrowser();
	WebElement element = driver.findElement(By.xpath(null));
	WebElement sr1 = expandRootElement(element);
	WebElement div2 = sr1.findElement(By.xpath(""));
}
}
