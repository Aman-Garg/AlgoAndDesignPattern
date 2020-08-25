package code.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author aman
 * Uses Nearest smaller to right and left both algo
 */
public class MaximumAreaHistogram {

	public static void main(String agrs[]) {
		
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		Stack<Integer> stackData = new Stack<Integer>();
		
		for(int j=1; j<=testCases; j++) {
			stackData.clear();
			int size = in.nextInt();
			int data[] = new int[size];
			for(int k=0; k< size; k++) {
				data[k] = in.nextInt();
			}
			int smallerLeftIndex[] = new int[data.length];
			int smallerRightIndex[] = new int[data.length];

			//smallest to the right
			for(int i= 0 ; i<=data.length-1 ; i++) {

				while(!stackData.isEmpty()) {
					if(data[i] > data[stackData.lastElement()]) {
						smallerLeftIndex[i] = stackData.lastElement();
						stackData.push(i);
						break;
					}else {
						stackData.pop();
					}
				}

				if(stackData.isEmpty()) {
					smallerLeftIndex[i] = -1;
					stackData.push(i);
				}
			}

			stackData.clear();
			
			//smallest to the left 
			for(int i=data.length-1 ; i>=0 ; i--) {

				while(!stackData.isEmpty()) {
					if(data[stackData.lastElement()] < data[i] ) {
						smallerRightIndex[i] = stackData.lastElement();
						stackData.push(i);
						break;
					}else {
						stackData.pop();
					}
				}

				if(stackData.isEmpty()) {
					smallerRightIndex[i] = data.length;
					stackData.push(i);
				}
			}
			
			int maxArea = 0;

			for(int i=0 ; i<data.length ; i++) {
				int area =(smallerRightIndex[i] - smallerLeftIndex[i] -1)*data[i] ;
				if(maxArea < area) {
					maxArea = area;
				}
			}
			
			System.out.println(maxArea);
			
		}
		
	}

}
