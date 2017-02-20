package firecode;

public class IsStringPalindrome {
	public static void main(String[] args) {
		String str = "madam";
		System.out.println(isStringPalindrome(str));
	}
	
	public static boolean isStringPalindrome(String str){
	    if(str==null || str.isEmpty() || str.length()==1)return true;
	    if(str.contains(" "))return false;
	    for(int i=0; i<str.length()/2; i++){
	        for(int j=str.length()/2; j<str.length(); j--){
	            if(str.charAt(i)==str.charAt(j)){
	                return true;
	            }
	        }
	    }
	    return false;
	}
//	public static boolean isPalindrome(String str) {
//		if (str == null) {
//			return false;
//		}
//		char[] chars = str.toCharArray();
//		for (int i = 0; i < str.length() / 2; i++) {
//			if (chars[i] != chars[str.length() - 1 - i]) {
//				return false;
//			}
//		}
//		return true;
//	}
}
