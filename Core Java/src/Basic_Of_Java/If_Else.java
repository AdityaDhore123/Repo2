package Basic_Of_Java;

public class If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 67;
		
		if(marks >=85) 
		{
			System.out.println("A grade");
		}
		else if(marks >=75 && marks<85) 
		{
			System.out.println("B grade");
		}
		else if(marks >=65 && marks<75) {
			System.out.println("C grade");
		}
		else {
			System.out.println("D Grade");
		}

	}

}
