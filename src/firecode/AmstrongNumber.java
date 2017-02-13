package firecode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AmstrongNumber {
	public static void main(String[] args) {
		int[] numbers = new int[]{1,5,23,2,6,3,1,8,12,3};
		  Set<Integer> set = new HashSet<Integer>();
		    Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		    for(int i=0; i<numbers.length; i++){
		    if(map.get(numbers[i])==null){
		        map.put(numbers[i], 1);
		    }else{
		         map.put(numbers[i], i+1);
		    }
		    }
//		    for(int j=0; j<map.size(); j++){
//		    	if(map.get(numbers[j])>1){
//		    		set.add();
//		    	}
//		    }
		    for(Map.Entry<Integer, Integer> e: map.entrySet()){
				if(e.getValue()>1){
					 set.add(e.getKey());
				}
			}
		    StringBuilder sb = new StringBuilder();
		    sb.append(set);
			System.out.print(sb.toString());
		Arrays.asList(set);  
		System.out.print(map);
		System.out.println(Arrays.asList(set));
//		for(Integer i: set){
//			sb.append(i.toString());
//			//System.out.print(i);
//		}
//		for(int z=0; z<set.size(); z++){
//			 set.forEach(i -> arr[z]+=i);
//			}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(checkIfAmstronNr(153));
//		String str[] = "Ala ma kota".split(" ");
		
//		for(int i=str.length-1; i>=0; i--){
//			sb.append(str[i]);
//			sb.append(" ");
//		}
	//	System.out.println(sb.toString());
	}
	
	public static boolean checkIfAmstronNr(int input){
		//153 = 1*1*1 + 5*5*5 + 3*3*3
		int length = String.valueOf(input).length();
		int[] arr = new int[length];
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		int sum =0;
		for(int i=0; i<length; i++){
			String subString = String.valueOf(sb.charAt(i));
			arr[i] += Integer.valueOf(subString);
		}
		for(int i=0; i<length; i++){
			sum = sum + (int) Math.pow(arr[i], length);
			if(sum==input){
				return true;
			}
		}
		return false;
	}
}
