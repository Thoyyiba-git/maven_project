package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.LoginPage;

public class BaseClass {
	public FileLib f;
	 public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/login.do");
	}
   @BeforeMethod
   public void login() {
	   LoginPage l=new LoginPage(driver);
	   l.login("username","pwd");
	   
   }
   @AfterMethod
   public void logout() {
	   driver.findElement(By.id("logoutLink")).click();
   }
 
   @AfterTest
   public void closeBrowser() {
	   driver.quit();
   }
}
