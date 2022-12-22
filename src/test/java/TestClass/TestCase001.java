package TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.HomePageProp1;
import POM.PasswordPageProp3;
import POM.SignupPageProp2;
import POM.TradePageProp4;


public class TestCase001 extends Base001 {
	HomePageProp1 hm;
	SignupPageProp2 su;
	PasswordPageProp3 pp;
	TradePageProp4 tp;
	
@BeforeClass
	public void LaunchTheBrowser() throws InterruptedException, IOException 
	{
		 LaunchBrowser();
	}

@BeforeMethod
	public void SignUpUpstox() throws InterruptedException, IOException 
	{
	    hm = new HomePageProp1(driver);
		hm.ClickonSignUp();
		
	    su = new SignupPageProp2(driver);
		su.EnterMobNumber(driver, Utility_001.ReadDataFromPropertyFile("mobnum"));
		su.signupforNeostox();
		Thread.sleep(1000);
		
	    pp = new PasswordPageProp3(driver);
		pp.Enter4digitPassword(driver, Utility_001.ReadDataFromPropertyFile("password"));
		pp.clickonSubmit();
		Thread.sleep(3000);
		
		tp = new TradePageProp4(driver);
		tp.HandlePopUp(driver);
		Thread.sleep(1000);	
	}

	
@Test
	  public void ValidateUserProfileName() throws IOException 
	  {
		  Assert.assertEquals( tp.ValidateUserProfileName() ,Utility_001.ReadDataFromPropertyFile("Username"), "TC failed unable to fetch Account Balance");
	  }
	
@AfterMethod
	public void LogOutNeostox() throws InterruptedException 
	{
	tp.Logout(driver);
	}

	
@AfterClass
	public void CloseTheBrowser() throws InterruptedException, IOException 
	{
		 CloseBrowser();	 
	}
}
