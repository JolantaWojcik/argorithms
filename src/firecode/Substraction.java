package firecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Substraction {
//	public int[] subtraction(int[] t2, int[] t2) ktora jako wynik 
//	zwroci roznice elementow dla t1 i t2 np: Jesli t1 = [1,2,3] a t2=[2,3,4] to wynikiem bedzie result = [1,4]
	
	public static void main(String[] args) {
		int[]t1 = {1,2,3};
		int[]t2 = {2,3,4};
		int[] result = subtraction(t1, t2);
		System.out.print("[");
		for(int i=0; i<result.length; i++){
			System.out.print(" "+result[i]);					
		}
		System.out.print("]");	
	}
	
	public static int[] subtraction(int[] t1, int[] t2){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<t1.length; i++){
			list.add(t1[i]);
		}
		for(int j=0; j<t2.length; j++){
			list.add(t2[j]);
		}
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<list.size(); i++){
			if(map.get(list.get(i))==null){
				map.put(list.get(i), 1);
			}else{
				map.put(list.get(i), i+1);
			}
		}
		int[] result = new int[map.size()];
		int index = 0;
		for(Map.Entry<Integer, Integer> e: map.entrySet()){
			if(e.getValue()==1){
				result[index++]=e.getKey();
			}
		}
		return result;
	}
	
}
