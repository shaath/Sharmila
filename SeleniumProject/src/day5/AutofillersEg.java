package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutofillersEg {

	public static void main(String[] args)
	{
		 WebDriver driver=new FirefoxDriver();
		 driver.get("http://redbus.in");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("src")).sendKeys("c");
		 Sleeper.sleepTightInSeconds(3);
		 
		 List<WebElement> city=driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
		 
		 System.out.println("The number of cities available starting with t is "+city.size());
		 
		 for (int i = 0; i < city.size(); i++) 
		 {
			String cname=city.get(i).getText();
			System.out.println(cname);
			if (cname.equalsIgnoreCase("Chennai"))
			{
				city.get(i).click();
				break;
			}
		}
	}

}
