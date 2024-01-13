package UtilityLayer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzerSetup implements IRetryAnalyzer{
	
	int start=0;
	int max=5;
	public boolean retry(ITestResult result) 
	{
		if(start<max)
		{
			start++;
			return true;
		}
		return false;
	}
	
	 

}
