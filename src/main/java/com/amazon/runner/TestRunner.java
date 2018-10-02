package com.amazon.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features= "D:/SeleniumQAProject/Cucumber_Amazon/src/main/java/com/amazon/features/amazon.features",
			glue= {"com.amazon.stepdefinition"},
			monochrome=true,
			plugin= {"pretty","html:html-output/index.html","junit:cucumber_junit/cucmber.xml","json:cucmber_json/cucmber.json"},
			dryRun=false,
			strict=true
		)

public class TestRunner {

}
