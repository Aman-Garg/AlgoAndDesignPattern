package code.dp.longestCommonSubsequence;

public class LongestCommonSubString {
	
	public static void main(String agrs[]) {
		String x = "tycde";
		String y = "abcde";
		
		int n = x.length();
		int m = y.length();
		
		int result = 0;
		
		int subProblem[][] = new int[n+1][m+1];
		for(int i=0; i<n+1 ; i++ ) {
			subProblem[i][0] = 0;
		}
		
		for(int j=0; j<m+1 ; j++) {
			subProblem[0][j] = 0;
		}
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<m+1; j++) {
				if(x.charAt(i-1) == y.charAt(j-1)) {
					subProblem[i][j] = 1 + subProblem[i-1][j-1];
					if(subProblem[i][j] > result) {
						result = subProblem[i][j];
					}
				}else {
					subProblem[i][j] = 0;
				}
			}
		}
		
		System.out.println(result);
		
	}

}
