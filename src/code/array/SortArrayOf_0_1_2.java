package code.array;

public class SortArrayOf_0_1_2 {
	
	public static void main(String[] args) {
		
		int arr[] = { 0,1,2,0,1,2 };
		
		int start = 0; 
		int mid = 0;
		int end = arr.length-1;
		
	
		while(mid <= end) {
			if(arr[mid] == 0) {
				int temp = arr[start];
				arr[start] = arr[mid];
				arr[mid] = temp;
				start++;
				mid++;
			}else if(arr[mid] == 1) {
				mid++;
			}else {
				int temp = arr[mid];
				arr[mid] = arr[end];
				arr[end] = temp;
				end--;
			}
		}
		
		System.out.println("start "+start+" | mid "+mid+" | end "+end);
		
		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	

}
