package testNg;

import org.testng.annotations.Test;

public class DependenciesManageClass {
	@Test
	public void highSchool () {
		System.out.println("High School - completed");
	}
	@Test (dependsOnMethods = "highSchool") 
	//@Test (dependsOnMethods = "highSchool", enabled=false) - Throws exceptions
	public void higherSeconday () {
		System.out.println("Hr Sec - completed");
	}
	@Test (dependsOnMethods = "higherSeconday")
	public void college () {
		System.out.println("college-Er - completed");
	}

	/*dependsOnMethod = connects the previous method in an order to be executed and only if the
	 * previous method is executed successfully. IF Previous dependent method failed,
	 * following methods will not be executed.*/
	
	

}
