package firecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
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
		//stworzyc setAll ktory zawiera elementy z t1 i t2
		//stworzyc setWspolnychElementow ktore sa w t1 i t2
		//z setAll usunac wszystko setWspolnychElementow
		Set<Integer> setAllItems = new TreeSet<Integer>();
		Set<Integer> setCommonItems = new HashSet<Integer>();
		for(int i=0; i<t1.length; i++){
			for(int j=0; j<t2.length; j++){
				setAllItems.add(t1[i]);
				setAllItems.add(t2[j]);
				if(t1[i]==t2[j]){
					setCommonItems.add(t1[i]);
				}
			}
		}
		for(int i=0; i<=setAllItems.size(); i++){
			if(setCommonItems.contains(i)){
				setAllItems.remove(i);
			}
		}
		int[] result = new int[setAllItems.size()];
		int index = 0;
		for(Integer s : setAllItems){
			result[index++] = s;
		}
		return result;
	}
	
}
