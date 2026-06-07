package Linked_List;

class Umber
{
	int data;
	Umber next;
	
	Umber(int data1, Umber next1)
	{
		this.data = data1;
		this.next = next1;
	}
	
	Umber(int data1)
	{
		this.data = data1;
		this.next = null;
	}
}

public class First_Node_Data {

	public static void main(String[] args) {
		int arr[] = {3,5,8,9,5};
		
		Umber y = new Umber(arr[0]);
		System.out.println(y.data);
		

	}

}
