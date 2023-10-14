package testMaven;
	import java.io.IOException;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;

	import io.github.bonigarcia.wdm.WebDriverManager;
	import utils.ReadPropertyFile;

	public class BaseClass {

//		String browser;
		String url;
		WebDriver driver;

		@BeforeTest(enabled = true)
		public void setEnvVariables() throws IOException {
//			browser = ReadPropertyFile.readProperty("browser");
			url = ReadPropertyFile.getDataFromProperty("url");
		}

		@BeforeMethod(enabled = true)
		@Parameters({ "browser" })
		public void startBrowser(String browser) {

			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}

			driver.get(url);

			while (!driver.getCurrentUrl().equals(url)) {
				driver.get(url);
			}
			driver.manage().window().maximize();
		}

		@AfterMethod(enabled = true)
		public void closeDriver() {
			driver.quit();
		}

	}


