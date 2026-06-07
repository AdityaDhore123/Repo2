package Throw_and_Throws;

class Car
{
	public void display(String car[], int n) throws ArrayIndexOutOfBoundsException
	{
		System.out.println(car[n]);
	}
}

public class Use_Of_throws
{

	public static void main(String[] args) 
	{
		String car[] = {"BMW", "Audi", "CBZ"};
		
		Car c1 = new Car();
		
		try
		{
			c1.display(car, 5);
		}
		catch(Exception e1)
		{
			System.out.println("Index not Found");
		}
	}

}
