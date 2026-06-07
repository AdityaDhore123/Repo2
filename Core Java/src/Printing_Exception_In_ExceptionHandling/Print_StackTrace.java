package Printing_Exception_In_ExceptionHandling;

public class Print_StackTrace 
{

	public static void main(String[] args) 
	{
		try
		{
			int a = 10, b=0, c;
			c= a/b;
			
			System.out.println(c);
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		
		System.out.println("Program Executed");
	}

}
