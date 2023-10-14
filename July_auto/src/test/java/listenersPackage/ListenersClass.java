package listenersPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import maven.BaseClass;
import util.ReporterNG;

public class ListenersClass extends BaseClass implements ITestListener  {
	ExtentReports extent = ReporterNG.configReport();
	ExtentTest test;
	ThreadLocal<ExtentTest> th = new ThreadLocal<ExtentTest>();
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("start of our execution");
		test=extent.createTest(result.getMethod().getMethodName());
	th.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("my test id passed");
	th.get().log(Status.PASS,"Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String path;
		WebDriver driver=null;
	System.out.println("my test is failed");
	th.get().log(Status.FAIL, "Test Failed");
				try {
					driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
				} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException
						| SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			try {
				path=takeScreenshots(driver,result.getMethod().getMethodName());
				th.get().fail(result.getThrowable(),MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		th.get().log(Status.SKIP, "Skiped this test");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Initiating execution");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	extent.flush();
	}

}
