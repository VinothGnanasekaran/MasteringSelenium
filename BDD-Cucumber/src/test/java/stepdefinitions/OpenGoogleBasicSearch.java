package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleBasicSearch {
	WebDriver driver ;
	@Given("User opens the browser to launch Google site")
	public void user_opens_the_browser_to_launch_google_site() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");

	}

	@When("User wants to search the keyword  {string}")
	public void user_wants_to_search_the_keyword(String keyword) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(keyword);
		System.out.println("search keyword is entered in querybox");

	}

	@When("clicks on enter key")
	public void clicks_on_enter_key() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("Enter Key is pressed for seach");
	}

	@Then("Validate the new search results page outcome")
	public void validate_the_new_search_results_page_outcome() {
		// Write code here that turns the phrase above into concrete actions
		boolean displayed = driver.findElement(By.partialLinkText("Speedtest")).isDisplayed();
		if(displayed) {
			System.out.println("New Search page is displayed");
		}
		else {
			System.out.println("error is the search code implementation");
		}
		driver.quit();
	}
}
