
public class SwitchCaseEg {

	public static void main(String[] args)
	{
		String course="Manual";
		
		switch(course)
		{
		case "selenium":
			System.out.println("You are selected selenium");
			break;
		case "Uft":
			System.out.println("You are selected uft");
			break;
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		case "Load Runner":
			System.out.println("You are selected Load Runner");
			break;
		default:
			System.out.println("Select a proper keyword");
			break;
			
		}

	}

}
