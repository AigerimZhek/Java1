package practice;

public class FactorialNumber {
	
	public static int factorial(int num) {
		int f=1;
		if(num==0) {
			return 1;
		}
		for(int i=1; i<=num; i++) {
			f=f*i;
		}
		return f;
	}
	
	
	public static int factor(int num) {
		if(num==0) {
			return 1;
		}else {
			return num*(factor(num-1));
		}
	}

	public static void main(String[] args) {
		

		System.out.println(factorial(10));
		System.out.println(factor(5));
	}

}
