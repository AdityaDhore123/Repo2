package Printing_Exception_In_ExceptionHandling;

public class toString 
{

	public static void main(String[] args) 
	{
		try
		{
			int a=10, b=0, c;
			c = a/b;
			
			System.out.println(c);
		}
		catch(Exception e1)
		{
			System.out.println(e1.toString());
		}
		
		System.out.println("Welcome");
	}

}
