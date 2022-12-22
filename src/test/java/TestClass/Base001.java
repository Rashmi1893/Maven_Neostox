package TestClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base001

{ protected static WebDriver driver;
public void LaunchBrowser() throws InterruptedException, IOException 
{
System.setProperty("webdriver.chrome.driver", "D:\\Java\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(Utility_001.ReadDataFromPropertyFile("url"));
	  //driver.manage().window().maximize();

	  Reporter.log("launching browser.....",true);

	  
	  Reporter.log("launching browser.....",true);	
	  
	  System.out.println("Launching browser");

	  Thread.sleep(1000);
}

public void CloseBrowser() throws InterruptedException 
{
	
	Reporter.log("Closing browser....",true);	
    driver.close();
	Thread.sleep(1000);
	
}

}
