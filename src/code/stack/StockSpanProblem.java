package code.stack;

import java.util.Stack;

/**
 * 
 * @author aman This internally uses the nearest greatest element to the left algo
 */

public class StockSpanProblem {

	public static void main(String agrs[]) {
		Stack<Integer> stackData = new Stack<Integer>();
		int[] data = { 10, 4, 5, 90, 120, 80  };

		int[] nextGreaterIndex = new int[data.length];

		for (int i = 0; i <= data.length - 1; i++) {

			while (!stackData.isEmpty()) {
				if (data[stackData.lastElement()] > data[i]) {
					nextGreaterIndex[i] = stackData.lastElement();
					stackData.push(i);
					break;
				} else {
					stackData.pop();
				}
			}

			if (stackData.isEmpty()) {
				stackData.push(i);
				nextGreaterIndex[i] = -1;
			}

		}

		for (int i = 0; i < data.length; i++) {
			System.out.print(i - nextGreaterIndex[i]+" ");
		}

	}

}
