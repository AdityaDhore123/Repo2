package Throw_and_Throws;

public class throw_Exception_using_ConstructorOf_ExceptionClass 
{

	public static void main(String[] args)
	{
		int age = 12;
		
		if(age>=18)
		{
			System.out.println("Ypu Can Vote");
		}
		else
		{
			throw new ArithmeticException("Invalid Age");
		}
		
		System.out.println("Continue");   //non-executable statement
	}

}

