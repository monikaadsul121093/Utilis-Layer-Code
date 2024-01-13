package UtilityLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class JSEvents extends BaseClass{

	
	public static void openUrlInNewTab(String url)
	{
		((JavascriptExecutor)driver).executeScript("window.location='"+url+"'");
	}
	
	public static void openUrlInNewWindow(String url)
	{
		((JavascriptExecutor)driver).executeScript("window.open('"+url+"')");
	}
	
	public static void navigateBack(int previousPage)  
	{
		((JavascriptExecutor)driver).executeScript("history.go('-"+previousPage+"');");
	}
	
	public static void navigateForward(int nextPage)
	{
		((JavascriptExecutor)driver).executeScript("history.go('+"+nextPage+"');");
	}
	
	public static void refresh()
	{
		((JavascriptExecutor)driver).executeScript("history.go('0');");
	}
	
	public static String getTitle()
	{
		return ((JavascriptExecutor)driver).executeScript("return document.title").toString();
	}
	
	public static String getCurrentUrl()
	{
		return ((JavascriptExecutor)driver).executeScript("return document.URL").toString();
	}
	
	public static void click(WebElement wb)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", wb);
	}
	
	public static void sendKeys(WebElement wb,String value)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].value'"+value+"';", wb);
	}
	
	public static void scrollUptoElement(WebElement wb)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", wb);
	}
	
	public static void borderForElement(WebElement wb)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid pink';", wb);
	}
	
	
	
	
	
	
	
}
