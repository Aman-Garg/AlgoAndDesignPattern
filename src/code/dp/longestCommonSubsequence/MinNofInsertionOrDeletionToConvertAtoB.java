package code.dp.longestCommonSubsequence;

public class MinNofInsertionOrDeletionToConvertAtoB {
	
	public static void main(String arhs[]) {
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
		
		int  numberOfDeletion = n-subProblem[n][m];
		int numberOfInsertion = m-subProblem[n][m];
		 
		System.out.println("Number of deletion : "+numberOfDeletion+"\nNumber of insertion : "+numberOfInsertion);
	}

}
