package Basic_Of_Java;

public class Odd_Element_In_Array {

	public static void main(String[] args) {
		int num[] = {10,20,30,43,57,33};
		
		for(int i=0; i<num.length; i++) {
			if(num[i] % 2 != 0) {
				System.out.println(num[i]);
			}
		}

	}

}
