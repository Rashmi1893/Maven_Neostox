package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageProp1 

{
	//Variable Declaration	
		//	@FindBy(xpath = "(//a[text()='Sign Up'])[1]" ) private WebElement Signup;
			@FindBy(xpath="(//a[@class='btn btn-success button_success'])[1]" ) private WebElement Signup;
			
			
	//Initialization within Constructor with access level public using PageFactory
			public HomePageProp1(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
	//Method
			public void ClickonSignUp() throws InterruptedException
			{
				Thread.sleep(1000);
				Signup.click();
				System.out.println("Sineup to Neostox Account");
			}
	}

