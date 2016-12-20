import java.util.ArrayList;


public class ArrayListEg {

	public static void main(String[] args)
	{
		
		ArrayList<Object> x=new ArrayList<Object>();
		
		//writing the data into array
		
		x.add("Selenium");
		x.add("Sharmila");
		x.add(40000);
		x.add(true);
		x.add(4, 444.44);
		x.add("Manual");
		
		// finding the length of the array
		
		System.out.println(x.size());
		
		//Read the data from araylist
		
		for (int i = 0; i < x.size(); i++)
		{
			System.out.println(x.get(i));
			
		}
	}

}
