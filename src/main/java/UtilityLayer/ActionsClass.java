package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class ActionsClass extends BaseClass{

	public static void click(WebElement wb)
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement actwb=wait.until(ExpectedConditions.visibilityOf(wb));
	Actions act=new Actions(driver);
	act.click(actwb).build().perform();;
	}
	
	public static void doubleClick(WebElement wb)
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement actwb=wait.until(ExpectedConditions.visibilityOf(wb));
		Actions act=new Actions(driver);
		act.doubleClick(actwb).build().perform();
		
	}
	
	public static void contextClick(WebElement wb)
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement actwb=wait.until(ExpectedConditions.visibilityOf(wb));
		Actions act=new Actions(driver);
		act.contextClick(actwb).build().perform();
		
	}
	
	public static void clickAndHold(WebElement wb)
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement actwb=wait.until(ExpectedConditions.visibilityOf(wb));
		Actions act=new Actions(driver);
		act.clickAndHold(actwb).build().perform();
		
	}
	
	public static void dragAndDrop(WebElement src,WebElement target)
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement srcwb=wait.until(ExpectedConditions.visibilityOf(src));
		WebElement targetwb=wait.until(ExpectedConditions.visibilityOf(target));
		Actions act=new Actions(driver);
		act.dragAndDrop(srcwb, targetwb).build().perform();;
		
	}
	
	public static void moveToElement(WebElement wb)
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement waitwb=wait.until(ExpectedConditions.visibilityOf(wb));
		Actions act=new Actions(driver);
		act.moveToElement(waitwb).build().perform();;
	}
	
	public static void release(WebElement wb)
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement waitwb=wait.until(ExpectedConditions.visibilityOf(wb));
		Actions act=new Actions(driver);
		act.release(waitwb).build().perform();;
	}
	
	public static void sendKeys(WebElement wb,String value)
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement waitwb=wait.until(ExpectedConditions.visibilityOf(wb));
		Actions act=new Actions(driver);
		act.sendKeys(waitwb, value).build().perform();
	}
	
	public static void sendUpperCaseText(WebElement wb,String value)
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement waitwb=wait.until(ExpectedConditions.visibilityOf(wb));
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys(waitwb,value).keyUp(Keys.SHIFT);
	}
	
	
	
	
	
	
	
	
	
	}