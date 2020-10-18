package code.array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointToOrigin {
	
	public static void main(String agrs[]) {
		
		KClosestPointToOrigin kcpto = new KClosestPointToOrigin();
		
		int arr[][] = {{1,3},{-2,2},{5,8},{0,1}};
		int row = arr.length;
		int k = 2;
		
		
		PriorityQueue<Pair> pr = new PriorityQueue<Pair>(new Comparator<Pair>() {
			public int compare(Pair p1, Pair p2) {
				return p2.getD().compareTo(p1.getD());
			}
		});
		
		for(int i=0 ; i<row; i++) {
			pr.add(kcpto.new Pair(arr[i][0]*arr[i][0] + arr[i][1]*arr[i][1], arr[i][0], arr[i][1]));
			if(pr.size() > k) {
				pr.poll();
			}
		}
		
		while(pr.size() > 0) {
			Pair p = pr.poll();
			System.out.println(p.getX()+", "+p.getY());
		}
		
		
	}
	
	class Pair {
		
		Integer x;
		Integer y;
		Integer d;
		
		public Pair( Integer d, Integer x, Integer y) {
			this.x = x;
			this.y = y;
			this.d = d;
		}
		
		public Integer getX() {
			return x;
		}
		public void setX(Integer x) {
			this.x = x;
		}
		public Integer getY() {
			return y;
		}
		public void setY(Integer y) {
			this.y = y;
		}
		public Integer getD() {
			return d;
		}
		public void setD(Integer d) {
			this.d = d;
		}
		
	}

}
