package code.stack;

import java.util.Stack;

public class MaxAreanRectangeInBinaryMatrix {

	public static void main(String agrs[]) {

		int 	M[][] = {{0, 1, 1, 0},{1, 1, 1, 1},{1, 1, 1, 1},{1, 1, 0,0}};

		int maxArea = maxArea(M, 4, 4);
	}

	public static int maxArea(int[][] data, int n, int m) {

		int converted1DArray[] = new int[m];
		int maxArea = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (data[i][j] == 0) {
					converted1DArray[j] = 0;
				} else {
					converted1DArray[j] += data[i][j];
				}
			}
			int histogramArea = maxAreaInHistogram(converted1DArray, m);
			
			System.out.println("Maximum Area for histogram "+i +" is "+ histogramArea);
			
			if(maxArea < histogramArea) {
				maxArea = histogramArea;
			}
		}

		return maxArea;
	}

	public static int maxAreaInHistogram(int[] data, int n) {
		Stack<Integer> stackData = new Stack<Integer>();

		int smallerLeftIndex[] = new int[data.length];
		int smallerRightIndex[] = new int[data.length];

		// smallest to the right
		for (int i = 0; i <= data.length - 1; i++) {

			while (!stackData.isEmpty()) {
				if (data[i] > data[stackData.lastElement()]) {
					smallerLeftIndex[i] = stackData.lastElement();
					stackData.push(i);
					break;
				} else {
					stackData.pop();
				}
			}

			if (stackData.isEmpty()) {
				smallerLeftIndex[i] = -1;
				stackData.push(i);
			}
		}

		stackData.clear();

		// smallest to the left
		for (int i = data.length - 1; i >= 0; i--) {

			while (!stackData.isEmpty()) {
				if (data[stackData.lastElement()] < data[i]) {
					smallerRightIndex[i] = stackData.lastElement();
					stackData.push(i);
					break;
				} else {
					stackData.pop();
				}
			}

			if (stackData.isEmpty()) {
				smallerRightIndex[i] = data.length;
				stackData.push(i);
			}
		}

		int maxArea = 0;

		for (int i = 0; i < data.length; i++) {
			int area = (smallerRightIndex[i] - smallerLeftIndex[i] - 1) * data[i];
			if (maxArea < area) {
				maxArea = area;
			}
		}

		return maxArea;

	}

}
