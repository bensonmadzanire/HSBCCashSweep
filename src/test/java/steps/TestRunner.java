package steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/features"}, glue = "steps")
public class TestRunner extends AbstractTestNGCucumberTests {

}
