package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;

public class FacebookLoginPage {
	//@Parameters({"mail" , "password"})
	public static WebElement input_email(WebDriver driver) {
		WebElement Eml= driver.findElement(By.id("email"));
		return Eml;
		//Eml.sendKeys(mail);
	}
	public static WebElement input_password(WebDriver driver) {
		WebElement Pwd= driver.findElement(By.id("pass"));
		//Pwd.sendKeys(password);
		return Pwd;
	}
	public static WebElement press_login(WebDriver driver) {
		WebElement Lgn= driver.findElement(By.name("login"));
		//Lgn.click();
		return Lgn;
	}
}
