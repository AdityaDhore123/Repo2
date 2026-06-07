package StaticKeyword_with_Static_Method;

class Employee
{
	void show()
	{
		Employee.get();
		
		System.out.println("Afternoon");
	}
	
	static void get()
	{
		System.out.println("Good");
	}
}

public class Calling_StaticMethod_IN_NonStatic_Method 
{

	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.show();

	}

}
