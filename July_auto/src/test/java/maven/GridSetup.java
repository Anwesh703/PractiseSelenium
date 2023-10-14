package maven;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridSetup {
@Test
public void testGridNodes() throws MalformedURLException {
	DesiredCapabilities ds = new DesiredCapabilities();
    ds.setBrowserName("chrome");
    ds.setPlatform(Platform.WINDOWS);
    WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.5:4444/wd/hub"),ds);
    driver.get("https://seleniumbase.io/demo_page");
}

}
