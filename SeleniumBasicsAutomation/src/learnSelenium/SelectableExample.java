package learnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver. get("http://leafground.com/pages/selectable.html");
		
		//To get the list of all the ordered List from its ID and append '/li' to the xpath & cross check if the size matches 
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int size = selectable.size();
		System.out.println(size);
		
		//Using Actions class and click and holding the required items by the List order
		Actions action = new Actions(driver);
		action
		.clickAndHold(selectable.get(0))
		.clickAndHold(selectable.get(1))
		.clickAndHold(selectable.get(2))
		.clickAndHold(selectable.get(3));
		action.build().perform();
						
	}

}
