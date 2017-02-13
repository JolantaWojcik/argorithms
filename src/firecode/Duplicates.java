package firecode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicates {
	public static void main(String[] args) {

	}
	public static String duplicate(int[] numbers){
		Set<Integer> set = new HashSet<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<numbers.length; i++){
			if(map.get(numbers[i])==null){
				map.put(numbers[i], 1);
			}else{
				map.put(numbers[i], i+1);
			}
		}
		for(Map.Entry<Integer, Integer> e: map.entrySet()){
			if(e.getValue()>1){
				set.add(e.getKey());
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(set);

		return sb.toString();
	}
}
