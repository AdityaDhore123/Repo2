package Constructor;

class Boys
{
	int roll_no;
	String name;
	
	Boys(int x,String y)
	{
		roll_no = x;
		name = y;
	}
	
	Boys(Boys boy)
	{
		roll_no = boy.roll_no;
		name = boy.name;
	}
	
	void display() {
		System.out.println("Roll_no is "+roll_no);
		System.out.println("Name is "+name);
	}
}

public class Copy_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boys b1 = new Boys(101, "ABC");
		b1.display();
		
		Boys b2 = new Boys(b1);
		b2.display();

	}

}
