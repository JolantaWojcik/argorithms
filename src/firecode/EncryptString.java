package firecode;

import java.util.Arrays;

public class EncryptString {
	public static void main(String[] args) {
		System.out.println(crypto("ala ma kota"));
	}
//	napisz metode kt�ra zaszyfruje podany napis w nast�puj�cy spos�b:
//		je�li source = "ala ma kota", to nale�y utworzy� tablice kwadratow� o 
//		takim rozmiarze aby napis si� w niej zmie�ci� (w tym przypadku 4x4)
//		[a,l,a, ]
//		[m,a, ,k]
//		[o,t,a,_]
//		[_,_,_,_]
//		(w przypadku gdy juz nie ma zankow wpisujemy "_")
//		nastepnie tak� tablic� czytamy kolumnami i mamy: amo_lat_a a_ k__ i taki powinien byc wyraz zaszyfrowany
	public static String crypto(String source){
		int max=0;
		String[] arr = source.split(" ");
		for(int i=0; i<arr.length; i++){
			for(int j=1; j<arr.length; j++){
				if(arr[i].length()>arr[j].length()){
					max = arr[i].length();
				}
			}
		}
		char[][] doubleArr = new char[max][max];
		for(int i=0; i<doubleArr.length; i++){
			for(int j=0; j<doubleArr[i].length; j++){
				int current = (i*doubleArr.length)+j;
				doubleArr[i][j] = current < source.length() ? source.charAt(current) : '_';
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<doubleArr.length; i++){
			for(int j=0; j<doubleArr[i].length; j++){
				sb.append(doubleArr[j][i]);
			}
		}
		return sb.toString();
	}
}
