package pom_ObjRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProfilePageObjects {
	
	public static void myProfileMenu(WebDriver driver) {
		driver.get("https://phptravels.net/account/profile");
		//return driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/ul/li[4]/a"));
	}

	public static WebElement county(WebDriver driver) {
		return driver.findElement(By.className("select2-selection__rendered"));
				//driver.findElement(By.id("select2-from_country-container"));
	}
	
	public static WebElement state(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[7]/td[3]/div/input"));
	}
	
	public static WebElement city(WebDriver driver) {
		return driver.findElement(By.name("city"));
	}
	
	public static WebElement updateProfileButton (WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"));		
	}
}
