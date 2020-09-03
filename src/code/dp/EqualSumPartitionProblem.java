package code.dp;

/**
 * 
 * @author aman
 * will find the one subset with totalSumOfArray/2, if this would be present then other will also be present
 */
public class EqualSumPartitionProblem {
	
	public static void main(String agrs[]) {
		int arr[] = new int[] {1,5,11,5};
		int n = arr.length;
		int arraySum = 0;
		for(int i=0; i<n ; i++) {
			arraySum += arr[i];
		}
		
		if(arraySum%2!=0) {
			System.out.println("False");
		}else {
			if(subSetSum(arr, arraySum/2, n)) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
			
		}
	}
	
	private static boolean subSetSum(int arr[], int sum, int n) {
		boolean t[][] = new boolean[n+1][sum+1];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<sum; j++) {
				if(i==0) {
					t[i][j] =  false;
				}
				
				if(j==0) {
					t[i][j] = true;
				}
			}
		}
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<sum+1; j++) {
				if(arr[i-1] <= j) {
					t[i][j] =  t[i-1][j-arr[i-1]] || t[i-1][j]; 
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		
		
		return t[n][sum];
	}

}
