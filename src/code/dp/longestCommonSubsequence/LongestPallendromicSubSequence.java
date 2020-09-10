package code.dp.longestCommonSubsequence;

/**
 * 
 * @author aman
 *
 * LPS(A) = LCS(A, reverse(A))
 */
public class LongestPallendromicSubSequence {

	public static void main(String agrs[]) {
		String x = "abccasdad";
		String y = new StringBuffer(x).reverse().toString();

		int n = x.length();
		int m = y.length();

		String subProblem[][] = new String[n+1][m+1];
		

		for(int i=0; i<n+1 ; i++ ) {
			subProblem[i][0] = "";
		}

		for(int j=0; j<m+1 ; j++) {
			subProblem[0][j] = "";
		}


		for(int i=1 ; i<n+1; i++) {
			for(int j=1; j<m+1 ; j++) {
				
				if(x.charAt(i-1) == y.charAt(j-1)) {
					subProblem[i][j] = subProblem[i-1][j-1] + x.charAt(i-1);
				}else if(subProblem[i][j-1].length() > subProblem[i-1][j].length()) {
					subProblem[i][j] = subProblem[i][j-1];
				}else {
					subProblem[i][j] = subProblem[i-1][j];
				}
			}
		}

		System.out.println(subProblem[n][m]);
	}
	

}
