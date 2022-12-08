package loginDD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_DataProviderMethod {

	
	String [] [] data = {
			{"admin", "admin"},
			{"admin0", "admin123"},
			{"Admin", "admin"},
			{"Admin", "admin123"}
	};
	
	@DataProvider(name="Login Data")
	public String[][] dataProvider(){
		return data;
	}
	
	//@SuppressWarnings("deprecation")
	@Test (dataProvider = "Login Data")
	public void login(String Name, String Pass) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("The Page opened is "+driver.getTitle());
		//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		WebElement uName = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		uName.sendKeys(Name);
		WebElement pWord = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		pWord.sendKeys(Pass);
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginButton.click();
		
		System.out.println("The login page is successful: " +driver.getTitle());
		
		driver.quit();
		
	}
}
