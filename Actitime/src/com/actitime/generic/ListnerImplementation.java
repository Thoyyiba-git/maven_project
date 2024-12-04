package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImplementation extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String res = result.getName();	
		Reporter.log(res+"has been started",true);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		String res = result.getName();	
		Reporter.log(res+"has been passed",true);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		String res = result.getName();	
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File f=new File("./Screenshots/"+res+".png");
		try {
			FileUtils.copyFile(src, f);
		}
		catch(IOException E){}
			
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		String res = result.getName();	
		Reporter.log(res+"has been skipped",true);
		
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		
	}
	@Override
	public void onStart(ITestContext context) {
		
		
	}
	@Override
	public void onFinish(ITestContext context) {
		
		
	}
	

}
