package firecode;

public class MiddleSumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(middleSumIndex(new int[]{2,3,1,3,2}));
	}
//	zwraca index osiowy w array, lub -1 gdy element nie wystêpuje.
//	index osiowy to taki w którym suma na lewo od tego elementu jest równa sumie na prawo od tego elementu
	public static int middleSumIndex(int[] array){
		int index = 1;
		while(index!=array.length){
			int sumLeft = 0;
			int sumRight = 0;
			for(int i=0; i < index; i++){
				sumRight += array[i];
			}
			for(int j=index+1; j < array.length; j++){
				sumLeft += array[j];
			}
			if(sumRight==sumLeft){
				return sumRight;
			}else{
				index++;
			}
		}
		return -1;
	}
}
