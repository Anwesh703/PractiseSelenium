package maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnoationExample {
@BeforeSuite(alwaysRun = true)
	public void beforesuiteMethod(){
	System.out.println("@beforeSuite");
}
@BeforeTest(alwaysRun = true)
public void beforeTestMethod(){
System.out.println("@beforeTest");
}
@BeforeClass(alwaysRun = true)
public void beforeclassMethod(){
System.out.println("@beforeClass");
}
@BeforeMethod(alwaysRun = true)
public void beforeMethod(){
System.out.println("@beforeMethod");
}

@BeforeGroups(groups = "abc")
public void beforeGroup(){
System.out.println("@beforeGroup");
}

@Test(groups = "abc")
public void testMethodsuite() {
	System.out.println("Testmethod1");
}
@Test(groups = "cde")
public void testMethodsuite2() {
	System.out.println("Testmethod2");
}

@AfterSuite(alwaysRun = true)
public void aftersuiteMethod(){
System.out.println("@AfterSuite");
}
@AfterTest(alwaysRun = true)
public void AfterTestMethod(){
System.out.println("@AfterTest");
}
@AfterGroups(groups = "abc")
public void AfterTestGroup(){
System.out.println("@Aftergroup");
}
@AfterClass(alwaysRun = true)
public void AfterclassMethod(){
System.out.println("@AfterClass");
}
@org.testng.annotations.AfterMethod
public void AfterMethod(){
System.out.println("@afterMethod");
}


}
