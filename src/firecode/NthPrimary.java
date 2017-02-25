package firecode;

import java.util.ArrayList;
import java.util.List;

public class NthPrimary {
	static int[] arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arr = primaries(new int[]{1,2,3,4,5});
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		System.out.println("###");
		System.out.println(2);
	}
	//która zwróci Nt¹ co do kolejnoœci liczbê pierwsz¹.
	public static int primary(int n){
		int[] array = primaries(arr);
		for(int i=0; i<array.length; i++){
			return array[n];
		}
		return -1;
	}
	
	public static int[] primaries(int[] numbers){
		List<Integer> primaries = new ArrayList<>();
		for(Integer i : numbers){
			if(isPrimary(i)==true){
				primaries.add(i);
			}
		}
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
