package learnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		http://leafground.com/pages/sortable.html
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver. get("http://leafground.com/pages/sortable.html");
		List<WebElement> sortElement = driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
		int listSize = sortElement.size();
		WebElement toElement = sortElement.get(0);
		WebElement fromElement = sortElement.get(listSize-1);
		Actions actions = new Actions(driver);

		for(int i=0;i<listSize; i++) {
			
			
			actions.clickAndHold(fromElement);
			actions.moveToElement(toElement);
			actions.release(toElement);
			actions.build().perform();

		}
	}
}
