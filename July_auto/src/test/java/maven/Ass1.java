package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass1 {
	By Prefilled = By.id("myTextInput2");
	By textArea = By.id("myTextarea");
	By dropDown = By.id("mySelect");
	By Radio2 = By.id("radioButton2");
	By checkbox3 = By.id("checkBox3");
	By PreFilledCheckBox = By.id("checkBox5");
	By link1= By.linkText("seleniumbase.com");
	@Test
	public void method() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://seleniumbase.io/demo_page/");
	driver.findElement(By.id("myTextInput2")).clear();
	driver.findElement(By.id("myTextarea")).sendKeys("Anwesh");
	By selectDropdown = By.id("mySelect");
	Select ss = new Select(driver.findElement(selectDropdown));
    ss.selectByVisibleText("Set to 50%");
    driver.findElement(By.id("radioButton2")).click();
    driver.findElement(By.id("checkBox3")).click();
    if(driver.findElement(By.id("checkBox5")).isSelected()!=true) {
    	driver.findElement(By.id("checkBox5")).click();
    }
    if(driver.findElement(By.id("myTextInput2")).getAttribute("value").isEmpty()) {
    	System.out.println("Validations Passed");
    }
    //3
    By link1= By.linkText("seleniumbase.com");
    driver.findElement(link1).click();
    driver.close();
    driver.quit();
    
}
	@Test
	public void method1() {
		System.out.println("Method in diffferent class Ass1");
	}
}