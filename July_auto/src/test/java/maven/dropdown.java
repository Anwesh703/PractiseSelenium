package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class dropdown {
	@Test
	public void method() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://seleniumbase.io/demo_page/");
	By selectDropdown = By.id("mySelect");
	Select ss = new Select(driver.findElement(selectDropdown));
    ss.selectByVisibleText("Set to 75%");
    WebElement element = driver.findElement(By.name("textareaName"));
    System.out.println(element.getAttribute("name"));
	}
}
