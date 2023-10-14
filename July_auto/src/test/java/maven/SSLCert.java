package maven;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
@Test
public class SSLCert extends BaseClass{
public void testSSLCertification() throws IOException {
WebDriver driver = lauchBrowser();
assertTrue(driver.findElement(By.xpath("//h1")).isDisplayed());
}}
