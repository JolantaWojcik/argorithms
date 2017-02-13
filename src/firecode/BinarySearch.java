package firecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinarySearch {
	public static void main(String[] args) {
		  int[] testArray1 = {1, 2, 3, 4, 5};
		System.out.println(binarySearch(testArray1, 4));
	}
	
	public static Character firstNonRepeatedCharacter(String str) {
	    Map<Character,Integer> map = new HashMap<Character, Integer>();
			char[] arr = str.toCharArray();
			for(int i=0; i<str.length(); i++){
			    if(map.get(arr[i])==null){
			        map.put(arr[i], 1);        
			    }else{
			          map.put(arr[i], i+1);        
			    }
			}
			
			for(Map.Entry<Character, Integer> e : map.entrySet()){
				if(e.getValue()==1){
					return e.getKey();
				}
			}
			return null;
	}
	
	public static Boolean binarySearch(int[] arr, int n){
		 // Think about maintaining the boundaries of your array with a lo
        // index and a hi index. lo=0; hi=length - 1;
        int lo = 0;
        int hi = arr.length - 1;
        // Use a while loop to iterate until lo <= hi. The moment that lo exceeds
        // hi, we can be sure that the entire array has been searched. 
        while(lo <= hi){
            // Create a mid index. int mid = lo + (hi-lo)/2;
            int mid = lo + (hi-lo)/2;
            // If arr[mid] < n, set lo = mid+1 to divide the array
            if(arr[mid] < n) lo = mid+1;
            // Else If arr[mid] > n, set hi = mid - 1 to divide the array
            else if(arr[mid] > n) hi = mid-1;
            // Otherwise, return true!
            else return true;
        }
        return false;
	}
}
