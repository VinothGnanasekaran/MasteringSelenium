package stepdefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataTableWithoutHeader {
WebDriver driver;
	@SuppressWarnings("deprecation")
	@Given("Open browser and navigate to OrangeHRM site")
	public void open_browser_and_navigate_to_orange_hrm_site() {
	    System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("The Login page is opened :"+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("Entering below Username and password")
	public void entering_below_username_and_password(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    // For other transformations you can register a DataTableType.
			 
		List<String> credential = dataTable.asList(String.class);
		String userName = credential.get(0);
		String passWord = credential.get(1); 
		
		driver.findElement(By.name("username")).sendKeys(userName);
		System.out.println("The user name is entered: " + userName);
		
		driver.findElement(By.name("password")).sendKeys(passWord);
		System.out.println("The password is entered: " + passWord);
	}

	@SuppressWarnings("deprecation")
	@When("Click Login button")
	public void click_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("The login button is clicked");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Then("Validate the Dashboard Landing page")
	public void validate_the_dashboard_landing_page() {
		System.out.println("The Login is successful");
		driver.quit();
	}

}
