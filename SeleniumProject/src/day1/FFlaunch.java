package day1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FFlaunch 
{

	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		
		
		//Launching the browser
		FirefoxDriver driver=new FirefoxDriver(fp);
		//launching the application---->get()
		driver.get("http://facebook.com");
	}

}
