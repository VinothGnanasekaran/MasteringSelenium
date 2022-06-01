package learnSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver. get("https://www.monsterindia.com/seeker/registration");
		
		driver.manage().window().maximize();

		WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/label/span"));
		//WebElement uploadButton = driver.findElement(By.name("filename"));
		uploadButton.click();
		
		
		/*Windows actions
		 * String selection is for transferring the String to ToolKit class like 'Copy' Cntrl+C
		 * ToolKit Class Usage is to virtually hold the copied data of the file path to pass it to system Clipboard
		 * ROBOT Class is similar class like ACTIONS(useful for browser application)
		 *   class for Performing Keyboard/Mouse events, but in a Windows application
		 */
		
		StringSelection selection = new StringSelection ("C:\\Users\\vinot\\Downloads\\Upload.txt");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		//From ToolKit -> Get Default toolKit -> Get Clipboad -> Set the required content to be passed
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	
		
	}
}
