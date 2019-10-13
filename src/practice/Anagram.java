package practice;

import java.util.Arrays;

public class Anagram {
	
	public static void isAnagram(String str1, String str2) {
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        String newStr = null;
        String newStr2 = null;
        
                newStr = new String(char1);
                newStr2 = new String(char2);
        
        if (newStr.equalsIgnoreCase(newStr2)) {
            System.out.println(str1 + " and " + str2 + " are anagram");
        } else {
            System.out.println(str1 + " and " + str2 +  " are not anagram");
        }
    }
    public static void main(String[] args) {
        
        isAnagram("listen", "silent");
        
    }

}
