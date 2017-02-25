package firecode;

public class StringToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binary("kot"));
		System.out.println(Integer.toBinaryString(100));
	}

	public static String binary(String s){
		
		  byte[] bytes = s.getBytes();
		  StringBuilder binary = new StringBuilder();
		  for (byte b : bytes){
		     int val = b;
		     for (int i = 0; i < 8; i++){
		        binary.append((val & 128) == 0 ? 0 : 1);
		        val <<= 1;
		     }
		     binary.append(' ');
		  }
		  
		  return binary.toString();
	}
}
