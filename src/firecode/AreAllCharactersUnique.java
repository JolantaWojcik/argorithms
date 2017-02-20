package firecode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AreAllCharactersUnique {
	public static void main(String[] args) {
	System.out.println(areAllCharactersUnique("al"));
//	System.out.println(areAllCharactersUnique(""));
//	System.out.println(areAllCharactersUnique(null));
	System.out.println(areAllCharactersUnique("ala ma kota"));
	//true
	System.out.println(areAllCharactersUnique("123!@"));

	}
	public static boolean areAllCharactersUnique(String str){
		if(str==null || str.equals(""))return true;
	    char[] arr = str.toCharArray();

	    Set<Character> set = new HashSet<>();
	    for(int i=0; i <str.length()-1; i++){
	    	if(set.add(str.charAt(i))==false){
	    		return false;
	    	}
	    }
		return true;
	}	

	public static boolean areAllCharactersUniqueFireCode(String str){
		// If there's just one char in the String, return true
		if(str == null || str.length() <= 1) return true;
		// 2^8 = 256. Covers all characters in ASCII. Make Checker array
		boolean[] checker_array = new boolean[256];
		// Loop across all characters in String. 
		for(int i=0;i<str.length();i++){
			// Check the position specified by the character's 8 bit value.
			// Since this is cast as an int, it will be a numerical value!
			int position = str.charAt(i);
			// If the position already had a true value, this is a duplicate
			if(checker_array[position]) return false;
			checker_array[position] = true;
		}
		// Return true if no duplicates
		return true;
	}
}