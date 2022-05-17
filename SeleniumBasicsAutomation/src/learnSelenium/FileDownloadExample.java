package learnSelenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "D:\\Automation\\Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		 * WebDriver driver = new FirefoxDriver();
		 */
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver. get("http://leafground.com/pages/download.html");
		driver.manage().window().maximize();

		WebElement downloadPDF = driver.findElement(By.linkText("Download PDF"));
		downloadPDF.click();
		
		driver.close();

		File fileLocation = new File ("C:\\Users\\vinot\\Downloads");
		File[] listFiles = fileLocation.listFiles();
		for (File file : listFiles) {
			if	(file.equals("downloadPDF")) {
				System.out.println("The PDF is downloaded");
				break;
			} 
			else {System.out.println("The PDF is NOT downloaded");}
		}
		


	}

}
