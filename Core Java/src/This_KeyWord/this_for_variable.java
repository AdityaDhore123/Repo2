package This_KeyWord;

class Gang
{
	String gname;
	int gid;
	int age;
	
	void show(String gname, int gid, int age)
	{
		this.gname = gname;
		this.gid = gid;
		this.age = age;
		
		System.out.println(gname);
		System.out.println(gid);
		System.out.println(age);
	}
}

public class this_for_variable 
{

	public static void main(String[] args) 
	{
		Gang g1 = new Gang();
		g1.show("ABC", 101, 21);
		System.out.println(g1.gid);

	}

}
