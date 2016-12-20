package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import day10.OrgFunctionMaster;

public class Excelops 
{
	public static void main(String[] args) throws IOException 
	{
		OrgFunctionMaster om=new OrgFunctionMaster();
		String xlpath="F:\\Sharmila\\SeleniumProject\\src\\testdata\\EmpregData.xlsx";
		String xlout="F:\\Sharmila\\SeleniumProject\\src\\results\\empresfont.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("EmpReg");
//		XSSFRow r=ws.getRow(4);
//		XSSFCell c=r.getCell(0);
//		
//		System.out.println(c.getStringCellValue());
		
		int rc=ws.getLastRowNum();
		om.org_LAunch("http://opensource.demo.orangehrmlive.com");
		om.org_Login("Admin", "admin");
		
		CellStyle style=wb.createCellStyle();
		Font font=wb.createFont();
		
		for (int i = 1; i <= rc; i++)
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.createCell(2);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			
			System.out.println(f+"----"+l);
			String res=om.org_Empeg(f, l);
			
			c2.setCellValue(res);
//			if (res.equalsIgnoreCase("Pass"))
//			{
//				style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
//			}
//			else
//			{
//				style.setFillForegroundColor(IndexedColors.RED.getIndex());
//				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
//			}
//		
			if (res.equalsIgnoreCase("Pass"))
			{
				font.setColor(IndexedColors.GREEN.getIndex());
				style.setFont(font);
			}
			else
			{
				font.setColor(IndexedColors.RED.getIndex());
				style.setFont(font);
			}
			
			
			c2.setCellStyle(style);
			
			
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
	}

}
