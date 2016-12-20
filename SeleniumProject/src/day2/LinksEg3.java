package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg3 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		//Method1
//		driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/span/a[1]")).click();
		//Method 2
		
//		List<WebElement> home=driver.findElements(By.linkText("Home"));
//		System.out.println(home .size());
//		
//		for (int i = 0; i < home.size(); i++) 
//		{
//			String href=home.get(i).getAttribute("href");
//			System.out.println(href);
//			if (href.equalsIgnoreCase("http://primusbank.qedgetech.com/home.aspx"))
//			{
//				home.get(i).click();
//				break;
//			}
//		}
		
		//Method3
//		WebElement block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td"));
//		
//		List<WebElement> links=block.findElements(By.tagName("a"));
//		
//		for (int i = 0; i < links.size(); i++)
//		{
//			String lText=links.get(i).getText();
//			if (lText.equalsIgnoreCase("home"))
//			{
//				links.get(i).click();
//				break;
//			}
//		}
		//Method 4
		driver.findElement(By.xpath("//*[@id='Table_011']/tbody/tr[2]/td")).findElement(By.linkText("Home")).click();
	}
}
