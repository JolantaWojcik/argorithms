package firecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimariesArray {
	public static void main(String[] args) {
		int[] arr = primaries(new int[]{1,2,3,4,5});
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	
	public static int[] primaries(int[] numbers){
		List<Integer> primaries = new ArrayList<>();
		for(Integer i : numbers){
			if(isPrimary(i)==true){
				primaries.add(i);
			}
		}
		System.out.println(primaries);
		return primaries.stream().mapToInt(i->i).toArray();
	}
	
	public static boolean isPrimary(int number) {
		if (number < 2)
			return false;
		for (int d = 2; d <= number/2; d++) {
			if (number % d == 0) {
				return false;
			}
		}
		return true;
	}
}
