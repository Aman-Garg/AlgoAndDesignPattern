package code.dp;

public class CatlanNumber {
	
	static int[] catlanNumber = new int[100];
	static {
		catlanNumber[0] = 1;
		catlanNumber[1] = 1;
		
		for(int i=2; i<100; i++) {
			catlanNumber[i] = -1;
		}
	}
	public static void main(String agrs[]) {
		System.out.println(catlan(10));
	}
	
	private static int catlan(int n) {
		int res = 0;
		if(catlanNumber[n] != -1) {
			return catlanNumber[n];
		}
		
		for(int i=0; i<n; i++) {
			res += catlan(i)*catlan(n-i-1);
		}
		
		catlanNumber[n] = res;
		return catlanNumber[n];
		
	}
}
