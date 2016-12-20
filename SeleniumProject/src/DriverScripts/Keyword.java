package DriverScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import day10.OrgFunctionMaster;

public class Keyword 
{
	@Test
	public void test() throws IOException
	{
		OrgFunctionMaster om=new OrgFunctionMaster();
		String res=null;
		String xlpath="F:\\Sharmila\\SeleniumProject\\src\\testdata\\Keyword.xlsx";
		String xlout="F:\\Sharmila\\SeleniumProject\\src\\results\\keyres.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		XSSFSheet ws2=wb.getSheet("TestData");
		int tcRc=ws.getLastRowNum();
		int tsRc=ws1.getLastRowNum();
		
		//TestCase
		
		for (int i = 1; i <= tcRc; i++) 
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				
				//TestSteps
				for (int j = 1; j <= tsRc; j++) 
				{
					String tstcId=ws1.getRow(j).getCell(0).getStringCellValue();
					if(tcId.equalsIgnoreCase(tstcId))
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						
						switch (key) 
						{
						case "Launch":
							res=om.org_LAunch(ws2.getRow(1).getCell(0).getStringCellValue());
							
							break;
							
						case "login":
							String u=ws2.getRow(1).getCell(1).getStringCellValue();
							String p=ws2.getRow(1).getCell(2).getStringCellValue();
							res=om.org_Login(u, p);
							break;
						case "logout":	
							res=om.org_Logout();
							om.org_Close();
							break;
						case "Empreg":	
							String f=ws2.getRow(1).getCell(3).getStringCellValue();
							String l=ws2.getRow(1).getCell(4).getStringCellValue();
							res=om.org_Empeg(f, l);
							break;
						case "Usereg":
							String ename=ws2.getRow(1).getCell(5).getStringCellValue();
							String uname=ws2.getRow(1).getCell(6).getStringCellValue();
							String pswd=ws2.getRow(1).getCell(7).getStringCellValue();
							String cpswd=ws2.getRow(1).getCell(8).getStringCellValue();
							res=om.org_Userreg(ename, uname, pswd, cpswd);
							break;
						case "Ulogin":	
							String uname1=ws2.getRow(1).getCell(6).getStringCellValue();
							String cpswd1=ws2.getRow(1).getCell(8).getStringCellValue();
							om.org_Login(uname1, cpswd1);
							break;
						default:
							System.out.println("Select a proper Keyword");
							break;
						}
						//Result updation test steps sheet
						
						ws1.getRow(j).createCell(4).setCellValue(res);

						//Result in test case sheet 
						
						if(!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
			
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
	}

}
