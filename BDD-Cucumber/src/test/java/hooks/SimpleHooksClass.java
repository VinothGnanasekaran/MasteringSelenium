package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SimpleHooksClass {
	//To import BEFORE - implemented in the io.cucumber.java & Not org.Junit
	@Before
	public void beforeMethod() {
		//To be used to setup and invoke Browser/driver steps
		System.out.println("Before all method/step implementation or Ahead of execution");
	}
	//To import AFTER - implemented in the io.cucumber.java & Not org.Junit
	@After
	public void afterMethod() {
		//To be used for closure of browser or as per need
		System.out.println("after all method/step implementation or final method to be executed");
	}
}
