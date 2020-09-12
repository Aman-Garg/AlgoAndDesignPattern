package code.dp.longestCommonSubsequence;

import java.io.CharConversionException;
import java.util.Stack;

public class PrintingLongestCommonSuperSeq {

	public static void main(String agrs[]) {
		String y = "abcdaf";
		String x = "acbcf";
		
		int n = x.length();
		int m = y.length();
		
		int subProblem[][] = new int[n+1][m+1];
		
		for(int i=0 ; i<n+1 ; i++) {
			subProblem[i][0] = 0;
		}
		
		for(int j=0; j<m+1 ; j++) {
			subProblem[0][j] = 0;
		}
		
		int count = 0;
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1 ; j++) {
				if(x.charAt(i-1) == y.charAt(j-1)) {
					subProblem[i][j] = 1 + subProblem[i-1][j-1];
				}else {
					subProblem[i][j] = Math.max(subProblem[i][j-1], subProblem[i-1][j]);
				}
			}
		}
		
		System.out.println(subProblem[n][m]);
		
	
		Stack<Character> subseq = new Stack<Character>();
		//char subseq[] = new char[n+m];
		
		int i = n;
		int j = m;
		
		while(j>0 && i>0) {
			if(x.charAt(i-1) == y.charAt(j-1)) {
				subseq.push(x.charAt(i-1));
				i--;
				j--;
			}else if(subProblem[i-1][j] > subProblem[i][j-1]) {
				subseq.push(x.charAt(i-1));
				 i = i-1;
			}else {
				subseq.push(y.charAt(j-1));
				j = j-1;
			}
		}
		
		
			while(!subseq.isEmpty()) {
				System.out.print(subseq.pop());
			}
		
		
	}
	

}
