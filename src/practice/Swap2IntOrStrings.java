package practice;

public class Swap2IntOrStrings {

	public static void main(String[] args) {
		
		int a=4;
		int b=7;
		
		
		a=a+b;//11
		b=a-b;//4
		a=a-b;//7
		System.out.println(a);
		System.out.println(b);
		
		
		String s1="Do";
		String s2="Not";
		
		s1=s1+s2;//DoNot
		System.out.println(s1);
		
		s2=s1.substring(0,s1.length()-s2.length());//5-3=2
		
		s1 = s1.substring(s2.length());//2
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
