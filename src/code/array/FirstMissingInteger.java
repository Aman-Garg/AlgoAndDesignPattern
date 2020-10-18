package code.array;

import java.util.ArrayList;

public class FirstMissingInteger {
	
	public static void main(String agrs[]) {
		ArrayList<Integer> data = new ArrayList<Integer>();
		data.add(1);
		data.add(0);
		data.add(2);
		data.add(-2);
		data.add(-3);
		
		int j=0;
		
		for(int i=0; i<data.size(); i++) {
			if(data.get(i) < 0) {
				int temp = data.get(j);
				data.set(j, data.get(i));
				data.set(i, temp);
				j++;
				
			}
		}
		
		System.out.println(j);
	}

}
