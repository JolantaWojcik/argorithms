package firecode;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ShortesWord {
	public static void main(String[] args) {
		System.out.println(shortest("abc", "cba"));
	}
	
	public static String shortest(String s1, String s2){
//		np: s1="aaa" s2 = "aa" , wynik = "aaa" poniewa¿ s2 zawiera siê w s2
//		np: s1="abc" s2 ="cba", wynnik = "abcba" poniewa¿ s2 zaczyna siê na koñcówkê s1 itp.
		Set<Character> set = new LinkedHashSet<>();
		StringBuilder sb = new StringBuilder();
		if(s1.contains(s2)) return s1;
		if(s2.contains(s1)) return s2;
		sb.append(s1.substring(0,s1.length()-1));
		if(s1.charAt(s1.length()-1)==s2.charAt(0)){
			sb.append((s1.charAt(s1.length()-1)));
		}else{
			sb.append(s1.charAt(s1.length()-1));
			sb.append(s2.charAt(0));
		}
		sb.append(s2.substring(1));		
		return sb.toString();
	}
}
//for(int i=s1.length()-1; i>=0; i--){
//for(int j=0; j<s2.length()-1; j++){
//	if(s1.charAt(i)==s2.charAt(j)){
////		System.out.println(s1.charAt(i));
////		System.out.println(s2.charAt(j));
//		sb.append(s1.charAt(i));
//		//return shortest(s1.substring(0, s1.length()-1), s2.substring(1));
//	}else{
////		sb.append(s1.charAt(i));
////		sb.append(s2.charAt(j));
//	}
//}
//}