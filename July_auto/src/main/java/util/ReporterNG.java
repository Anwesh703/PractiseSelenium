package util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReporterNG {
public static ExtentReports configReport() {
	File f = new File("C:\\Users\\anwreddy\\eclipse-workspace\\July_auto\\Reports\\"+dateTime()+".html");
	ExtentSparkReporter reporter = new ExtentSparkReporter(f);
	reporter.config().setReportName("July Execution");
	reporter.config().setDocumentTitle("Automation Report - July");
	ExtentReports extents = new ExtentReports();
	extents.attachReporter(reporter);
	extents.setSystemInfo("Tester","Anwesh");
	extents.setSystemInfo("Execution","Web");
	return extents;
}
public static String dateTime() {
	Date dt = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy h_m_s_SSSS");
	return sdf.format(dt);
}
}
