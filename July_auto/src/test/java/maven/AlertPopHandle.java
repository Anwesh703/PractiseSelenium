package maven;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AlertPopHandle extends BaseClass{
@Test
public void alertHandle() throws IOException, InterruptedException {
	By CustID = By.name("cusid");
	By submit = By.name("submit");
	WebDriver driver = lauchBrowser();
	driver.findElement(CustID).sendKeys("9203");
	driver.findElement(submit).click();
	driver.findElement(By.name("res")).click();
	Alert alert = driver.switchTo().alert();
	//alert.dismiss(); if alert is not their that kind of errors we get
	//alert.dismiss();
	System.out.println(alert.getText());
	alert.accept();
	Thread.sleep(2000);
	alert.accept();
	Thread.sleep(4000);
	System.out.println(driver.findElement(CustID).getAttribute("value"));
}
}//http://demo.guru99.com/test/web-table-element.php

