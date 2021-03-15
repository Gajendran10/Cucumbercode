package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@src/test/resources/failed.txt", glue = "stepdefinition", plugin = {
		"html:target", "json:target/report.json",
		"rerun:src/test/resources/failed.txt" }, tags = { "@tag1" }, dryRun = false, monochrome = true, strict = true)

public class Testrerunner {

}
