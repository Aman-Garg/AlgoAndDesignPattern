package code.dp;

public class MinimubSubsetSumDifference {
	
	public static void main(String grs[]) {
		int arr[] = new int[] {10,20,15,5, 25};
		int n = arr.length;
		int sum = 0;
		
		for(int i=0; i<n;i++) {
			sum += arr[i];
		}
		
		
		int t[][] = new int[n+1][sum+1];
		
		for(int i=0; i<=n ; i++) {
			for(int j=0; j<=sum; j++) {
				if(i==0 || j==0) {
					t[i][j] = 0;
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			for (int j=1; j<=sum; j++) {
				if(arr[i-1] <= j ) {
				
					t[i][j] = Math.max(arr[i-1]+t[i-1][j-arr[i-1]] , t[i-1][j]);
				}else {
					t[i][j] = t[i-1][j]; 
				}
			}
		}
		
		int min = sum;
		
		for(int i=0; i<sum+1 ; i++) {
			int temp = sum - i;
			if(t[n][temp] == temp && i==t[n][i]) {
				min = Integer.min(min, Math.abs(t[n][temp]-i));
			}
		}
		
		System.out.println(min);
		
//		for(int i=0; i<=n; i++) {
//			for(int j=0 ; j<=sum; j++) {
//				System.out.print(t[i][j] + "      ");
//			}
//			System.out.println();
//		}
		
	}

}
