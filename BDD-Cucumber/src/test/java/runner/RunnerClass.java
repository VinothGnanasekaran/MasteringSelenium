package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

//To learn about Cucumber options 
/*
@CucumberOptions (
		features = "featurefiles" ,
		glue = "stepdefintions" ,
		// Boolean - if true-only checks all the step definitions are implemented before actual execution; if false, it executes
		//Strict= true  - executes first and reports error if any non-implemented steps ; False-No use of defining; Currently not in use.
		dryRun = true , 
		//Makes the console output in human readable form
		monochrome = true , 
		// Generates reports of desired format as per JSON/HTML/XML or pretty format syntax said below.
		// format() - was used earlier, now depricated and Plugin() is suggested
		//plugin = { "pretty" } - This provides more verbose output.(in console). To implement this, just specify plugin = "pretty" in CucumberOptions. 
		plugin = {"html:target/cucumber-Webreport", "json:target/cucumber-jsonreport.json", "junit:target/cucumber-xmlReport.xml"},
		//Tags - to group the feature / scenario  as per business needs
		//This is clubbing of tags by OR Method - if included tags are found, then it will execute those feature/scenarios.
		tags = "@simpleLogin, @dataDriven, @smoke", 
		//This is clubbing of tags in AND Method - if included seperately, then Tags common across feature/scenarios only will be  executed
		tags = "@simpleLogin" , "@LoginHRM" , "@smoke" 
		)
*/


//@CucumberOptions(features = "featurefiles/openGoogleSearch.feature",glue="stepdefinitions" )
//@CucumberOptions(features = "featurefiles/RegEx.feature",glue="stepdefinitions" )
//@CucumberOptions(features = "featurefiles/LoginHRM_DataTable.feature",glue="stepdefinitions" )
//@CucumberOptions(features = "featurefiles/LoginHRM_DataTablewithoutHeader.feature",glue="stepdefinitions" )
//@CucumberOptions(features = "featurefiles/LoginHRM_DataTablewithHeader.feature",glue="stepdefinitions" )
//@CucumberOptions(features = "featurefiles/LoginHRM_MutipleRowsDatatable.feature",glue="stepdefinitions" )
//@CucumberOptions(features = "featurefiles/LoginHRM_withExamples.feature",glue="stepdefinitions" )

@CucumberOptions (
		features = "featurefiles/SimpleHooks.feature",
		glue = {"stepdefinitions", "hooks"},
		monochrome = true,
		dryRun= false,
		plugin = {"html:target/cucumberReports/Webreport.hmtl" , "json:target/cucumberReports/Hooks.json", "junit:target/cucumberReports/HooksXML.xml"},
		tags = "@simplehooks"
		)
		
public class RunnerClass {

}
