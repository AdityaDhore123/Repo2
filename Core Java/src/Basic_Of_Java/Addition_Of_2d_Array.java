package Basic_Of_Java;
import java.util.*;

public class Addition_Of_2d_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter number of matrices :");
		int a = s1.nextInt();
		
		System.out.println("Enter number of rows");
		int b = s1.nextInt();
		
		System.out.println("Enter number of columns:");
		int c = s1.nextInt();		
		
		int arr[][][] = new int[a][b][c];
		
		for(a=0; a<2; a++) {
			
			for(b=0; b<3; b++) {
				
				for(c=0; c<3; c++) {
					arr[a][b][c] = s1.nextInt();
				}
			}
			
			System.out.println();
		}
		
//		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					System.out.print(arr[i][j][k]);
					System.out.print(" ");
				}
				
				System.out.println(" ");
			}
			
			System.out.println();
		}
		
		
		

	}

}
