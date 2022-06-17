package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.FacebookLoginPage;
public class LoginTest {
	@Test
	public void positiveTest() {
		
		System.out.println("Login test started");
		
		//Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//maximize browser window
		driver.manage().window().maximize();
		
		//open test page
		String url="https://www.facebook.com/";
		driver.get(url);
		System.out.println("page is open");
		
		FacebookLoginPage.input_email(driver).sendKeys("at3111998@gmail.com");
		FacebookLoginPage.input_password(driver).sendKeys("@linkinP1998");
		FacebookLoginPage.press_login(driver).click();
		//enter username
		//WebElement username=driver.findElement(By.id("email"));
		//username.sendKeys("at3111998@gmail.com");
		
		//enter password
		//WebElement password=driver.findElement(By.id("pass"));
		//password.sendKeys("@linkinP1998");
		
		//click login
		//WebElement Login=driver.findElement(By.name("login"));
		//Login.click();
		
		//Verifications
		
		//new url
		String ExpectedURL="https://www.facebook.com/";
		String ActualURL=driver.getCurrentUrl();
		Assert.assertEquals(ActualURL,ExpectedURL,"Not the same");
		
		//close browser
		driver.quit();
		
		
	}

}
