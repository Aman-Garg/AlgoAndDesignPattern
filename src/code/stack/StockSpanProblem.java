package code.stack;

import java.util.Stack;

/**
 * 
 * @author aman This internally uses the nearest greatest element to the left algo
 */

public class StockSpanProblem {

	public static void main(String agrs[]) {
		Stack<Integer> stackData = new Stack<Integer>();
		int[] a = { 10, 4, 5, 90, 120, 80  };

		int[] nextGreaterIndex = new int[a.length];

		for (int i = 0; i <= a.length - 1; i++) {

			while (!stackData.isEmpty()) {
				if (a[stackData.lastElement()] > a[i]) {
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

		for (int i = 0; i < a.length; i++) {
			System.out.print(i - nextGreaterIndex[i]+" ");
		}

	}

}
