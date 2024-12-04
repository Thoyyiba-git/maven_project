package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListnerImplementation.class)

public class CustomerModule extends BaseClass{
	HomePage h=new HomePage(driver);
	TaskListPage t=new TaskListPage(driver);
	//create customer
	@Test
	public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	String custName = f.getExcelData("Create customer", 1,2);
	String custDescription = f.getExcelData("Create customer", 1, 3);
		h.setTask();
		t.getAddnewBtn();
		t.getNewcustBtn();
		t.getCustnameTbx();
		t.getCustdescTbx();
		t.getCustDropdown();
		t.getOurcompany();
		t.getCretecustBtn();
		 Thread.sleep(3000);
		 WebElement text = t.getCreatecustHeading();
		 System.out.println(text.getText());
	  }
	//delete customer
	@Test
	public void deleteCustomer() throws InterruptedException {
         h.setTask();
         t.getSearchTF();
         t.getSetting();
		 Thread.sleep(2000);
		 t.getActionBtn();
         t.getDeleteBtn();
         t.getDltPermanent();
	}
	//create project
	@Test 
	public void createProject() throws InterruptedException, IOException {
		 h.setTask();
		 t.getAddnewBtn();
		 t.getNewProBtn();
		 String proName = f.getExcelData("Create project", 1, 2);
		 t.getNewProBtn();
		 t.getCstDropdown();
		 t.getMediaAgeBtn();
		 t.getProDescription();
		 f.getExcelData("Create project", 1, 3);
	     t.getCreateProjectBtn();
		 Thread.sleep(3000);
		WebElement text = t.getTitleText();
		System.out.println(text.getText());
		}
	@Test
	public void deleteProject() {
		
	}
	}
