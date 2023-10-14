package runnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/java/features"
                ,glue="awwwDefination"
                ,tags="@Regression"
                ,plugin = {"html:target/cucumber-report1.html/",
                		"json:target/cucmber.json",
                		"pretty:target/cucumber-pretty.txt",
                		"junit:target/cucumber-result.xml"}
		)
public class TestRunnerAwww {

}
//"/*[name()='svg']"