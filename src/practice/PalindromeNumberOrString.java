package practice;

public class PalindromeNumberOrString {

	
	public static void isPalindrome(int num) {
		int remainder;
		int sum=0;
		int originalValue;
		originalValue=num;
		
		System.out.println(num);
		
		while(num>0) {
			remainder = num%10;
			sum = (sum*10)+remainder;
			num=num/10;
		}
		
		if(originalValue==sum) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
	
	
	public static void isPalindString(String str) {
		
		System.out.println(str);
		String reverse="";
		for(int i=str.length()-1; i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
		if(str.equals(reverse)) {
			System.out.println("the word is palindrome");
		}else { 
			System.out.println("the word is not palindrome");
		}
	}
	
	
	
	public static void main(String[] args) {
		isPalindrome(225);
		isPalindrome(887788);
		isPalindString("level");
		isPalindString("grade");
	}
}
