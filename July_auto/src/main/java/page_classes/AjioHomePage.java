package page_classes;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AjioHomePage {
	WebDriver driver;
	public AjioHomePage(WebDriver driver) {
		this.driver=driver;
	}
	By search = By.xpath("//input[@placeholder='Search AJIO']");
	By searchIcon = By.xpath("//span[@class='ic-search']");
	By men = By.xpath("//label[@for='Men']");
	By formal = By.xpath("//label[@for='Men - Formal Shoes']");
	public By brand = By.xpath("//label[@for='Bata']");
	public By company = By.xpath("//span[text()='brands']");
	By more = By.id("verticalsizegroupformat");
	By color = By.xpath("//label[@for='Maroon']");
	By lowPrice = By.xpath("//option[@value='prce-asc']");
	public WebElement search() {
		return driver.findElement(search);
	}
	public WebElement searchIcon() {
		return driver.findElement(searchIcon);
	}
	public WebElement men() {
		return driver.findElement(men);
	}
	public WebElement formal() {
		return driver.findElement(formal);
	}
	public WebElement company() {
		return driver.findElement(company);
	}
	public WebElement brandSelection() {
		return driver.findElement(brand);
	}
	public WebElement more() {
		return driver.findElement(more);
	}
	public WebElement color() {
		return driver.findElement(color);
	}
	public WebElement lowPrice() {
		return driver.findElement(lowPrice);
	}

	
}
