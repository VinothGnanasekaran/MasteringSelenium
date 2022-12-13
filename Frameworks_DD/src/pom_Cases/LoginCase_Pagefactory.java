package pom_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom_ObjRepo.LoginPageObjects;
import pom_ObjRepo.LoginPageObjects_FindBy;

public class LoginCase_Pagefactory {

	//String driverPath_FF= "D:\\Automation\\Drivers\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe";
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://phptravels.net/login");
		driver.manage().window().maximize();
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
	public void Login() {
		

		PageFactory.initElements(driver,  LoginPageObjects_FindBy.class);
				
		LoginPageObjects_FindBy.userName.sendKeys("user@phptravels.com");
		System.out.println("The username is entered");
		LoginPageObjects_FindBy.passWord.sendKeys("demouser");
		System.out.println("The password is entered");
		LoginPageObjects_FindBy.loginButton.click();		
		System.out.println("The login is successful to new page: "+ driver.getTitle());
		
		
		/*LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
		System.out.println("The username is entered");
		LoginPageObjects.passWord(driver).sendKeys("demouser");
		System.out.println("The password is entered");
		LoginPageObjects.loginButton(driver).click();
		System.out.println("The login is successful to new page: "+ driver.getTitle());
		*/
	}


	
	
	
}
