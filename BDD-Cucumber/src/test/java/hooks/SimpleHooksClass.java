package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SimpleHooksClass {
/*	//To import BEFORE - implemented in the io.cucumber.java & Not org.Junit
	@Before(order=1) //Executed at 2nd place
	public void beforeMethod() {
		//To be used to setup and invoke Browser/driver steps
		System.out.println("Before all method/step implementation and at Order=1");
	}
	//To import AFTER - implemented in the io.cucumber.java & Not org.Junit
	@After(order=1) //executed at n-1
	public void afterMethod() {
		//To be used for closure of browser or as per need
		System.out.println("after all method in step implementation and at order=n-1, pre-final method to be executed");
	}
	*/
	@Before(order=0) //Executed at 1st place
	public void beforeallMethod() {
		//To be used to setup and invoke Browser/driver steps
		System.out.println("@B:Initial / Ahead of execution");
	}
	//To import AFTER - implemented in the io.cucumber.java & Not org.Junit
	@After(order=0) //Executed at last place 'n'
	public void afterallMethod() {
		//To be used for closure of browser or as per need
		System.out.println("@A:Final (n) method to be executed");
	}
}
