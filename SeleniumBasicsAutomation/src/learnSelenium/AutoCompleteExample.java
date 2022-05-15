package learnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver. get("http://leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();

		//Find the Autocompletion/dropdown list, and type the required text into it
		WebElement autoButton = driver.findElement(By.xpath("//*[@id=\'tags\']"));
		autoButton.clear();
		autoButton.sendKeys("s");

		//Adding Explicit Wait here, inorder to wait for the list to autopopulate, post Sendkeys.
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Post send keys, get the list of displayed suggested list and compare with the required condition using for-each
		List<WebElement> autoList = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		System.out.println("List size for 's' is :"+ autoList.size());
		for (WebElement listElement : autoList) {
			if(listElement.getText().contains("Rest API")) {
				listElement.click();
				break;
			}
		}
		driver.close();
	}
}
