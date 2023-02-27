package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegExImplementation {

	//This is custom generated by using RegEx
	@Given("^I want to write a step with (\\d+) numeric$")
	public void i_want_to_write_a_step_with_numeric(Integer int1) {
		System.out.println("The Integer passed is: "+ int1);
	}

	@When("^I check with (.+) decimal$")
	public void i_check_with_decimal(Double double1) {
		System.out.println("The Decimal passed is: "+ double1);
	}

//	@Then("Myname is \"([^\"]*)\" and i am a (.*) and i get salary above {string} now")
//	public void myname_is_and_i_am_a_and_i_get_salary_above_now(String name, String role, String salary) {
//		System.out.println(name + " is currently a Full Stack QA "+ role + " now leads big team as Techno-Manager with Salary : " + salary);
//	}

	@Then("Myname is {string} and i am a {string} and i get salary above {string} now")
	public void myname_is_and_i_am_a_and_i_get_salary_above_now(String name, String role, String salary) {
		System.out.println(name + " is currently a Full Stack QA "+ role + " now leads big team as Techno-Manager with Salary : " + salary);
	}

	/*This is the default method created by Cucumber Feature	
	 * @Given("I want to write a step with {int} numeric")
	public void i_want_to_write_a_step_with_numeric(Integer int1) {

	}

	@When("I check with {double} decimal")
	public void i_check_with_decimal(Double double1) {

	}

	@When("Myname is {string} and i am a {string}")
	public void myname_is_and_i_am_a(String string, String string2) {

	}*/

}