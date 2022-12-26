package stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginHRM_MutipleRowsDatatable {
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Given("Open OrangeHRM site")
	public void open_orange_hrm_site() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("The Login page is opened :"+driver.getTitle());
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("Enter Username and password with table combination")
	public void enter_username_and_password_with_table_combination(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<Map<String, String>> table = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : table) {
			String userName = row.get("username");
			String passWord = row.get("password");
			String loginValidationMessage = row.get("message");

			driver.findElement(By.name("username")).sendKeys(userName);
			driver.findElement(By.name("password")).sendKeys(passWord);
			System.out.println("The Login combination provided from DataTable :" +loginValidationMessage);

			driver.findElement(By.xpath("//button[@type='submit']")).click();
			System.out.println("The login button is clicked");

			try {
				if(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).isDisplayed()) {
					String actualMessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
					Assert.assertTrue(actualMessage.equalsIgnoreCase(loginValidationMessage));	
					System.out.println("The login is NOT SUCCESS due to :" +actualMessage);
				}

			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	@Then("Quit the browser")
	public void quit_the_browser() {
		System.out.println("The Login is successful");
		driver.quit();

	}

}
