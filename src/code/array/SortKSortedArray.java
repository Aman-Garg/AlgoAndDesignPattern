package code.array;

import java.util.PriorityQueue;

public class SortKSortedArray {

	public static void main(String[] args) {

		int arr[] = {6,5,3,2,8,10,9};
		int n = arr.length;
		int k =3;

		int sortedArr[] = new int[n];
		int j =0;

		PriorityQueue<Integer> forwardQueue = new PriorityQueue<Integer>();

		for(int i=0; i<n; i++) {
			if(arr[i] ==2) {
				System.out.println();
			}
			forwardQueue.add(arr[i]);
			if(forwardQueue.size() > k+1) {
				sortedArr[j] = forwardQueue.poll();
				j++;
			}
		}
		
		while(forwardQueue.size() > 0) {
			sortedArr[j] = forwardQueue.poll();
			j++;
		}
		
		for(int i=0; i<j ; i++) {
			System.out.print(sortedArr[i] + " ");
		}


	}

}
