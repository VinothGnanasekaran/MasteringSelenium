package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImagesExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver. get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();

		WebElement firstImg = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		firstImg.click();
		Thread.sleep(1000);
		driver.navigate().back(); // To Make browser navigate back

		WebElement brokenImg = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		if (brokenImg.getAttribute("naturalWidth").equals("0"));
		System.out.println("The Image is broken in the page");

		WebElement thirdImg = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/img"));
		

		Actions actions = new Actions(driver);
		actions.click(thirdImg).build().perform();
		System.out.println("Image clicked by Mouse");
		Thread.sleep(2000);

		driver.quit();



	}

}
