package code.array;

/**
 * 
 * @author aman
 * Rotating a matrix in clockwise direction 
 */
public class MCM {
	
	public static void main(String args[]) {
		
		int mat[][] = {
				{1, 2, 3, 4}, 
				{5, 6, 7, 8}, 
				{9, 10, 11, 12}, 
				{13, 14, 15, 16}
		};

		int rowLen = mat.length;
		int colLen = mat[0].length;
		
		int top = 0;
		int right = colLen-1;
		int left = 0;
		int bottom = rowLen-1;
		
		int prev, curr;
		
		while(left <= right && top <= bottom ) {
			
			if(top+1==rowLen || left+1 == colLen) {
				break;
			}
			
			prev = mat[top+1][left];
			
			for(int i=left; i<=right ; i++) {
				curr = mat[top][i];
				mat[top][i] =  prev;
				prev = curr;
			}
			top++;
			
			for(int i=top ; i<=bottom; i++) {
				curr = mat[i][right];
				mat[i][right] = prev;
				prev = curr;
			}
			right--;
			
			if(top <= bottom) {
				for(int i=right ; i>=left ; i--) {
					curr = mat[bottom][i];
					mat[bottom][i] = prev;
					prev = curr;
				}
				bottom--;
			}
			
			if(prev== 13) {
				System.out.println("");
			}
			
			if(left <= right) {
				for(int i=bottom ; i>=top ; i--) {
					curr = mat[i][left];
					mat[i][left] = prev;
					prev = curr;
				}
				left++;
			}
			
			
			
		}
		
		for(int i=0; i<rowLen ; i++) {
			for(int j=0; j<colLen ; j++) {
				System.out.print(mat[i][j]+"  ");
			}
			System.out.println();
		}
		
		
	}
	

}
