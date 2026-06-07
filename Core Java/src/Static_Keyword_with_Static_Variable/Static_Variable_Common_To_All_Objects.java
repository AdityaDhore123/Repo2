package Static_Keyword_with_Static_Variable;

class Staff
{
	int sid;
	
	String sname;
	
	static String scity = "Jaipur";
	
	Staff(int sid, String sname)
	{
		this.sid = sid;
		this.sname = sname;
	}
	
	void display()
	{
		System.out.println("Id is "+sid);
		System.out.println("Name is "+sname);
		System.out.println("Citya is "+scity);
	}
}


public class Static_Variable_Common_To_All_Objects 
{

	public static void main(String[] args) 
	{
		Staff s1 = new Staff(101, "ABC");
		s1.display();
		
		
		
		Staff s2 = new Staff(102, "LMN");
		s2.display();
		
		Staff s3 = new Staff(103, "JKL");
		s3.display();
	}

}
