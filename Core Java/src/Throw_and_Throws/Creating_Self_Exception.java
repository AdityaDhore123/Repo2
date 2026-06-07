package Throw_and_Throws;

class AgeNotValidException extends RuntimeException
{
	public AgeNotValidException(String s1)
	{
		super(s1);
	}
}

public class Creating_Self_Exception 
{

	public static void main(String[] args)
	{
		int age = 12;
		
		if(age > 18)
		{
			System.out.println("You Can vote");
		}
		else
		{
			throw new AgeNotValidException("Not Eligible for Voting");
		}
		

	}

}
