package maven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Testngtest {
	By selectDropdown = By.id("mySelect"); //locators
	By hoverDropdown =By.id("dropOption2");
	By checkbox1 = By.className("checkBoxClassA");
	By textArea = By.name("textareaName");
	By link1= By.linkText("seleniumbase");
	By button = By.tagName("button");
	By textArea2 = By.xpath("//input[@id'mytextInput2']"); //xpath
@Test
	public void test_SeleniumDemoPage() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page/");
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/");
		String URL=driver.getCurrentUrl();
		String title=driver.getTitle();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().to("https://seleniumbase.io/demo_page/");
		if(URL.contains("https://seleniumbase.io/demo_page/")) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
		}
		
		//WebElement element = driver.findElement(By.id("myTextarea"));
		WebElement element = driver.findElement(textArea);
		element.click(); //= driver.findElement(By.id(""));
		element.sendKeys("Demo");
		String text =element.getAttribute("value");
		System.out.println(element.getText());
		System.out.println(driver.findElement(By.id("myButton")).getText());
		System.out.println(text);
		System.out.println(element.getAttribute("name"));
		System.out.println(element.getLocation());
		
		System.out.println(element.isDisplayed());
		System.out.println(driver.findElement(By.id("dropOption2")).isDisplayed());
		//selenium page element
       // WebElement ele = driver.findElement(By.id("header-page-title-inside"));	//error	
		//System.out.println(ele.isDisplayed());
		List<WebElement> list= driver.findElements(By.id("header-page-title-inside"));
		//negative test casing
		if(list.size()==0) {
			System.out.println("passed");
		}else {
			System.out.println("Failed");
		}
		element.isEnabled();
		driver.findElement(By.id("checkBox5")).isSelected();//true
		driver.findElement(By.id("checkBox4")).isSelected();//fasle (is used for checkboxes and (Radio buttons)
		driver.findElement(By.id("checkBox4")).isEnabled();//true
		//driver.findElement(By.id("checkBox1")).isSelected();
		driver.findElement(checkbox1).isSelected();
		driver.findElement(By.id("radioButton1")).isSelected();//true
	    //Select ss = new Select(driver.findElement(By.id("myselect")));
	    //ss.selectByValue("75%");
		Select ss = new Select(driver.findElement(selectDropdown));
	    ss.selectByVisibleText("Set to 75%");
		
		driver.close(); //Close current Driver session(closing particular tab)
		driver.quit();  //close Browser session
	}
 //public void test_sel2() {
	// System.out.println("bye");
 }

