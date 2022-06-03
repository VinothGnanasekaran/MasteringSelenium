package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {

	WebDriver driver;
	long startTime;

	@BeforeSuite
	public void driverInitialize() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void openGoogle() {

		driver.get("https://www.google.com");
	}
	@Test
	public void openYoutube() {

		driver.get("https://www.youtube.com");
	}
	@Test
	public void openBing() {

		driver.get("https://www.bing.com");
	}
	@AfterSuite
	public void closeBrowser() {
		driver.close();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Total time taken :"+totalTime);
	}


}
