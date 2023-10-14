package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Assignment04 {
	By Prefilled = By.id("myTextInput2");
	By textArea = By.id("myTextarea");
	By dropDown = By.id("mySelect");
	By Radio2 = By.id("radioButton2");
	By checkbox3 = By.id("checkBox3");
	By PreFilledCheckBox = By.id("checkBox5");
	By link1= By.linkText("seleniumbase.com");
	
	@Test
	/*public void main() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page/");
		method();
	}*/
	public void method() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page/");
		driver.findElement(Prefilled).clear();
		driver.findElement(textArea).sendKeys("Anwesh");
		By selectDropdown = By.id("mySelect");
		Select ss = new Select(driver.findElement(dropDown));
	    ss.selectByVisibleText("Set to 50%");
	    driver.findElement(Radio2).click();
	    driver.findElement(checkbox3).click();
	    if(driver.findElement(PreFilledCheckBox).isSelected()!=true) {
	    	driver.findElement(PreFilledCheckBox).click();
	    }
	    if(driver.findElement(Prefilled).getAttribute("value").isEmpty()) {
	    	System.out.println("Validations Passed");
	    }
	    Thread.sleep(2000);
	    //3
	    driver.findElement(link1).click();
	    Thread.sleep(6000);
	    driver.close();
	    driver.quit();
		}}