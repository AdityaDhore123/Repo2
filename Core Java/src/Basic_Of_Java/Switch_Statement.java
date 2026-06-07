package Basic_Of_Java;

public class Switch_Statement {

	public static void main(String[] args) {
		
		int a=10, b=50, c;
		int choice = 5;
		
		switch(choice) {
		
		case 1:
			c = a + b;
			System.out.println(c);
			break;
			
		case 2:
			c = a - b;
			System.out.println(c);
			break;
			
		case 3:
			c = a * b;
			System.out.println(c);
			break;
			
		case 4:
			c = a / b;
			System.out.println(c);
			break;
			
		case 5:
			c = a % b;
			System.out.println(c);
			break;
			
		default:
			System.out.println("Enter Correct Choice");
		}

	}

}
