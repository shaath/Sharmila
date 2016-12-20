package stepDefination;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Logout_Test
{
	public static WebDriver driver;
	@Given("^The user launch the browser and navigated to url$")
	public void the_user_launch_the_browser_and_navigated_to_url() throws Throwable 
	{
		  driver=new FirefoxDriver();
		  driver.get("http://opensource.demo.orangehrmlive.com");
		  driver.manage().window().maximize();
		  
	}

	@When("^The tester enter username and password$")
	public void the_tester_enter_username_and_password() throws Throwable 
	{
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable
	{
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^welcome admin message displayed$")
	public void btnLogin() throws Throwable 
	{
	    String expval="welcome";
	    String actval=driver.findElement(By.linkText("Welcome Admin")).getAttribute("id");
	    
	    Assert.assertEquals(expval, actval);
	}

	@When("^tester click on welcome admin link$")
	public void tester_click_on_welcome_admin_link() throws Throwable
	{
		Sleeper.sleepTightInSeconds(5);
	    driver.findElement(By.linkText("Welcome Admin")).click();
	}

	@When("^also click on logout link$")
	public void also_click_on_logout_link() throws Throwable 
	{
	   driver.findElement(By.linkText("Logout")).click();
	   Sleeper.sleepTightInSeconds(5);
	}

	@Then("^login page displayed$")
	public void login_page_displayed() throws Throwable 
	{
	    String expval="LOGIN";
	    String actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
	    Assert.assertEquals(expval, actval);
	}


}
