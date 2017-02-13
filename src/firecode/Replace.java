package firecode;

import java.util.ArrayList;
import java.util.List;

public class Replace {
	public static void main(String[] args) {
		String a = "test test";
		String b = null;
		char[] arr = a.toCharArray();
		
		 StringBuilder builder = new StringBuilder();
		   for(int i=0; i<a.length(); i++){
			      if(a.charAt(i)==' '){
			    	  builder.append(b);
			      }else{
			    	 builder.append(a.charAt(i));
			      }
			    }
		System.out.println(b);
	}
	
	public static String replace(String a, String b) {
		List<Character> newString = new ArrayList<Character>();
		char[] orignal = a.toCharArray();
		char[] replace = b.toCharArray();
		// Iterate on orignal string 
		for (int i = 0; i < orignal.length; i++) {
			// If space found then insert the replacing string.
			if (orignal[i] == ' ') {
				for (int k = 0; k < replace.length; k++) {
					newString.add(replace[k]);
				}
			} else     // Add the character from orignal string
				newString.add(orignal[i]);      
		}
		StringBuilder builder = new StringBuilder(newString.size());
		for(Character ch: newString) {
			builder.append(ch);
		}
		return builder.toString();
	}
}
