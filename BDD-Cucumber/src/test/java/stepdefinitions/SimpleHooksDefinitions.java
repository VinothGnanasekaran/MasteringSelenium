package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleHooksDefinitions {

	
	@Given("I want to write a step for given step")
	public void i_want_to_write_a_step_for_given_step() {
	    System.out.println("Given-implemented");
	}

	@When("I complete action in when step")
	public void i_complete_action_in_when_step() {
	    System.out.println("When -Implemented");
	}

	@Then("I validate the outcomes in then step")
	public void i_validate_the_outcomes_in_then_step() {
	    System.out.println("Then- Implemented");
	}

}
