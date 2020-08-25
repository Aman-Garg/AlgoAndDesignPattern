package code.stack;

import java.util.Stack;

public class NextSmallestElementInArray {
	
	public static void main(String agrs[]) {
		Stack<Integer> stackData = new Stack<Integer>();
		
		int a[] = {1,3,4,1,6,8,3,2};
		
		int result[] = new int[a.length];
		
		for(int i=a.length-1; i>=0 ; i--) {
			
			while(!stackData.isEmpty()) {
				if(stackData.lastElement() < a[i]) {
					result[i] = stackData.lastElement();
					break;
				}else {
					stackData.pop();
				}
			}
			
			if(stackData.isEmpty()) {
				stackData.push(a[i]);
				result[i] = -1;
			}
			
		}
		
	
		
		for(int i=0; i<result.length ; i++) {
			System.out.println(a[i] +"---------------> "+result[i]);
		}
	}
	

}
