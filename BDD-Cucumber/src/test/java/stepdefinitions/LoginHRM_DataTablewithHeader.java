package stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginHRM_DataTablewithHeader  {
	WebDriver driver;
	@Given("Open chrome browser and navigate to OrangeHRM site")
	public void open_chrome_browser_and_navigate_to_orange_hrm_site() {
	    System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			System.out.println("The Login page is opened :"+driver.getTitle());
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@SuppressWarnings("deprecation")
	@When("Click on the Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("The login button is clicked");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Then("Close the browser")
	public void close_the_browser() {
		System.out.println("The Login is successful");
		driver.quit();
	}

	
	@When("Entering below Username and password with table")
	public void entering_below_username_and_password_with_table(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	  
		//WebDriver driver = new ChromeDriver();
		
		List<Map<String, String>> Creds = dataTable.asMaps(String.class, String.class);
		String userName = Creds.get(0).get("username");
		String passWord = Creds.get(0).get("password");
		
		driver.findElement(By.name("username")).sendKeys(userName);
		System.out.println("The user name is entered: " + userName);
		
		driver.findElement(By.name("password")).sendKeys(passWord);
		System.out.println("The password is entered: " + passWord);
	}

}
