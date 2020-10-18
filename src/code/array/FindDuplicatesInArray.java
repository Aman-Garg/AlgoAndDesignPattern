package code.array;


public class FindDuplicatesInArray {

	public static void main(String agrs[]) {
		int arr[] = {3,4,5,12,12,3,4,1,3,3,3,1};
		
		for(int i=0; i<arr.length ; i++) {
			if(arr[Math.abs(arr[i])-1] > 0 ) {
				arr[Math.abs(arr[i])-1] = arr[Math.abs(arr[i])-1]*-1;
				System.out.print(Math.abs(arr[i])+" ");
			}
		}
		
		
		
	}
	
}
