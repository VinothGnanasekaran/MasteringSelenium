package learnSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleExample {

	private static String windowHandle;
	private static WebElement findElement;
	private static Set<String> windowHandles;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver. get("http://leafground.com/pages/Window.html");

		//To get the already opened Home window to the driver
		String homeWindow =driver.getWindowHandle();

		WebElement homeButton=driver.findElement(By.id("home"));
		homeButton.click();

		//To get the all the new windows opened and to move the driver control to the new window
		Set<String> openWindow=driver.getWindowHandles();
		for (String newWindow : openWindow) {
			driver.switchTo().window(newWindow);
			Thread.sleep(2000);
		}
		driver.close();

		//To Switch back the control  to the old window
		driver.switchTo().window(homeWindow);

		//---------------------
		WebElement multWindow = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		multWindow.click();
		Set<String> allWindows=driver.getWindowHandles();
		int openWindows = allWindows.size();
		System.out.println("The number of Opened Windows :" +openWindows);
		Thread.sleep(2000);

		//---------------------
		//To Open multiple windows and close all except the home window
		WebElement closeButton = driver.findElement(By.id("color"));
		closeButton.click();
		String closeButtonText=closeButton.getText();
		System.out.println("Button clicked now is: "+closeButtonText);
		Thread.sleep(2000);
		Set<String> windowHandles2 = driver.getWindowHandles();
		for (String window : windowHandles2) {
			if(!window.equals(homeWindow))
				driver.switchTo().window(window);
				driver.close();
			}

	}

}
