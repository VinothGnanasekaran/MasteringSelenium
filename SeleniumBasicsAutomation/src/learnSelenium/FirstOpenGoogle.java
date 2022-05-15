package learnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstOpenGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://www.google.co.in");
		System.out.println("Chrome Browser opened and initated successfully");
		driver1.quit();
		System.out.println("Chrome Browser Closed");
		
		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.get ("http://www.leafground.com");
		Thread.sleep(3000);
		driver2.quit();
		System.out.println("FireFox Browser Closed sucessfully");
		
	}

}
