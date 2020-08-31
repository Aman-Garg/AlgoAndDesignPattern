package code.stack;

import java.util.Stack;

public class CelebrityProblem {

	public static void main(String agrs[]) {
		/*
		 * int data[][] = { {0,0,1,0}, {0,0,1,0}, {0,1,0,0}, {0,0,1,0} };
		 */

		int data[][] = { {0, 0, 1, 0},
		           {0, 0, 1, 0},
		           {0, 0, 0, 0},
		           {0, 0, 1, 0} };

		int n =4;

		Stack<Integer> check = new Stack<>();

		for(int i=0; i<n; i++) {
			check.push(i);
		}

		for(int i=1; i<n; i++) {
			int row = check.pop();
			int column = check.pop();

			if(data[row][column] == 1) {
				check.push(column);
			}else{
				check.push(row);
			} 
		}

		if(check.isEmpty()) {
			System.out.println("No celebrity found");
			return;
		}

		int stackElement = check.peek();
		for(int i=0; i<n; i++) {
			if(i != stackElement && (data[i][stackElement] != 1 || data[stackElement][i] != 0)) {
				System.out.println("No celebrity found");
				check.pop();
				break;
			}
		}

		if(!check.isEmpty()) {
			System.out.println(check.peek() + " is a celebrity");
		}

	}

}
