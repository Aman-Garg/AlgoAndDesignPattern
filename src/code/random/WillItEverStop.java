package code.random;

import java.util.Scanner;

public class WillItEverStop {
	
	public static void main(String agrs[]) {
		
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		if(isPowerOfTwo(number)) {
			System.out.println("TAK");
		}else {
			System.out.println("NIE");
		}
		
	}
	
	static boolean isPowerOfTwo(int n)
	{
	    if(n==0)
	    return false;
	 
	return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
	       (int)(Math.floor(((Math.log(n) / Math.log(2)))));
	}

}
