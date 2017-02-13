package firecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Substraction {
//	public int[] subtraction(int[] t2, int[] t2) ktora jako wynik 
//	zwroci roznice elementow dla t1 i t2 np: Jesli t1 = [1,2,3] a t2=[2,3,4] to wynikiem bedzie result = [1,4]
	
	public static void main(String[] args) {
		int[]t1 = {1,2,3};
		int[]t2 = {2,3,4};
		System.out.println(subtraction(t1, t2));
	}
	
	public static int[] subtraction(int[] t1, int[] t2){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<t1.length; i++){
			list.add(t1[i]);
		}
		for(int j=0; j<t2.length; j++){
			list.add(t2[j]);
		}
		System.out.println(list);
		int index = 0;
		int[] result = new int[2];
		for(Integer s : list){
			if(list.contains(s)){
				result[index++] = s;
			}
		}
		return result;
	}
	
}
