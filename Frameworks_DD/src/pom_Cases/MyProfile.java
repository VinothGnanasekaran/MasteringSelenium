package pom_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom_ObjRepo.LoginPageObjects;
import pom_ObjRepo.MyProfilePageObjects;

public class MyProfile {

	String driverPath_FF= "D:\\Automation\\Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe";
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", driverPath_FF);
		driver = new FirefoxDriver();
		driver.get("https://phptravels.net/login");
		//driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Browser initiated and launched the landing page: "+ driver.getTitle());
	}
	
	@AfterTest
	public void closeBroswer() {
		driver.quit();
		System.out.println("The browser is closed");
	}
	

	@Test
	public void MyProfileUpdate() throws InterruptedException {
		
		LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
		System.out.println("The username is entered");
		LoginPageObjects.passWord(driver).sendKeys("demouser");
		System.out.println("The password is entered");
		LoginPageObjects.loginButton(driver).click();
		System.out.println("The login is successful to new page: "+ driver.getTitle());
		Thread.sleep(3000);
		MyProfilePageObjects.myProfileMenu(driver);
		System.out.println("User navigated to new page: "+ driver.getTitle());
		MyProfilePageObjects.county(driver).click();
		System.out.println("Country is updated");
		MyProfilePageObjects.state(driver).sendKeys("Massachusetts");
		System.out.println("State is updated");
		MyProfilePageObjects.city(driver).sendKeys("Boston");
		System.out.println("City is updated");
		MyProfilePageObjects.updateProfileButton(driver).click();
		System.out.println("My Profile is updated successfuly");
		
		
	}
	
	
	
}
