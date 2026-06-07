package Linked_List;

class Node{
	int x;
	
	Node(int y)
	{
		this.x = y;
		
		System.out.println(x);
		
	}
	
	void display(int x) 
	{
		System.out.println(x);
	}
	
	
}

public class First_Node_Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node x = new Node(7);
		System.out.println(x);
		
		Node y = x;   // node y Points towards memory address of node x in heap memory
		System.out.println(y);
		
	}

}
