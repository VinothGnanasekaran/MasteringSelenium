package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver. get ("http://leafground.com/pages/drop.html");

		WebElement From = driver.findElement(By.id("draggable"));
		WebElement To = driver.findElement(By.id("droppable"));
		
		//Usage of ACTIONS Class for all Mouse/Keyboard events to be performed.
		Actions action = new Actions(driver);
		
		/*
		 * Method 1
		 * action.clickAndHold(From).moveToElement(To).build().perform();
		 */
		
		//Method 2
		action.dragAndDrop(From, To).build().perform();
		
		
		
	}

}
