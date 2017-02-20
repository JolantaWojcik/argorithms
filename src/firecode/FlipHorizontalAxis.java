//package firecode;
//
//public class FlipHorizontalAxis {
//	public static void main(String[] args) {
//		int[][] matrix = new int[][]{{1,0,1},{1,0,1}};
//		int[][] flipped= flipHorizontalAxis(matrix);
//	}
//	//c1 c2
////	  1 1 r1
////    0 0 r2
//	
////	1,2,3
////	4,5,6
////	7,8,9
////	{{7,8,9},{4,5,6},{1,2,3}}
//
//	 if(head==null){
//	 	head.next = tail;
//	    }
//	 String str = "njdjsa";
//	 String inputString = "kot";
//	    String outputString = null;
//	    
//	    for(int i= str.length()-1; i>=1; i--){
//	    	outputString += arr[i];
//	    }
//
//	    char[] arr = inputString.toCharArray();
//	    if(inputString==null) return null;
//	    if(inputString.length()==1) return str;
////	    for(int i= str.length()-1; i>0; i--){
////	    	outputString += arr[i];
////	    }
//	    
//	    for(int i= str.length()-1; i>=1; i--){
//	    	outputString += arr[i];
//	    }
//}
////	int rows = matrix.length and int columns = matrix[0].length. Once you have the row / column dimensions, 
////			write 2 for loops that traverse the entire matrix. 
////			In the inner for loop, use a temporary variable to make the swap.
//	public static void flipHorizontalAxis(int[][] matrix) {
//		int r = matrix.length;
//		int c = matrix[0].length;
//		for(int i = 0; i <= r/2; i++){
//			for(int j = 0; j <= c; j++){
//				int first = matrix[i][j];
//				matrix[i][j]= matrix[i-1][j-1];
//				matrix[i-1][j-1]=first;
//			}
//		}
//	}
//}
//
//}
