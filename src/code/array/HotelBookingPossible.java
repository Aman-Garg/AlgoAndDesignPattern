package code.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HotelBookingPossible {
	
	public static void main(String agrs) {

		ArrayList<Integer> arrive = new ArrayList<Integer>(Arrays.asList(1,3,5));
		ArrayList<Integer> depart = new ArrayList<Integer>(Arrays.asList(2,6,8));
		int K = 1;
		Collections.sort(arrive);
	    Collections.sort(depart);
	    int n = arrive.size();
	    int currBookingCount = 1;
	    int maxBookingCount = 1;
	    int arriveIdx = 1;
	    int departIdx = 0;
	    while (arriveIdx < n && departIdx < n) {
	      if (arrive.get(arriveIdx) < depart.get(departIdx)) {
	        currBookingCount++;
	        maxBookingCount = Math.max(maxBookingCount, currBookingCount);
	        arriveIdx++;
	      }
	      else {
	        currBookingCount--;
	        departIdx++;
	      }
	      if (maxBookingCount > K) {
	        System.out.println(false);
	      }
	    }
	    System.out.println(true);
	    
		
	}

}
