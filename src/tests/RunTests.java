package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features", //pasta..
		glue = "tests", //pacote..
		plugin = {
				"html:target/cucumber-html-report"
		}
)
public class RunTests {
	
	
}