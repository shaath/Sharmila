package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg1 {

	public static void main(String[] args)
	{
		int count=0;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("The number links in google page is "+links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			String lName=links.get(i).getText();
			
			if (!lName.equals("")) 
			{
				System.out.println(lName);
				count++;
			}
		}
		System.out.println("The number of visible links in google page is "+count);
		System.out.println("The number of invisible links in google page is "+(links.size()-count));
	}

}
