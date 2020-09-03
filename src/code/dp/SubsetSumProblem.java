package code.dp;

public class SubsetSumProblem {

	public static void main(String agrs[]) {

	
		
		int arr[] = new int[] {1,5,11,1};
		int sum = 9;
		int n = arr.length;
		
		boolean t[][] = new boolean[n + 1][sum + 1];
		// initializing the matrix
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < sum + 1; j++) {
				if (i == 0) {
					t[i][j] = false; 
				}

				if (j == 0) {
					t[i][j] = true;
				}
			}
		}
		

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < sum + 1; j++) {
				if(arr[i-1] <= j) {
					t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}

		System.out.println(t[n][sum]);
		//System.out.println(subsetSum(new int[] { 2, 3, 7, 8, 10 }, n - 1, sum));
	}

	public static boolean subsetSum(int arr[], int n, int sum) {

		boolean isSumPossible;

		if (sum == 0) {
			return true;
		}

		if (n == -1 || sum < 0) {
			return false;
		}


		isSumPossible = subsetSum(arr, n-1, sum-arr[n]); 
		if(!isSumPossible) {
			isSumPossible = subsetSum(arr, n-1, sum); 
		}

		return isSumPossible;

	}

}
