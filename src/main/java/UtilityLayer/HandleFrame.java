package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleFrame extends BaseClass{

	
	public static void frame(String frameIdOrName)
	{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIdOrName));
	}
	
	public static void frame(int index)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}
	
	public static void frame(WebElement wb)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(wb));
	}
	
	public static void parentFrame()
	{
		driver.switchTo().parentFrame();
	}
	
	public static void defaultContent()
	{
		driver.switchTo().defaultContent();
	}
}

