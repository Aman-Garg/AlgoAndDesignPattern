package code.sorting;

/**
 * 
 * @author aman
 * Current index element in the nested loop is matched with the next index element
 */
public class BubbleSort {
	
	public static void main(String args[]) {
		int arr[] = new int[] {23,1,23,4,4,5,6,6,7,7,8,899,123,34,65,657,67};
		
		for(int i=0; i<arr.length ; i++) {
			for(int j=0; j<arr.length-1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
