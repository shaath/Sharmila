package day10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FunctonsEg {

	public static void main(String[] args) 
	{
		int res=sum(60,40);
		System.out.println(res);
	}
	
	
	//Sum
	
	public static int  sum(int a, int b)
	{
//		int a=40;
//		int b=50;
		int c=a+b;
		return c;
	}
	
	public static void screenshot(WebDriver driver,String name) throws IOException
	{
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Sharmila\\SeleniumProject\\src\\screenshots\\"+name));
		
		
	}

}
