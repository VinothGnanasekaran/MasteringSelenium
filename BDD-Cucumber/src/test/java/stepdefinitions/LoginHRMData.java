package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginHRMData {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Given("I want to open browser and navigate to OrangeHRM site")
	public void i_want_to_open_browser_and_navigate_to_orange_hrm_site() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("The Page opened is "+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}

	@When("I enter Username {string} and password {string}")
	public void i_enter_username_and_password(String userName, String passWord) {
		WebElement uName = driver.findElement(By.name("username"));
		uName.sendKeys(userName);
		System.out.println("The user name is entered: " + userName);
		WebElement pWord = driver.findElement(By.name("password"));
		pWord.sendKeys(passWord);
		System.out.println("The password is entered: " + passWord);
	}

	@When("click on Login button")
	public void click_on_login_button() {
		//WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		System.out.println("The login button is clicked");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Then("I validate the Landing page")
	public void i_validate_the_landing_page() {
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	WebElement dashBoard = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
			//partialLinkText("//*[contains(text(),'OrangeHRM')]")); 
	boolean loginStatus = dashBoard.isDisplayed();
	org.junit.Assert.assertTrue(loginStatus);
	System.out.println("The Login is successful");
	driver.quit();
	}

}
