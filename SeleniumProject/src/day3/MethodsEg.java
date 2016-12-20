package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MethodsEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
//		
//		System.out.println("The title of the page is "+driver.getTitle());
//		
//		System.out.println("The ulr of the page "+driver.getCurrentUrl());
//		//navigate the page to twitter.com
//		driver.navigate().to("http://twitter.com");
//		Sleeper.sleepTightInSeconds(5);
//		//go back to facebook page
//		driver.navigate().back();
//		Sleeper.sleepTightInSeconds(5);
//		//forward to the twitter.com
//		driver.navigate().forward();
//		Sleeper.sleepTightInSeconds(5);
//		//refresh the page
//		driver.navigate().refresh();
		
//		System.out.println(driver.getPageSource());
//		//close
//		driver.close();
		driver.findElement(By.linkText("Terms")).click();
		Sleeper.sleepTightInSeconds(5);
		//quit
		driver.quit();
	}

}
