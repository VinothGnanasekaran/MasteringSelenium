package learnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
	
		//To move the driver control into the Frame 1
		driver.switchTo().frame(0);		
		WebElement clickButton1 = driver.findElement(By.xpath("//*[@id=\'Click\']"));
		clickButton1.click();
		System.out.println("Button clicked: "+clickButton1.getText());
		
		//To move the driver control to homepage from inside the Frame
		driver.switchTo().defaultContent();
		
		//To move control inside a nested Frames
		driver.switchTo().frame(1);		
		driver.switchTo().frame("frame2");	
		driver.findElement(By.xpath("//*[@id=\'Click1\']")).click();
		driver.switchTo().defaultContent();
		
		//To find the number of Frames in a given webpage
		 List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		 int size = totalFrames.size();
	    System.out.println("Size :" +size );
	    driver.close();
	}

}
