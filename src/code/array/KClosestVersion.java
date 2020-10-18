package code.array;

import java.util.Comparator;
import java.util.PriorityQueue;


public class KClosestVersion {

	public static void main(String[] args) {
		
		KClosestVersion kCV = new KClosestVersion();
		
		int arr[] = {5,6,7,8,9};
		int n = arr.length;
		int k = 3;
		int x = 7;
		
		PriorityQueue<Pair> pr = new PriorityQueue<Pair>(new Comparator<Pair>() {
			public int compare(Pair p1, Pair p2) {
				return p2.getKey().compareTo(p1.getKey());
			}
		});
		
		for(int i=0; i<n; i++) {
			
			pr.add(kCV.new Pair(Math.abs(arr[i] - x), arr[i]));
			if(pr.size() > k) {
				pr.poll();
			}
		}
		
		while(pr.size() > 0) {
			System.out.print(pr.poll().getValue()+" ");
		}
		
	}
	
	class Pair{
		Integer key; 
	    Integer value; 
	      
	    public Pair(Integer key, Integer value) 
	    { 
	        this.key = key; 
	        this.value = value; 
	    } 
	    public Integer getKey() 
	    { 
	        return key; 
	    } 
	    public void setKey(Integer key) 
	    { 
	        this.key = key; 
	    } 
	    public Integer getValue() 
	    { 
	        return value; 
	    } 
	    public void setValue(Integer value) 
	    { 
	        this.value = value; 
	    } 
	}

}
