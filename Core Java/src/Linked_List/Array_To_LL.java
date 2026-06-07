package Linked_List;

class Nodek
{
	int data;
	Nodek next;
	
	Nodek(int data1, Nodek next1)
	{
		this.data = data1;
		this.next = next1;
	}
	
	Nodek(int data1)
	{
		this.data = data1;
		this.next = null;
	}
}

public class Array_To_LL {
	
	private static Nodek convertArrayToLL(int arr[])
	{
		Nodek head = new Nodek(arr[0]);
		Nodek mover = head;
		
		for(int i=1; i<arr.length; i++)
		{
			Nodek temp = new Nodek(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		
		return head;
	}

	public static void main(String[] args) {
		int arr[] = {23,6,8,0,7,5,5};
		Nodek head = convertArrayToLL(arr);
		System.out.println(head.data);

	}

}
