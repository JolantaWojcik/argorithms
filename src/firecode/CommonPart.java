package firecode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CommonPart {
//	public int[] common(int[] t1, int[] t2) ktora jako wynik zwroci 
//	tablice liczb wspolnych dla t1 i t2. Jesli np: 
//		t1 = [1,2,3] a t2=[2,3,4] to wynikiem bedzie result = [2,3]
//			 
	public static void main(String[] args) {
		int[]t1 = {1,2,3};
		int[]t2 = {2,3,4};
		
		int[] result = common(t1, t2);
		System.out.print("[");
		for(int i=0; i<result.length; i++){
			System.out.print(" "+result[i]);					
		}
		System.out.print("]");	
	}
	
	public static int[] common(int[] t1, int[] t2){
		Set<Integer> set = new TreeSet<Integer>();
		for(int i=0; i<t1.length; i++){
			for(int j=0; j<t2.length; j++){
				if(t1[i]==t2[j]){
					set.add(t1[i]);
				}
			}
		}
		int[] result = new int[set.size()];
		int index = 0;
		for(Integer s : set){
			result[index++] = s;
		}
		return result;
	}
}
