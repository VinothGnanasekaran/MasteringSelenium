package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background_Hooks {
WebDriver driver;

@Given("User should have laptop powered-On")
public void user_should_have_laptop_powered_on() {
    System.out.println("Bg1: The Laptop is switched ON");
}

@Given("User should have connected to internet")
public void user_should_have_connected_to_internet() { 
	System.out.println("Bg2: The Internet is Connected to Laptop");
}

@Given("I want to open the chrome browser")
public void i_want_to_open_the_chrome_browser() {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	System.out.println("G: The Browser is launched now");
}

@When("I launch the Google page")
public void i_launch_the_google_page() {
	
	driver.get("https://google.co.in");
	System.out.println("W: Google Page is launched in browser");
}

@Then("I get the title of the Google page successfully")
public void i_get_the_title_of_the_google_page_successfully() {
	boolean titleMatch = driver.getTitle().equalsIgnoreCase("Google");
	Assert.assertTrue(titleMatch);
	System.out.println("T: Verified the Google page is opened successfully");	
	driver.quit();
	System.out.println("Browser closed");	
}

@When("I launch the Bing page")
public void i_launch_the_bing_page() {
	driver.get("https://www.bing.com/");
	System.out.println("W: Bing Page is launched in browser");
}

@Then("I get the title of the Bing page successfully")
public void i_get_the_title_of_the_bing_page_successfully() {
	boolean titleMatch = driver.getTitle().equalsIgnoreCase("Bing");
	Assert.assertTrue(titleMatch);
	System.out.println("T: Verified the Bing page is opened successfully");	
	driver.quit();
	System.out.println("Browser closed");	
}

@When("I launch the Eckankar page")
public void i_launch_the_eckankar_page() {
	driver.get("https://www.eckankar.org");
	System.out.println("W: Eckankar Page is launched in browser");
}

@Then("I get the title of the Eckankar page successfully")
public void i_get_the_title_of_the_eckankar_page_successfully() {
	String acTitle = driver.getTitle();
	boolean titleMatch = acTitle.contains("ECKANKAR,");
	Assert.assertTrue(titleMatch);
	System.out.println("T: Verified the Eckankar page is opened successfully");	
	driver.quit();
	System.out.println("Browser closed");	
}

}
