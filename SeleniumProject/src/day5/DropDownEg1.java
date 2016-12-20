package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='outerWrapper']/div[2]/div[5]/div/a")).click();
		
		WebElement fcity=driver.findElement(By.id("fromCity"));
		
		Select fDrop=new Select(fcity);
		
		fDrop.selectByIndex(5);

		Sleeper.sleepTightInSeconds(5);
		fDrop.selectByValue("12|Baroda");
		Sleeper.sleepTightInSeconds(5);
		fDrop.selectByVisibleText("Hyderabad");
	}

}
