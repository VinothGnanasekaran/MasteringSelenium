package learnSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExamplesOfBasics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


/* Examples of Text Boxes - Automation features
----------------------------------------------------------------------------
	 */
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("Test@Gmail.com");
		driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input")).sendKeys("TEXT from Selenium code");

		/*Instead of simply driver.findelement, we are storing them in the return type(WebElement) for easier access and 
		then performing our required actions*/

		WebElement defaultButton=driver.findElement(By.name("username"));
		defaultButton.getAttribute("value");

		WebElement clearButton=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input"));
		clearButton.clear();

		WebElement disabledButton=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
		Boolean buttonEnabled=disabledButton.isEnabled();
		if (buttonEnabled) {
			System.out.println("Yes Button is enabled");
		}
		else {
			System.out.println("No the button is disabled");
		}

/* Examples of  Buttons - Automation features
----------------------------------------------------------------------------
	 */

		driver.get("http://www.leafground.com/pages/Button.html");

		WebElement positionButton=driver.findElement(By.id("position"));
		Point xyPoint=positionButton.getLocation();
		int xValue=xyPoint.getX();
		int yValue=xyPoint.getY();
		System.out.println("The position of the button :" +xValue + "," + yValue);

		WebElement colorButton = driver.findElement(By.id("color"));
		String bColor=colorButton.getCssValue("background-color");
		System.out.println("Button color is: "+bColor);

		WebElement sizeButton = driver.findElement(By.id("size"));
		Dimension Dim=sizeButton.getSize();
		int heightB=Dim.getHeight();
		int widthB=Dim.getWidth();
		System.out.println("Button size is: ("+heightB+"," +widthB+ ")");

		WebElement homeButton=driver.findElement(By.id("home"));
		homeButton.click();

/* Examples of  Dropdown Options - Automation features
----------------------------------------------------------------------------
	 */

		driver.get("http://leafground.com/pages/Dropdown.html");

		WebElement dD1=driver.findElement(By.id("dropdown1"));
	
		Select select = new Select(dD1);
		
		select.selectByIndex(1); //Selects the Value 'Selenium' as Index starts from 0 always
		Thread.sleep(3000);
		
		select.selectByValue("2"); //Selects the value 'Appium' as the value matching
		Thread.sleep(3000);
		
		select.selectByVisibleText("UFT/QTP"); //Selects value based on UI read Texts
		
		WebElement dD4=driver.findElement(By.className("dropdown"));
		Select sel2 = new Select(dD4);
		int noOfOpt=sel2.getOptions().size();
		System.out.println("No of options in ddlist are : "+noOfOpt);
		
//	or the below method is mostly preferred
		
		List<WebElement>  allOpt= sel2.getOptions();
		int listOfOpt=allOpt.size();
		System.out.println("No of options in ddlist are : "+listOfOpt);
		
		//Using Sendkeys for Dropdowns/Listboxes is possible.!
		dD4.sendKeys("Loadrunner");
		

/* Examples of  CheckBox Options - Automation features
----------------------------------------------------------------------------
	 */		
		driver.get("http://leafground.com/pages/checkbox.html");
	//To Validate the checkbox is selected by Default	
		WebElement seleniumCB=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/input"));
		if(seleniumCB.isSelected()) {
			System.out.println("The Selenium Checkbox is selected- Validated");
		}
		else
		System.out.println("Please select the Selenium Checkbox");
	
	//To validate 2 Checkboxes and to deselect the checkbox, which is selected by default
		
		WebElement firstCB=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[1]/input"));
		WebElement secondCB=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div[2]/input"));
		if(firstCB.isSelected()) {
			firstCB.click();
			System.out.println("The Checkbox is now unselected - firstone");
		}
		else
		secondCB.click();
		System.out.println("The Checkbox is now unselected - Secondone");
	
	}

	
}
