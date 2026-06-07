package Exception_Handling;

public class Using_tryCatch_inside_Catch 
{

	public static void main(String[] args)
	{
		String name = null;
		
		try
		{
			System.out.println(name.length());
		}
		catch(Exception e)
		{
			int a=20, b=0, c;
			
			try
			{
				System.out.println(a/b);

			}
			catch(Exception e1)
			{
				System.out.println("Cannot Divided by Zero");
			}
			
			System.out.println("String Cannot Be null");
		}
	}

}
