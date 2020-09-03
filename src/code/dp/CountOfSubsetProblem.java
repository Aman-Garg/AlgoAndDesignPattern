package code.dp;

public class CountOfSubsetProblem {
	
	public static void main(String agrs[]) {
		
		int arr[] = new int[] {1,5,5,5};
		int n = arr.length;
		int sum = 11;
		
		System.out.println(countSubset(arr, n, sum));
		
		
	}
	
	private static int countSubset(int arr[], int n, int sum) {
		int t[][] = new int[n+1][sum+1];
		int count = 0;
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<sum+1; j++) {
				if(i==0) {
					t[i][j] = 0;
				}
				
				if(j==0) {
					t[i][j] = 1;
				}
			}
		}
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<sum+1; j++) {
				if(arr[i-1] <= j) {
					t[i][j] = t[i-1][j] + t[i-1][j-arr[i-1]];
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		
		
		
		return t[n][sum];
		
	}

}
