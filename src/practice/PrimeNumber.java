package practice;

public class PrimeNumber {

	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		
		for(int i=2; i<num; i++ ) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void check(int n) {
		for(int i=2; i<n; i++) {
			if(isPrime(i)) {
				System.out.print(i+ " ");
			}
		}
	}
	
	public static void main(String[] args) {
		check(55);
		System.out.println(isPrime(11));
	}
}
