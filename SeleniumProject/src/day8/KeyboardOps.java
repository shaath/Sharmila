package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class KeyboardOps {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email")).sendKeys("sharathqedge449");
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("Email")).sendKeys(Keys.CONTROL,"a");
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("Email")).sendKeys(Keys.CONTROL,"c");
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("Email")).clear();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("Email")).sendKeys(Keys.CONTROL,"v");
		

	}

}
