package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass{
	
	public static void sendKeys(WebElement wb,String value)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wbWait=wait.until(ExpectedConditions.visibilityOf(wb));
		wbWait.sendKeys(value);
		
	}
	
	public static void click(WebElement wb)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wbWait=wait.until(ExpectedConditions.visibilityOf(wb));
		wbWait.click( );
	}
	
	public static String getText(WebElement wb)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wbWait=wait.until(ExpectedConditions.visibilityOf(wb));
		String a=wbWait.getText();
		return a;
	}
	
	public static String getAttribute(WebElement wb,String keyname)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wbWait=wait.until(ExpectedConditions.visibilityOf(wb));
		String a=wbWait.getAttribute(keyname);
		return a;
	}
	
	public static boolean isSelected(WebElement wb) 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wbWait=wait.until(ExpectedConditions.visibilityOf(wb));
		boolean a=wbWait.isSelected();
		return a;
	}
	
	public static void selectCheckBox(List<WebElement> ls,String value)
	{
		for(WebElement wb:ls)
		{
			String a=wb.getText();
			if (a.equals(value))
			{
				wb.click();
				break;
			}
		}
	}
	

}
