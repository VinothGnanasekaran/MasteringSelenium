package pom_ObjRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects_FindBy {
	
	@FindBy(name="email")
	public static WebElement userName;

	@FindBy(name="password")
	public static WebElement passWord;
	
	@FindBy(xpath="//*[@id=\"fadein\"]/div[4]/div/div[2]/div[2]/div/form/div[3]/button")
	public static WebElement loginButton;
}
