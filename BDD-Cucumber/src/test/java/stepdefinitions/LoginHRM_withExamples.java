package stepdefinitions;

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

public class LoginHRM_withExamples {

	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Given("Open OrangeHRM site for login")
	public void open_orange_hrm_site_for_login() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("The Login page is opened :"+driver.getTitle());
	}

	@When("Enter {string} and {string} with Example table combination")
	public void enter_and_with_example_table_combination(String userName, String passWord) {
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(passWord);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("The login button is clicked");

		try {
			if(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).isDisplayed()) {
				String actualMessage = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText();
				Assert.assertTrue(actualMessage.equalsIgnoreCase("Invalid Credentials"));	
				System.out.println("The login is NOT SUCCESS");
			}

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("The login is SUCCESS");
		}

	}

	@Then("Close the login browser")
	public void close_the_login_browser() {
		System.out.println("The Browser is closed");
		driver.quit();

	}
}
