package code.array;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 
 * @author aman
 * Find kth smallest element in the array - will be using heap
 * 
 */
public class KthSmallestElementInArray {
	
	public static void main(String agrs[]) {
		int arr[] = {7,10,4,3,20,15};
		int n = arr.length;
		
		int k = 4;
		/**
		 * Priority queue will only guarantee that of all the element inserted only the top most will be max or min, does not tell the order 
		 * of the element below it 
		 */
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0; i<n ; i++) {
			pq.add(arr[i]);
			if(pq.size() > k) {
				pq.poll();
			}
		}
		System.out.println(pq);
	}

}
