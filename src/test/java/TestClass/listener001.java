package TestClass;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listener001 extends Base001 implements ITestListener
{

		public void onTestSuccess(ITestResult result) 
		{
			Reporter.log("TC " +result.getName()+ " is Completed Successfully...", true);
			try {
				Utility_001.Screenshot(driver, result.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void onTestFailure(ITestResult result)
		{
			String TCName = result.getName();
		    Reporter.log("Test case " +TCName+ " Fail please try again...", true);
		try {
			Utility_001.Screenshot(driver, TCName);
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
   
		public void onTestSkipped(ITestResult result) {
			Reporter.log("Test Case " +result.getName()+ " is Skipped please check...", true);
		}
	
}
