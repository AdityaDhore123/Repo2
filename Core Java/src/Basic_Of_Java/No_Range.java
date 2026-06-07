package Basic_Of_Java;

public class No_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 15;
		
		if(number >=1 && number<=10) {
			System.out.println("Range 1");
		}else if(number >=11 && number <= 20) {
			System.out.println("Range 2");
		}else if(number >=21 && number<=30) {
			System.out.println("Range 3");
		}else {
			System.out.println("Out of Range");
		}
	}

}
