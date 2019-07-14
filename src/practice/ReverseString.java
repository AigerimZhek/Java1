package practice;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Hello World";
		String reverse="";
		
		for(int i=str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
		
		
		String s="Today is Sunday";
		String r="";
		
		String[] arr=s.split(" ");
		
		for(int i=arr.length-1; i>=0; i--) {
			r=r+arr[i]+" ";
		}
		System.out.println(r);
	}

}
