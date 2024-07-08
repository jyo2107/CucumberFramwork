package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
/*import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;*/

public class Stepdef {
	
	public WebDriver driver;
	
	public LoginPage loginpg;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    loginpg= new LoginPage(driver);
	    driver.manage().window().maximize();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String password) {
		loginpg.enterEmail(emailadd);
		loginpg.enterpassword(password);
	}
	@When("Click on Login")
	public void click_on_login() {
		loginpg.clickonloginbutton();
	}
	
	
	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle=driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
		@Then("click on UserProfile")
		public void click_on_user_profile() {
		   loginpg.clickonuserprofile();
		
	}
	@When("user click on Logout link")
	public void user_click_on_logout_link() {
		loginpg.clickonlogoutbutton();
		
	}
	@Then("close browser")
	public void close_browser() {
		driver.close();
		driver.quit();
	}

}
