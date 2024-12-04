package com.actitime.testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class ProjectModule extends BaseClass {
	HomePage h=new HomePage(driver);
	TaskListPage t=new TaskListPage(driver);
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
		     //delete project
		@Test
		public void deleteProject() throws InterruptedException {
			h.setTask();
			t.getTextField();
			t.getDeProSetting();
			 Thread.sleep(2000);
			 t.getProActionBtn();
			 t.getProDeleteBtn();
			 t.getProDltPermanent();		
		}

}
