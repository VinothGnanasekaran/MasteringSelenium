package learnSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver. get("http://leafground.com/pages/Alert.html ");

		//For Simple  Alert with OK button
		WebElement alertButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/section/div[1]/div/div/button"));
		alertButton.click();

		//Moving the driver focus from webpage to the Alert displayed using Alert Interface. switchto.Alert
		Alert alertObj = driver.switchTo().alert();
		Thread.sleep(2000);
		alertObj.accept();
		
		//For Confirmation Alert - Ok/Cancel type : Cancelling the alert without accepting
		WebElement confButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/section/div[2]/div/div/button"));
		confButton.click();
		Alert Obj1 = driver.switchTo().alert();
		Thread.sleep(2000);
		Obj1.dismiss();
		
		//For Prompt alert with Text inputs and submit
		WebElement promptButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/section/div[3]/div/div/button"));
		promptButton.click();
		Alert Obj2 = driver.switchTo().alert();
		Thread.sleep(1000);
		Obj2.sendKeys("INput from Code to PRompt text box in Alert");
		Thread.sleep(1000); 
		Obj2.accept();
		


	}

}
