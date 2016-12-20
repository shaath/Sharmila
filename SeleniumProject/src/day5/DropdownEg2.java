package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg2 
{
	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.khuranatravel.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='outerWrapper']/div[2]/div[5]/div/a")).click();
		
		WebElement fcity=driver.findElement(By.id("fromCity"));
		
		Select fDrop=new Select(fcity);
		
		List<WebElement> flist=fDrop.getOptions();
		
		System.out.println("The number of cities available in from drop down "+flist.size());
		
		WebElement tcity=driver.findElement(By.id("toCity"));
		Select tDrop=new Select(tcity);
		
		
		for (int i = 0; i < flist.size(); i++) 
		{
			fDrop.selectByIndex(i);
			String fCName=flist.get(i).getText();
			System.out.println(fCName);
			
			List<WebElement> tlist=tDrop.getOptions();
			
			for (int j = 0; j < tlist.size(); j++)
			{
				tDrop.selectByIndex(j);
				String tCName=tlist.get(j).getText();
				if (fCName.equalsIgnoreCase(tCName))
				{
					flag=true;
					break;
				}
			}
			if (flag) 
			{
				break;
			}
			
		}
		
		if (flag) 
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Pass");
		}
	}
}
