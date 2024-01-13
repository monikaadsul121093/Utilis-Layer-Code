package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleAlertPop extends BaseClass{
//	#url=https://chercher.tech/practice/frames-example-selenium-webdriver
//		#url=https://praf002.github.io/
//		url=https://demoqa.com/alerts
	
	public static void accept()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		alt.accept();
	}
	
	public static void dismiss()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		alt.dismiss();
	}
	
	public static String getText()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		String a=alt.getText();
		return a;
	}
	
	public static void sendKeys(String value)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		alt.sendKeys(value);
	}
}
