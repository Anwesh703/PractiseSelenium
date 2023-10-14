package testMaven;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class HelperClass {

		public static void selectDate(WebDriver driver, int date, String month) {
			By next = By.xpath("//a[@title='Next' and @data-handler='next']");
			By calMonth = By.xpath("(//span[@class='ui-datepicker-month'])[1]");
			By calDate = By.xpath("//tbody//tr//td//a[text()='" + date + "']");

			while (!month.equals(driver.findElement(calMonth).getText()))
				driver.findElement(next).click();

			driver.findElement(calDate).click();
		}
	}
