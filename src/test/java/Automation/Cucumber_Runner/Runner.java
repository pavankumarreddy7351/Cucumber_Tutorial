package Automation.Cucumber_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\src\\test\\java\\Automation\\Cucumber_Test1\\tags.feature",
		glue = "Automation.Cucumber_StepDefination",
		//step by step execustion goto stepNotification=true
		stepNotifications = true,
		//without selenium goto dry run=true
		dryRun = true,
		//reports goto plugins
		plugin = {"pretty", "html:target/cucumberReport.html",
							"json:target/cucumberReport.json",
							"junit:target/cucumberReport.xml"},
		//unwanted symbol remove in consol goto monochrome=true
		monochrome = true
		//test the tags its case sensitive
		//tags = "@Smoke or @Sanity"

		
		
		
		)

public class Runner {

}
