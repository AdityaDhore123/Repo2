package Throw_and_Throws;

class AgeNotValidException extends RuntimeException
{
	AgeNotValidException(String s1)
	{
		super(s1);
	}
}

public class Handling_self_created_exception 
{

	public static void main(String[] args)
	{
		int age = 14;
		
		if(age > 18)
		{
			System.out.println("You Can Vote");
		}
		else
		{
			try
			{
				throw new AgeNotValidException("Invalid Age");
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
		
		System.out.println("Continue");

	}

}
