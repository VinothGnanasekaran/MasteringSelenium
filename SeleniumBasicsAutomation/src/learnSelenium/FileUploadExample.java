package learnSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver. get("https://www.monsterindia.com/seeker/registration");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/label/span"));
		//uploadButton.click();
		uploadButton.sendKeys("C:\\Users\\vinot\\Downloads\\Upload.txt");
		Thread.sleep(2000);
		driver.quit();

	}
}
