package day10;

public class DemoFunctions 
{

	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		DemoFunctions df=new DemoFunctions();
		df.function3();
		
		boolean result=df.function4();
		System.out.println(result);
	}

	//static method without returning any value
	public static void function1()
	{
		System.out.println("This is function1 code");
	}
	//static method with returning value
	public static String function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}
	
	
	//Non static method without returning value
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	//Non static method with returning value
	
	public boolean function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	
}
