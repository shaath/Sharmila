package day10;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshotEg2 {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		
		FunctonsEg fg=new FunctonsEg();
		
		fg.screenshot(driver, "bing.png");

	}

}
