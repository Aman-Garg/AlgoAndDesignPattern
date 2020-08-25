package code.stack;

import java.util.Stack;

public class NextGreaterElementInArray {
	
	public static void main(String agrs[]) {
		Stack<Integer> stackData = new Stack<Integer>();
		
		int data[] = {3,4,5,6,8,3,5,6,7,55,3,3,333323,231,12,43,77777777};
		
		int result[] = new int[data.length];
		
		for(int i=data.length-1; i>=0 ; i--) {
			
			while(!stackData.isEmpty()) {
				if(stackData.lastElement() > data[i]) {
					result[i] = stackData.lastElement();
					stackData.push(data[i]);
					break;
				}else {
					stackData.pop();
				}
			}
			
			if(stackData.isEmpty()) {
				stackData.push(data[i]);
				result[i] = -1;
			}
			
		}
		
	
		
		for(int i=0; i<result.length ; i++) {
			System.out.println(data[i] +"          --------------->         "+result[i]);
		}
	}

}
