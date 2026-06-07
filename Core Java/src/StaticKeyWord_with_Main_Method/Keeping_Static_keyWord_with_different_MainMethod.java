package StaticKeyWord_with_Main_Method;

public class Keeping_Static_keyWord_with_different_MainMethod
{
	static public void main(String s1)
	{
		System.out.println(s1);
	}

	public static void main(String[] args) 
	{
	  
		Keeping_Static_keyWord_with_different_MainMethod.main("Good");
		
		System.out.println("AfterNoon");
	}

}
