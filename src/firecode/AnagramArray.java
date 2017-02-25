package firecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramArray {

	public static void main(String[] args) {
		String[] result = annagrams("ala", new String[]{"ala", "aal", "kot"});
		for(int i=0; i<result.length; i++){
			System.out.println(result[i]);
		}
	}
	
	//zwróci wszystkie anagramy s³owa pattern z tablicy words.
	public static String[] annagrams(String pattern, String... words){
		List<String>  anagramList = new ArrayList<String>();
//		List<String> wordList = Arrays.asList(words);
//		List<String>  anagramList = wordList.stream().filter(w->isAnagram(pattern, w)).collect(Collectors.toList());
		for(int i=0; i<words.length; i++){
			if(isAnagram(pattern, words[i])){
				anagramList.add(words[i]);
			}
		}
		return anagramList.toArray(new String[0]);
	}
	
	public static boolean isAnagram(String s1, String s2) {
		if(s1==null || s2==null){
			throw new IllegalArgumentException("Can't be null");
		}
		return sortChars(s1).equals(sortChars(s2));
	}

	private static String sortChars(String str) {
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
}
