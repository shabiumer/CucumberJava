package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\umer_s\\eclipse-workspace\\CucumberFramework\\src\\test\\resources\\functionalTest",
		glue = {"stepDefinitions"}
		)

public class TestERunner {

}
