package code.stack;

import java.util.Stack;

public class MinStackWithoutExtraSpace {

	public static void main(String args[]) {

		MinStackWithoutExtraSpace.stackExtend s = new MinStackWithoutExtraSpace.stackExtend();
		s.getMin();
		s.pop();
		s.push(3); 
		s.push(5); 
		s.getMin(); 
		s.push(2); 
		s.push(1); 
		s.getMin(); 
		s.pop(); 
		s.getMin(); 
		s.pop();
		s.peek();
		

	}


	static class stackExtend{
		Stack<Integer> s;

		int minElement;

		public stackExtend(){
			s = new Stack<Integer>();
		}

		public void push(int number) {
			
			if(s.isEmpty()) {
				minElement = number;
				s.push(number);
				System.out.println("Number inserted in the stack is "+number);
				return;
			}
			
			if(minElement >  number) {
				s.push(number*2-minElement);
				minElement=number;
			}else {
				s.push(number);
			}

			System.out.println("Number inserted in the stack is "+number);
		}

		public void pop() {
			if(s.empty()) {
				System.out.println("stack is empty");
				return;
			}

			if(s.lastElement() < minElement) {
				System.out.println("Top most number removed is "+minElement);
				minElement = minElement*2 - s.pop();
			}else {
				System.out.println("Top most number removed is "+s.pop());
			}

		}

		public void getMin() {
			if(s.isEmpty()) {
				System.out.println("No Min Element as stack is empty");
				return;
			}
			System.out.println("Min Number in the stack is "+minElement);
		}
		
		public void peek() {
			int last = s.peek();
			if (last < minElement) 
				System.out.println("Top Most element is "+minElement);
	        else
	        	System.out.println("Top Most element is "+last);
			
			
		}
	}

}
