package testMaven;

	import static org.testng.Assert.assertEquals;

	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import utils.ReadDataFromExcel;

	public class PageResponse extends BaseClass {

		@DataProvider(name = "Sheet1")
		public Object[][] readExcelFile1() throws IOException {
			ReadDataFromExcel readExcel = new ReadDataFromExcel();
			return new Object[][] { { readExcel.getData("Sheet1 From"), readExcel.getData("Sheet1 To"),
					readExcel.getData("Sheet1 Currency") } };
		}

		@DataProvider(name = "Sheet2")
		public Iterator<String> readExcelFile2() throws IOException {
			ReadDataFromExcel readExcel = new ReadDataFromExcel();
			return readExcel.getData("Sheet2").iterator();
		}

		@Test(dataProvider = "Sheet1")
		public void TestPriceList(String inputFrom, String inputTo, String inputCurrency) throws IOException {

//			System.out.println(Thread.currentThread().getId());

			By fromTextBox = By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']");
			By toTextBox = By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']");
			By toCity = By.xpath("//div[@id='dropdownGroup1']//a[@value='" + inputTo + "']");
			By currency = By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']");
			By searchBtn = By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']");
			By fareLocator = By.xpath("//tr/td[5]//span[@class='flightfare']");
			By flightNameLocator = By.xpath("//td/span/a/span[1]");

			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(fromTextBox))).sendKeys(inputFrom);
			driver.findElement(toTextBox).sendKeys(inputTo);
			driver.findElement(toCity).click();

			HelperClass.selectDate(driver, 10, "October");

			Select currencySelect = new Select(driver.findElement(currency));
			currencySelect.selectByValue(inputCurrency);
			
			driver.findElement(searchBtn).click();

			List<WebElement> flights = driver.findElements(flightNameLocator);

			List<WebElement> fareElements = wait
					.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(fareLocator)));

			List<Double> fares = new ArrayList<Double>();

			for (WebElement fareElement : fareElements) {
				if (fareElement.getText().equalsIgnoreCase("Fare Sold Out"))
					continue;
				double fare = Double.parseDouble(fareElement.getText().split(" ")[0]);

				fares.add(fare);
			}

			double firstFare = fares.get(0);
			double minFare = Collections.min(fares);

			System.out.println("Flight: " + flights.get(fares.indexOf(minFare)).getText() + "\nFare: " + minFare);

			assertEquals(firstFare, minFare);

		}

	}


