package code.stack;

import java.util.Stack;

public class LongestValidParenthesis {
	
	public static void main(String args[]) {
		String parenthesis = "()(()))))";
		char chars[] = parenthesis.toCharArray();
		
		Stack<Character> stack = new Stack<>();
		int length = 0 ;
		int tempLength = 0;
		
		for(char ch : chars) {
			if(ch=='(') {
				stack.push(ch);
			}else {
				if(!stack.isEmpty()) {
					stack.pop();	
					tempLength += 2; 
				}else {
					if(tempLength>length) {
						length = tempLength;
						tempLength = 0;
					}
					
				}
			}
		}
		
		if(tempLength>length) {
			length = tempLength;
		}
		
		System.out.println(length);
		
	}

}
