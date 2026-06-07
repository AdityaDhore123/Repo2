package Finally_Block;

public class Sample 
{

	public static void main(String[] args) 
	{
		try
		{
			int a=20, b=0, c;
			c = a/b;
			System.out.println(c);
		}
		catch(Exception e1)
		{
			System.out.println("Cannot Divided by Zero");
		}
		finally
		{
			System.out.println("Program Executed Successfully");
		}
		
		

	}

}
