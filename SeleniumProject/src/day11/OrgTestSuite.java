package day11;

import day10.OrgFunctionMaster;

public class OrgTestSuite {

	public static void main(String[] args)
	{
		OrgFunctionMaster om=new OrgFunctionMaster();
		// Login Tc
		String res=om.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Loogut "+res);
		
		om.org_Close();
		System.out.println("Browser Closed");

		//Empreg TC
		
		res=om.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application login "+res);
		
		res=om.org_Empeg("Sharmila123", "Sharmila");
		System.out.println("Employee registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Loogut "+res);
		
		om.org_Close();
		System.out.println("Browser Closed");
		
		//Userreg TC
		
		res=om.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application login "+res);
		
		res=om.org_Userreg("Sharmila123 Sharmila", "Sharmila1234578", "Sharmila12345", "Sharmila12345");
		System.out.println("User registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Loogut "+res);
		
		om.org_Close();
		System.out.println("Browser Closed");
		
		//UserLogin
		
		res=om.org_LAunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.org_Login("Sharmila1234578", "Sharmila12345");
		System.out.println("Application login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Loogut "+res);
		
		om.org_Close();
		System.out.println("Browser Closed");
	}

}
