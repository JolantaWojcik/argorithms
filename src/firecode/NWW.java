package firecode;

public class NWW {
	public static void main(String[] args) {
		System.out.println(nwd(28,24));
		System.out.println(nww(24,36));
		System.out.println(nww(1,2,3,4,5,67));
		System.out.println(nww(6,10, 12,90,76));
	}
	
	static int nww(int ... liczby){
		System.out.println(liczby.length+" "+liczby[0]);
		return 0;
	}
	static int nww(int a, int b){
		//(a / NWD(a,b)) * b
		return (a/nwd(a,b)) * b;
	}
	
	static int nwd(int a, int b){
		int result;
		while(b!=0){
			result = b;
			b= a%b;
			a = result;
		}
		return a;
	}
}
