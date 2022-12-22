package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignupPageProp2 
{
//Variable Declaration	
	
   // @FindBy(name ="ctl00$MainContent$signinsignup$txt_mobilenumber") private WebElement MobNumber;
	  @FindBy(xpath = "//input[@id='MainContent_signinsignup_txt_mobilenumber'] ") private WebElement MobNumber;
	              
	  @FindBy(id = "lnk_signup1") private WebElement signup;

//Initialization within Constructor with access level public using PageFactory
	public SignupPageProp2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
//Method
	public void EnterMobNumber(WebDriver driver, String mobnum) throws InterruptedException 
	{
	Thread.sleep(500);
	MobNumber.click();
	Thread.sleep(500);
	MobNumber.sendKeys(mobnum);
	//Reporter.log("Entering Mobile Number", true);
	System.out.println("Entering Mobile Number");
	}
	
	public void signupforNeostox()
	{
		signup.click();
		//Reporter.log("Clicking on sineup Button", true);
		System.out.println("Clicking on sineup Button");
	}
}
