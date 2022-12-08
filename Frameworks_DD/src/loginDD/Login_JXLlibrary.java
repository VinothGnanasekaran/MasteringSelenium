package loginDD;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login_JXLlibrary {

	@DataProvider(name = "LoginData")
	public String[][] loginData() throws BiffException, IOException {

		String[][] data = getExcelData();
		return data;
	}

	public String[][] getExcelData() throws BiffException, IOException {

		FileInputStream excel = new FileInputStream ("D:\\Automation\\Data\\LoginData.xls");
		Workbook wBook = Workbook.getWorkbook(excel);
		Sheet wSheet = wBook.getSheet(0);
		int columns = wSheet.getColumns();
		int rows = wSheet.getRows();

		String [][]excelData = new String [rows-1] [columns];
		for(int i=1;i<rows;i++) {
			for (int j=0; j<columns; j++) {
				excelData[i-1][j]=wSheet.getCell(j, i) .getContents();
			}
		}
		return excelData;
	}

	WebDriver driver;

	@BeforeTest
	public void browserInitiate() {

		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("The Page opened is "+driver.getTitle());
		
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

	@SuppressWarnings("deprecation")
	//@Parameters({"Name","Pass"})
	@Test(dataProvider = "LoginData")
	public void login(String Name, String Pass) {
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebElement uName = driver.findElement(By.name("username"));
		uName.click();
		uName.sendKeys(Name);
		WebElement pWord = driver.findElement(By.name("password"));
		pWord.clear();
		pWord.sendKeys(Pass);
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginButton.click();
		System.out.println("The entered credentials are Username: "+Name+ " Password: "+Pass);
		System.out.println("The login page is successful: " +driver.getTitle());	
	}

}
