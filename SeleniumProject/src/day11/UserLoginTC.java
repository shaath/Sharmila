package day11;

import day10.OrgFunctionMaster;

public class UserLoginTC {

	public static void main(String[] args)
	{
		OrgFunctionMaster om=new OrgFunctionMaster();
		
		String res=om.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Sharmila12345", "Sharmila12345");
		System.out.println("Application login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Loogut "+res);
		
		om.org_Close();
		System.out.println("Browser Closed");

	}

}
