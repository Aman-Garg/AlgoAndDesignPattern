package code.dp;

/**
 * 
 * @author aman
 * 
 */
public class PalindromePartitioning {

	static int t[][] = new int[1001][1001];

	public static void main(String agrs[]) {

		String s = "ntxin";

		for(int i=0; i<1001; i++) {
			for(int j=0; j<1001; j++) {
				t[i][j] = -1;
			}
		}


		int i = 0;
		int j = s.length();
		System.out.println(countSubPalindromeString(s,i,j-1));

	}

	private static int countSubPalindromeString(String s, int i, int j) {

		if(i>=j) {
			return 0;
		}


		if(isPal(s.substring(i,j+1))) {
			return 0;
		}

		if(t[i][j] != -1) {
			return t[i][j];
		}

		int minPartition = Integer.MAX_VALUE;

		for(int k=i; k<j; k++) {

			int left,right;

			if(t[i][k] != -1) {
				left = t[i][k];
			}else {
				left = countSubPalindromeString(s, i, k);
				t[i][k] = left;
			}

			if(t[k+1][j] != -1) {
				right = t[k+1][j];
			}else {
				right = countSubPalindromeString(s, k+1, j);
				t[i][k] = right;
			}


			int temp = 1+left+right;
			
			if(temp < minPartition) {
				minPartition = temp;
			}
		}

		t[i][j] = minPartition;

		return minPartition;
	}

	private static  boolean isPal(String s)
	{  
		if(s.length() == 0 || s.length() == 1) {
			return true; 
		}

		if(s.charAt(0) == s.charAt(s.length()-1)) {
			return isPal(s.substring(1, s.length()-1));
		}

		return false;
	}

}
