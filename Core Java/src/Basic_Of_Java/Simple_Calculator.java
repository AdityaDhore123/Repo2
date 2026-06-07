package Basic_Of_Java;

public class Simple_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4, b=2;
		char operator = '/';
		
		switch(operator) {
		
		case '+':
			System.out.println(a+b);
			break;
			
		case '-':
			System.out.println(a - b);
			break;
			

		case '*':
			System.out.println(a * b);
			break;
			

		case '/':
			System.out.println(a / b);
			break;
		}
			
		
	}

}
