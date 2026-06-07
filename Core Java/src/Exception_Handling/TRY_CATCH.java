package Exception_Handling;

public class TRY_CATCH 
{

	public static void main(String[] args)
	{
		String str = null;
		
		try
		{
			System.out.println(str.length());
		}
		catch(Exception e)
		{
			System.out.println("String Cannot Be Null");
		}
		
		System.out.println("Entered String is  "+str);
	}

}
