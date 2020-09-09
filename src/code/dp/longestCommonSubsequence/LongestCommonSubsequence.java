package code.dp.longestCommonSubsequence;

public class LongestCommonSubsequence {

	public static void main(String agrs[]) {
		String x = "ABCasdad";
		String y = "ACdfas";
		
		int subProblem[][] = new int[x.length()+1][y.length()+1];
		
		for(int i=0 ; i<x.length()+1 ; i++) {
			subProblem[i][0] = 0;
		}
		
		for(int j=0; j<y.length()+1 ; j++) {
			subProblem[0][j] = 0;
		}
		
		int count = 0;
		
		for(int i=1; i<x.length()+1; i++) {
			for(int j=1; j<y.length()+1 ; j++) {
				if(x.charAt(i-1) == y.charAt(j-1)) {
					subProblem[i][j] = 1 + subProblem[i-1][j-1];
				}else {
					subProblem[i][j] = Math.max(subProblem[i][j-1], subProblem[i-1][j]);
				}
			}
		}
		
		System.out.println(subProblem[x.length()][y.length()]);


//		System.out.println(lcs(x,y,x.length(),y.length()));


	}
/**
 *  Recursive approach 
 */
//	private static int lcs(String x, String y, int n, int m) {
//
//		if(n == 0 || m == 0) {
//			return 0;
//		}
//		
//		if(x.charAt(n-1) == y.charAt(m-1)) {
//			return 1 + lcs(x, y, n-1, m-1);
//		}else {
//			return Math.max(lcs(x,y,n-1,m), lcs(x,y,n,m-1));
//		}
//	}

}
