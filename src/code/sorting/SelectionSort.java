package code.sorting;

/**
 * @author aman
 * Sorted element in another array and will replace the selected value from the unsorted array
 * with some large integer 
 */
public class SelectionSort {
	
	public static void main(String agrs[]) {
		int sortedArray[] = selectionSort(new int[] {5,6,7,133,12,34,5,77,122});
		
		for(int i=0; i<sortedArray.length ; i++) {
			System.out.print(sortedArray[i]+ " ");
		}
	
	}
	
	private static int[] selectionSort(int arr[]) {
		int sortedArray[] = new int[arr.length];
		int minValueIndex = 0;
		int k=0;
		for(int i=0; i<arr.length ; i++) {
			for(int j=0 ; j<arr.length ; j++) {
				if(arr[minValueIndex] > arr[j]) {
					minValueIndex = j;
				}
			}
			
			sortedArray[k] = arr[minValueIndex];
			arr[minValueIndex] = Integer.MAX_VALUE;
			k++;
		}
		return sortedArray;
	}

}
