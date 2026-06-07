package Static_Keyword_with_Static_Variable;

class Sample
{
	static int x = 0;
	
	Sample()
	{
		x = x+1;
		
		System.out.println(x);
	}
}

public class CarryForward_Changable_Value_Of_Static_Variable 
{

	public static void main(String[] args)
	{
		 new Sample();
		 
		 new Sample();
		 
		 new Sample();
		 
		 new Sample();
		 
		 new Sample();

	}

}
