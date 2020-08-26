package code.stack;

public class RainWaterTapping {
	
	public static void main(String args[]) {
		int data[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		
		int maxLeft[] = new int[data.length];
		int maxRight[] = new int[data.length];
		
		maxLeft[0] = data[0];
		int j=0;
		for(int i=1; i<data.length; i++) {
			if(maxLeft[j] > data[i]) {
				maxLeft[i] = maxLeft[j];
			}else {
				maxLeft[i] = data[i];
			}
			j++;
		}
		
		maxRight[data.length-1] = data[data.length-1];
		j=data.length-1;
		
		for(int i=data.length-2 ; i>=0; i--) {
			if(maxRight[j] > data[i]) {
				maxRight[i] = maxRight[j];
			}else {
				maxRight[i] = data[i];
			}
			j--;
		}
		
		/**
		 * Printing Max right array
		 */
		System.out.print("Max Right array -> ");
		for(int i=0 ; i<maxRight.length ; i++) {
			System.out.print(maxRight[i]+" ");
		}
		
		System.out.println();
		
		/**
		 * Printing max left array
		 */
		System.out.print("Max left array -> ");
		for(int i=0 ; i<maxLeft.length ; i++) {
			System.out.print(maxLeft[i]+" ");
		}

		System.out.println();
		
		int maxWaterStored = 0;
		for(int i=0; i<maxLeft.length ; i++) {
			maxWaterStored += Math.min(maxLeft[i], maxRight[i]) - data[i];
		}
		System.out.println("Maximum water tappped is "+maxWaterStored);
		
	}

}
