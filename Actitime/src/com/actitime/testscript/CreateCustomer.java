package com.actitime.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomer {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://localhost/login.do");
		 driver.findElement(By.id("username")).sendKeys("admin");
		system.out.println("Admin texted");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.xpath("//div[text()='Login ']")).click();
		 driver.findElement(By.linkText("TASKS")).click();
		 driver.findElement(By.xpath("//div[text()='Add New']")).click();
		 driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		 driver.findElement(By.id("customerLightBox_nameField")).sendKeys("nasrin");
		 driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("test engineer");
		 driver.findElement(By.xpath("//button[contains(text(),'Select an active customer')]")).click();
		 driver.findElement(By.linkText("Our Company")).click();
		 driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
		 Thread.sleep(3000);
		 WebElement text = driver.findElement(By.xpath("//a[text()='All Customers']/../../div[@class='title ellipsis']"));
		 System.out.println(text.getText());
		 driver.findElement(By.id("logoutLink")).click();
		 driver.quit();
		 
	}

}
