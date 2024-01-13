package UtilityLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentReportSetup extends BaseClass{

	
	
	public static ExtentReports setUp(String suiteName)
	{
		ExtentReports extentReports=new ExtentReports();
		String path=System.getProperty("user.dir")+"\\Extentreport\\"+suiteName+date()+".html";
		ExtentSparkReporter spark=new ExtentSparkReporter(path);
		extentReports.attachReporter(spark);
		return extentReports;
		
		
	}
	
	
	public static String screenshot(String foldername,String testcaseName)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		String dest=System.getProperty("user.dir")+"\\"+foldername+"\\"+testcaseName+"_"+date()+".png";
		try {
			FileUtils.copyFile(f, new File(dest));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dest;
		
	}
	
	
	public static String date()
	{
		SimpleDateFormat simple =new SimpleDateFormat("ddMMyyyy_HHmmss");
		String date=simple.format(new Date());
		return date;
	}
}
