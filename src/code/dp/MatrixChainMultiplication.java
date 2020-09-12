package code.dp;

public class MatrixChainMultiplication {
	
	
	static int t[][] = new int[1001][1001];
	
	public static void main(String args[]) {
		
		int arr[] = {10,30,5,60};
		
		for(int i=0; i<1001; i++) {
			for(int j=0; j<1001; j++) {
				t[i][j] = -1;
			}
		}
		
		int i = 1;
		int j = arr.length -1;
		
		
		System.out.println(mcm(arr, i, j));
		
	}

	
	private static int mcm(int arr[], int i, int j) {
		if(i>=j) {
			return 0;
		} 
		
		if(t[i][j] != -1) {
			return t[i][j];
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int k=i; k<j ;k++) {
			int temp =  mcm(arr, i, k)+ mcm(arr, k+1, j) + arr[i-1]*arr[k]*arr[j];
			if(temp<min) {
				min = temp;
			}
		}
		t[i][j] =  min;
		return min;
	}
}
