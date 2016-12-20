package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebtablesEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		String ltext=driver.findElement(By.xpath(".//*[@id='resultTable']/tbody/tr[6]/td[3]/a")).getText();
		System.out.println(ltext);
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		
		System.out.println("The number of rows avaialble in webtable is "+rows.size());
		
		
		for (int i = 0; i < rows.size(); i++) 
		{
//			System.out.println(rows.get(i).getText());
			
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			String celltext=cols.get(1).getText();
			System.out.println(celltext);
			
			if (celltext.equalsIgnoreCase("1977")) 
			{
				cols.get(0).click();
				driver.findElement(By.id("btnDelete")).click();
				driver.findElement(By.id("dialogDeleteBtn")).click();
				break;
			}
		}
		

	}

}
