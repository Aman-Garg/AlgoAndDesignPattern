package code.dp;

public class KnapSackTopDownApproach {
	
	public static void main(String args[]) {
	
		int wt[] = {10,20,30};
		int val[] = {60,100,120};
		int n = wt.length;
		int w = 50;
		
		int t[][] = new int[n+1][w+1];
		for(int i=0; i<n+1; i++) {
			t[i][0] = 0;
		}
		
		for(int j=0; j<w+1; j++) {
			t[0][j] = 0;
		}
		
		for(int i=1; i<n+1 ; i++) {
			for(int j=1; j<w+1; j++) {
				if(wt[i-1] <= j ) {
					t[i][j] = Math.max(val[i-1] + t[i-1][j-wt[i-1]], t[i-1][j]);
				}else {
					t[i][j] = t[i-1][j];
				}
			}
		}
		System.out.println(n);
		System.out.println(t[n][w]);
		
	}
	

}
