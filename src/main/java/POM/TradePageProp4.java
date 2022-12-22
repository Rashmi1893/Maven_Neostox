package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class TradePageProp4 
{
	@FindBy (xpath = ("(//button[@class='close'])[19]")) private WebElement close;
	@FindBy (xpath = ("(//a[text()='Close'])[5]")) private WebElement closepopup;
	@FindBy(xpath = "//span[@id='lbl_username']") private WebElement UserName;
	@FindBy(id = "lbl_curbalancetop") private WebElement AvlBalance;
	@FindBy(xpath  = "//span[text()='Logout']") private WebElement logoutbutton;
	
	public TradePageProp4(WebDriver driver)
	  {
		PageFactory.initElements(driver, this);
	  }

	
	public void HandlePopUp(WebDriver driver) throws InterruptedException
	   {
		
		if(close.isDisplayed())
	      {
			Thread.sleep(2000);
	    	 close.click();
			// Reporter.log("Clicking on close popup", true);
			 System.out.println("Clicking on close popup");
			 
			 Thread.sleep(2000);
			 closepopup.click();
			// Reporter.log("Clicking on closepopup", true);
			 System.out.println("Clicking on closepopup");
	      }
		else
		  {
			// Reporter.log("There is No PopUp", true);
			 System.out.println("There is No PopUp");
		  }
	  }
	
	public String ValidateUserProfileName() throws IOException 
	{ 
		 String ActualUserName = UserName.getText();
		// String ExpectedUserName = ActualUserName.substring(3);
		// Reporter.log("The ActualUserName is " +ActualUserName, true);
		 System.out.println("The ActualUserName is " +ActualUserName);
		// Utility.NeoUtility1.Screenshot(driver, ExpectedUserName);
		return ActualUserName;
		
	}
	
	
     public String CheckAccountBalance(WebDriver driver) throws IOException
		{
    	  
		  String funds = AvlBalance.getText();
	      System.out.println("Availabe A/C Balance is  "+ funds);
	   //   Utility.NeoUtility1.Screenshot(driver, funds);
		  return funds;
	    }		

	 public void Logout(WebDriver driver) throws InterruptedException
	    {Thread.sleep(500);
	     UserName.click();
		 Thread.sleep(500);
	     logoutbutton.click();
		// Reporter.log("Logging Out", true);
		 System.out.println("Logging Out");
     	}	
}
