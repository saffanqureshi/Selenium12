package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
		features="src/test/java/",
		glue="steps"
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
