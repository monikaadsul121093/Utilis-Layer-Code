package UtilityLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseLayer.BaseClass;

public class ITestListenerSetup extends BaseClass implements ITestListener{

	ExtentReports extentReports;
	ExtentTest extentTest;
	public void onStart(ITestContext context) 
	{
		  extentReports=ExtentReportSetup.setUp(context.getSuite().getName());
	}
	public void onTestStart(ITestResult result) 
	{
		  extentTest=extentReports.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) 
	{
		extentTest.log(Status.PASS, result.getMethod().getMethodName());
		String dest=ExtentReportSetup.screenshot("passscreenshot", result.getMethod().getMethodName());
		extentTest.addScreenCaptureFromPath(dest);	
	}

	public void onTestFailure(ITestResult result) 
	{
		extentTest.log(Status.PASS, result.getMethod().getMethodName());
		String dest=ExtentReportSetup.screenshot("failscreenshot", result.getMethod().getMethodName());
		extentTest.addScreenCaptureFromPath(dest);	
	}

	public void onTestSkipped(ITestResult result) 
	{
		extentTest.log(Status.SKIP, result.getMethod().getMethodName());
	}

	

	public void onFinish(ITestContext context) 
	{
		extentReports.flush();
	}

}
