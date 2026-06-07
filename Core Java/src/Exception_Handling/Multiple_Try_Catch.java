package Exception_Handling;

public class Multiple_Try_Catch
{

	public static void main(String[] args)
	{
		int a=30, b=0;
		String s1 = null;
		
		try
		{
			int c = a / b;
			System.out.println("Welcome");
			
		}
		catch(Exception e)
		{
			System.out.println("Cannot Divided by zero");
		}
		
		
		try
		{
			System.out.println(s1.length());
		}
		catch(Exception e)
		{
			System.out.println("Enter Valid String");
		}
	}

}
