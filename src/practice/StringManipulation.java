package practice;

public class StringManipulation {

	public static void main(String[] args) {

		String s = "Today is a great Monday";
		
		System.out.println(s.indexOf('a'));
		
		System.out.println(s.indexOf('a', s.indexOf('a')+1));
		
		System.out.println(s.indexOf('a',(s.indexOf('a',s.indexOf('a')+1)+1)));
		System.out.println(s.indexOf('a',(s.indexOf('a', s.indexOf('a',s.indexOf('a')+1)+1)+1)));
		
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='a') {
				System.out.println(i);
			}
		}
		
		System.out.println(s.substring(2,15));
		
		System.out.println(s.substring(5));
		
	}

}
