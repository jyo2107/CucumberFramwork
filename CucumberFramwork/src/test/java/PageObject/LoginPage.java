package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver lDriver;
	
   public LoginPage(WebDriver rDriver) {
	   
	   lDriver = rDriver;
	   PageFactory.initElements(rDriver, this);
   }
   
   
   @FindBy(id = "unameTxt")
   WebElement unameTxt;
   
   
   @FindBy(id = "passwordTxt")
   WebElement passwordTxt;
   
   
   @FindBy(xpath = "//*[@id=\"registerFormOne\"]/div/div[1]/div/div/div[2]/div[4]/button")
   WebElement Passbt;
   
   @FindBy(xpath = "//*[@id=\"theme_nav\"]/div/ul/li[4]/a/i")
   WebElement UserProfile;
   
   
 //*[@id="theme_nav"]/div/ul/li[4]/a/i
   
 //*[@id="theme_nav"]/div/ul/li[4]/a

   @FindBy(xpath = "//*[@id=\"theme_nav\"]/div/ul/li[4]/ul/li[3]/a")
   WebElement Logoutbt;
   
   
   
   public void enterEmail(String emailadd)
   {
	   unameTxt.sendKeys(emailadd);
   }
   
   
   public void enterpassword(String password)
   {
	   passwordTxt.sendKeys(password);
   }
   
   public void clickonloginbutton()
   {
	   Passbt.click();
   }
   
   public void clickonuserprofile()
   {
	   UserProfile.click();
   }
public void clickonlogoutbutton() {
	Logoutbt.click();	
}
}



