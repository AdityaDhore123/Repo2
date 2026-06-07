package StaticKeyword_with_Static_Method;

class Sport
{
	static int x;
	
	public static void get()
	{
		x = 10;
		
	}
	
	public static void display()
	{
		x++;
		System.out.println(x);
	}
}

public class Initializing_Static_Variable_into_Static_Method 
{

	public static void main(String[] args) 
	{
		Sport.get();
		Sport.display();
		
		Sport.display();
		
		

	}

}
