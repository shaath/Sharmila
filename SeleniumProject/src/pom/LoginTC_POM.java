package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTC_POM 
{
	@Test
	public void lt()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		
		lp.login("Admin", "admin");
		
		AdminPage ap=PageFactory.initElements(driver, AdminPage.class);
		Sleeper.sleepTightInSeconds(3);
		ap.welcomeclick();
		Sleeper.sleepTightInSeconds(3);
		ap.logoutclick();
		
		driver.close();
	}

}
