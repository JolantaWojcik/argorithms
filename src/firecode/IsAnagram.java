package firecode;

import java.util.Arrays;

public class IsAnagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("kot", "robot"));
	}
	public static boolean isAnagram(String s1, String s2) {
		if(s1==null || s2==null){
			throw new IllegalArgumentException("Cant be null");
		}
		return sortChars(s1).equals(sortChars(s2));
	}

	private static String sortChars(String str) {
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
}
