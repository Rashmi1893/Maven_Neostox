package TestClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;


public class Utility_001 {
	 //ReadDataFromPropertyFile
    public static String ReadDataFromPropertyFile(String key) throws IOException
	    {
   	  //create object of properties clas--> java 
	   	  Properties prop = new Properties();
	   	  
	   	  //create object of FileInputStream and pass properties file path as a parameter
	   	  FileInputStream myfile = new FileInputStream("C:\\Users\\Rashmi\\eclipse-workspace\\Maven_Neostox\\src\\test\\resources\\Properties_001");
	   	  prop.load(myfile);
	   	  String value = prop.getProperty(key);
	   	  //Reporter.log("Reading value of "+ key + " from property file", true);
	   	  return value;
	
	    }

         //Screenshot
			public static void Screenshot(WebDriver driver, String ScreenshotName) throws IOException
			{
				wait(driver, 500);
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest = new File("D:\\Java\\Screenshot\\"+ ScreenshotName+".png");
				FileHandler.copy(src, dest);
				//Reporter.log("Taking Screenshot", true);
			}
			
			//Scrollintoview
			public static void Scrollintoview(WebDriver driver, WebElement element)
			{
				wait(driver, 500);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].Scrollintoview(true)", element);
				//Reporter.log("Scroll into view", true);
			}
			
			//wait
			public static void wait(WebDriver driver, int waitTime)
			{
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
				//Reporter.log("Waiting for"+ waitTime + "ms", true);
			}
			
 }



