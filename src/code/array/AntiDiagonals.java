package code.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 
 * @author aman
 * Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.
 * 
 * Input: 	
 *	1 2 3
 *	4 5 6
 *	7 8 9
 *
 * Return the following :
 *	[ 
 *	  [1],
 *	  [2, 4],
 *	  [3, 5, 7],
 *	  [6, 8],
 *	  [9]
 *	]
 */
public class AntiDiagonals {
	
	public static void main(String agrs[]) {
		
		ArrayList<ArrayList<Integer>> data = new ArrayList<>();
		data.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		data.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
		data.add(new ArrayList<Integer>(Arrays.asList(7,8,9)));
		
		int row = data.size();
		int col = data.get(0).size();
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		
		
		for(int j =0; j<col; j++) {
			ArrayList<Integer> tempArrayList = new ArrayList<Integer>();
			int k = 0;
			for(int i=j; i>=0; i--) {
				tempArrayList.add(data.get(k).get(i));
				k++;
			}
			result.add(tempArrayList);
		}
		
		for(int i=1; i<row; i++) {
			ArrayList<Integer> tempArrayList = new ArrayList<Integer>();
			int k = col-1;
			for(int j =i; j<col; j++) {
				tempArrayList.add(data.get(j).get(k));
				k--;
			}
			result.add(tempArrayList);
		}
		
		System.out.println();
		
		
	}

}
