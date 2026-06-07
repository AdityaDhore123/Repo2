package Basic_Of_Java;

public class GRADE_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 85;
		
		if(marks >=90) {
			System.out.println("Grade A");
		}else if(marks >=75) {
			System.out.println("Grade B");
		}else if(marks >=50) {
			System.out.println("Grade C");
		}else if(marks < 50) {
			System.out.println("Fail");
		}
	}

}
