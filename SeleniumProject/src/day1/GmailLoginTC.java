package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLoginTC {

	public static void main(String[] args)
	{
		//Launching the browser
		WebDriver driver=new FirefoxDriver();
		//Launch the application
		driver.get("http://gmail.com");
		//Maximize the window
		driver.manage().window().maximize();
		//identify the email text box------------>findEelement()
		WebElement email=driver.findElement(By.id("Email"));
		//Entering the email into email textbox
		
		email.sendKeys("sharathqedge449");
		
		
		
		//clear the text in email text box
//		email.clear();
		//click on next button
		driver.findElement(By.name("signIn")).click();
		
		Sleeper.sleepTightInSeconds(5);
		
		//Entering password
		
		driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("123456789");
		
		//click on the signin button
		
		driver.findElement(By.cssSelector("#signIn")).click();
	}

}
