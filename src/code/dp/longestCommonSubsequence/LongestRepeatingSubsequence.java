package code.dp.longestCommonSubsequence;

public class LongestRepeatingSubsequence {
	
	public static void main(String agrs[]) {
		
		String y = "abcdab";
		String x = y;

		int n = x.length();
		int m = y.length();

		int subProblem[][] = new int[n+1][m+1];

		for(int i=0 ; i<n+1 ; i++) {
			subProblem[i][0] = 0;
		}

		for(int j=0; j<m+1 ; j++) {
			subProblem[0][j] = 0;
		}


		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1 ; j++) {
				if(x.charAt(i-1) == y.charAt(j-1) && i!= j) {
					subProblem[i][j] = 1 + subProblem[i-1][j-1];
				}else {
					subProblem[i][j] = Math.max(subProblem[i][j-1], subProblem[i-1][j]);
				}
			}
		}

		System.out.println(subProblem[n][m]);


	}

}
