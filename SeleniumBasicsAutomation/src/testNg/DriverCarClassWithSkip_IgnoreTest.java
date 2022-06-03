package testNg;

import org.testng.annotations.Test;

public class DriverCarClassWithSkip_IgnoreTest {
	@Test (priority=0)
	public void startCar () {
		System.out.println("Start the car");
	}
	@Test (priority=1)
	public void putFirstGear () {
		System.out.println("First Gear");
	}
	@Test (priority=2)
	public void putSecondGear () {
		System.out.println("Second Gear");
	}
	@Test (priority=3)
	public void putThirdGear () {
		System.out.println("Third Gear");
	}
	@Test (priority=4)
	public void putFourthGear () {
		System.out.println("Fourth Gear");
	}
	
	/*Enabled is the method, which helps to make a Test to be ignored or skipped in flow.
	It takes boolen value (true/false) and by default, it is set as true 
	Below example, it is set to false, hence it will not be executed.*/
	
	@Test (priority=5,enabled=false)
	public void musicOn () {
		System.out.println("Turn Music ON after Fourth gear");
	}

}
