package Throw_and_Throws;

class Company
{
	public void display(String car[], int n) throws ArrayIndexOutOfBoundsException, NullPointerException, ArithmeticException
	{
		System.out.println(car[n]);
	}
}

public class throwing_MultipleException_using_Single_throws
{

	public static void main(String[] args)
	{
		String car[] = {"BMW", "CBZ", "Audi", "OLA"};
		Company c1 = new Company();
		try
		{
			c1.display(car, 5);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Index not Found");
		}
		
	}

}
