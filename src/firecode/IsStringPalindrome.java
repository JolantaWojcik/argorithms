package firecode;

public class IsStringPalindrome {
	public static void main(String[] args) {
		String str = "madam";
//		 if(str==null)return true;
//		    if(str.contains(" "))return false;
		 System.out.println(str.length()-1);
		 System.out.println(str.length()/2);
		    for(int i=0; i<str.length()/2; i++){
		        for(int j=str.length()/2; j<str.length(); --j){
		            if(str.charAt(i)==str.charAt(j)){
		                System.out.println(str.charAt(i));
		                System.out.println(str.charAt(j));
		            }
		        }
		    }
	}
}
