package Basic_Of_Java;

public class Maximum_No_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {23744,2487,3948,24875,94875};
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					max = arr[i];
				}
			}
		}
		System.out.println(max);

	}

}
