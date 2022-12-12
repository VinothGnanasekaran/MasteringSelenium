package pom_ObjRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.name("email"));
	}

	public static WebElement passWord(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement loginButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));
	}
	
}
