package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "featurefiles/openGoogleSearch.feature",glue="stepdefinitions" )
@CucumberOptions(features = "featurefiles/RegEx.feature",glue="stepdefinitions" )
public class RunnerClass {

}
