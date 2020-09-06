package code.dp;


/**
 * 
 * @author aman
 * Same as countNumberOfSubsetWithGivenDiff just way of asking is different
 */
public class TargetSum {
	
	public static void main(String args[]) {
		int arr[] = new int[] {1,1,2,3};
		int n = arr.length;
		int targetSum = 1;
		
		int sum = 0;
		
		for(int i=0; i<n;i++) {
			sum += arr[i];
		}
		
		int subsetSum = (targetSum+sum)/2;
		
		
		int t[][] = new int[n+1][subsetSum+1];
		
		for(int i=0; i<n+1; i++) {
			for(int j=0; j<subsetSum+1; j++) {
				if(i==0) {
					t[i][j] = 0;
				}
				
				if(j==0) {
					t[i][j] = 1;
				}
			}
		}
		
		for(int i=1; i<n+1; i++) {
			for(int j=1; j<subsetSum+1; j++) {
				if(arr[i-1] <= j) {
					t[i][j] = t[i-1][j] + t[i-1][j-arr[i-1]];
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		if(t[n][subsetSum]>0) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}

}
