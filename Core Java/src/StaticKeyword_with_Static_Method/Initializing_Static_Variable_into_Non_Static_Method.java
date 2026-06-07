package StaticKeyword_with_Static_Method;

class Sample
{
	static int x;
	
//	void get()
//	{
//		x = 10;
//		System.out.println("Value of x is "+x);
//		
//	}
	
	void display()
	{
		x+=1;
		System.out.println(x);
	}
	
}

public class Initializing_Static_Variable_into_Non_Static_Method 
{

	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
//		s1.get();
		s1.display();
		
		
		Sample s2 = new Sample();
		s2.display();
		
		Sample s3 = new Sample();
		s3.display();

	}

}
