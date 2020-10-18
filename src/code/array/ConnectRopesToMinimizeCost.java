package code.array;

import java.util.PriorityQueue;

public class ConnectRopesToMinimizeCost {
	
	public static void main(String agrs[]) {
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		
		PriorityQueue<Integer> pr = new PriorityQueue<Integer>();
		
		for(int i=0; i<arr.length ; i++) {
			pr.add(arr[i]);
		}
		
		int cost = 0;
		while(pr.size()>1) {
			int sum = pr.poll()+pr.poll();
			cost = cost +sum;
			pr.add(sum);
		}
		
		System.out.println(cost);
		
	}
	

}
