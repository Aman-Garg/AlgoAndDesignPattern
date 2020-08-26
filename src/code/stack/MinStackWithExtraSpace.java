package code.stack;

import java.util.Stack;

/**
 * 
 * @author aman
 * Will use two stack, stack(s) and supporingStack(ss) 
 */
public class MinStackWithExtraSpace {
	
	public static void main(String args[]) {
		
		MinStackWithExtraSpace.stackExtend s = new MinStackWithExtraSpace.stackExtend();
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
		Stack<Integer> ss; 
		
		public stackExtend(){
			s = new Stack<Integer>();
			ss = new Stack<Integer>();
		}
		
		public void push(int number) {
			if(ss.isEmpty() || ss.lastElement() > number) {
				ss.push(number);
			}
			System.out.println("Number inserted in the stack is "+s.push(number));
		}
		
		public void pop() {
			if(s.empty()) {
				System.out.println("stack is empty");
				return;
			}
			
			if(s.lastElement() == ss.lastElement()) {
				ss.pop();
			}
			System.out.println("Top most number removed is "+s.pop());
		}
		
		public void getMin() {
			if(s.isEmpty()) {
				System.out.println("No Min Element as stack is empty");
				return;
			}
			System.out.println("Min Number in the stack is "+ss.lastElement());
		}
		
		public void peek() {
			if(s.isEmpty()) {
				System.out.println("No Element as stack is empty");
				return;
			}
			System.out.println("Min Number in the stack is "+s.peek());
		}
	}

}
