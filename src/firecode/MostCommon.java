package firecode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommon {
	public static void main(String[] args) {
		System.out.println(mostCommon(new int[]{1,2,2,3,3}));
	}
	public static int mostCommon(int ... elements){
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<elements.length; i++){
			if(map.get(elements[i])==null){
				map.put(elements[i], 1);
			}else{
				map.put(elements[i], map.get(elements[i])+1);
			}
		}
		System.out.println(map.toString());
		return Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
	}
}
