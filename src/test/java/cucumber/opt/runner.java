package cucumber.opt;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature",glue = {"stepdefintion","baseclss"},tags= "@Reg",
plugin ="json:target/jsonReports/report.json")
public class runner extends AbstractTestNGCucumberTests {
	
}

