package firecode;

import java.util.Arrays;

public class FlipVerticalAxis {
	public static void main(String[] args) {
		 // String[][] salutation = { 
		//{"Mr. ", "Mrs. ", "Ms. "}, 
		//{"Kumar"} }; 
	    // Mr. Kumar 
	    // System.out.println(salutation[0][0] + salutation[1][0]); 
	    // Mrs. Kumar 
	    // System.out.println(salutation[0][1] + salutation[1][0]);
//		   1 0
//         1 0 
		
		//0 1 
		//0 1
		int[][] matrix = {
				{0,1,0},
				{0,1,2}};
//		int[][] matrix = {
//				{0,1},
//				{0,1}};
		int x = matrix.length;
		int y = matrix[0].length;
		for(int i=0; i<x; i++){
			for(int j=0; j<y/2; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][y-1-j];
				matrix[i][y-1-j] = temp;
			}
		}
		System.out.println(Arrays.deepToString(matrix));
		
	}
	
	
	class String {
		char[] data;
		String nextString;
		
		public String(char[] value, String next) {
			this.data = value;
			this.nextString = next;
		}
	}
}
