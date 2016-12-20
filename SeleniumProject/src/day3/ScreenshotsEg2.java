package day3;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ScreenshotsEg2 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		
		for (int i = 0; i < links.size(); i++) 
		{
			String lName=links.get(i).getText();
			System.out.println(lName);
			
			links.get(i).click();
			Sleeper.sleepTightInSeconds(3);
			System.out.println(driver.getTitle()+"----------"+driver.getCurrentUrl());
//			File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(source, new File("F:\\Sharmila\\SeleniumProject\\src\\screenshots\\"+lName+".png"));
			
			driver.navigate().back();
			Sleeper.sleepTightInSeconds(2);
			block=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
			links=block.findElements(By.tagName("a"));
		}
		
	}
}
