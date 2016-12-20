
public class DynamicArrayEg {

	public static void main(String[] args) 
	{
		int[] sal=new int[10];
		
		//length of the array

		System.out.println(sal.length);
		
		//write the data into the array
		
		sal[5]=40000;
		sal[8]=60000;
		sal[3]=40000;
		sal[8]=70000;
		
		//Reading the data from an array
		
		for (int i = 0; i < sal.length; i++) 
		{
			System.out.println(sal[i]);
			
		}
	}

}
