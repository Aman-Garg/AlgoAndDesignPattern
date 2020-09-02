package code.dp;

public class KnapSack {
	
	static int t[][] = new int[102][1002]; 
	
	public static void main(String agrs[]) {
		
		for(int i=0; i<102; i++) {
			for(int j=0; j<1002; j++) {
				t[i][j] = -1;
			}
		}
		
		System.out.println(knapSack(new int[] {10,20,30}, new int[] {60,100,120}, 3, 50));
		
	}
	
	private static int knapSack(int wt[], int val[], int n, int w) {
		
		if(n==0 || w ==0) {
			return 0;
		}
		
		if(t[n][w] != -1) {
			return t[n][w];
		}
		
		if(wt[n-1] <= w) {
			t[n][w] =  Math.max(val[n-1]+knapSack(wt, val, n-1, w-wt[n-1]), knapSack(wt, val, n-1, w));
			return t[n][w];      
		}else {
			t[n][w] = knapSack(wt, val, n-1, w); 
			return t[n][w];  
		}
		
		
	}

}
