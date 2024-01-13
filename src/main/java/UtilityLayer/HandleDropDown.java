package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{

	
	public static void selectByVisibleText(WebElement wb,String Value)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wbwait=wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel=new Select(wbwait);
		sel.selectByVisibleText(Value);
		
		
	}
	
	public static void selectByValue(WebElement wb,String Value)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wbwait=wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel=new Select(wbwait);
		sel.selectByValue(Value);
		
	}
	
	public static void selectByIndex(WebElement wb,int a)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wbwait=wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel=new Select(wbwait);
		sel.selectByIndex(a);
	}
	
	public static void getOptions(WebElement wb)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wbwait=wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel=new Select(wbwait);
		List<WebElement> ls=sel.getOptions();
		
		for(WebElement abc:ls)
		{
			String a=abc.getText();
			System.out.println(a);
		}
	}
	
	public static int size(WebElement wb)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wbwait=wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel=new Select(wbwait);
		List<WebElement> ls=sel.getOptions();
		int a=ls.size();
		return a;
	}
	
	public static void selectSpecificValueDd(WebElement wb,String value )
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wbwait=wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel=new Select(wbwait);
		List<WebElement> ls=sel.getOptions();
		
		for(WebElement abc:ls)
		{
			String a=abc.getText();
			if(a.equalsIgnoreCase(value))
			{
				abc.click();
				break;
			}
		}
	}
}
