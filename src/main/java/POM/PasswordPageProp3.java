package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PasswordPageProp3 
{
	   @FindBy (id = "txt_accesspin") private WebElement password;
	   @FindBy (id = "lnk_submitaccesspin") private WebElement submit;
  
	   public PasswordPageProp3(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   public void Enter4digitPassword(WebDriver driver, String pass)
	   {
		   password.sendKeys(pass);
		   //Reporter.log("Entering 4 Digit Password", true);
		   System.out.println("Entering 4 Digit Password");
	   }
	   
	   public void clickonSubmit()
	   {
		   submit.click();
		  // Reporter.log("Clicking on submit button", true);
		   System.out.println("Clicking on submit button");
	   }

}
