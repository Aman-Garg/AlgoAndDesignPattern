package code.array;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


public class MostKFrequentNumber {
	
	public static void main(String agrs[]) {
		
		MostKFrequentNumber mkfn = new MostKFrequentNumber();
		
		int arr[] = {1,3,3,3,2,2,4};
		int n = arr.length;
		int k = 2;
		
		HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		for(int i=0 ; i<n; i++) {
			if(countMap.containsKey(arr[i])) {
				countMap.put(arr[i], countMap.get(arr[i])+1);
			}else {
				countMap.put(arr[i], 1);
			}
		}
		
		PriorityQueue<Pair> pr = new PriorityQueue<Pair>(new Comparator<Pair>() {
			public int compare(Pair p1, Pair p2) {
				return p1.getCount().compareTo(p2.getCount());
			}
		});
		
		for(Map.Entry<Integer, Integer> entrySet : countMap.entrySet()) {
			pr.add(mkfn.new Pair(entrySet.getKey(),entrySet.getValue()));
			if(pr.size() > k) {
				pr.poll();
			}
		}
		
		while(pr.size() > 0) {
			System.out.print(pr.poll().getNumber()+" ");
		}
		
	}
	
	class Pair{
		Integer number;
		Integer count;
		
		public Pair(Integer number, Integer count) {
			this.number = number;
			this.count = count;
		}
		public Integer getNumber() {
			return number;
		}
		public void setNumber(Integer number) {
			this.number = number;
		}
		public Integer getCount() {
			return count;
		}
		public void setCount(Integer count) {
			this.count = count;
		}
		
	}

}
