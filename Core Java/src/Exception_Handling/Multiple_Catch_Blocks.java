package Exception_Handling;

public class Multiple_Catch_Blocks 
{

	

	public static void main(String[] args) 
	{
		String name = null;
		
		try
		{
			int a=20, b=0, c;
			 
			c = a/b;
			
			System.out.println(c);
			System.out.println(name.length());
		}
		
		
		
		catch(Exception e2)
		{
			System.out.println(e2	);
		}
		

	}

}
