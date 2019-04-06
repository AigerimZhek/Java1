package com.class17;

import com.class17_2.ScannerMethod;

public class App {

	public static void main(String[] args) {
		

		ScannerMethod scn = new ScannerMethod();// can access a different class in the same package
		System.out.println(scn.sum(5, 8));
		
		App apl = new App();
		System.out.println(apl.example6('a'));

	}
	void example() {

        System.out.println("No return value and NO Parameters");
    }

    void example2(String name) {

        System.out.println("No return value but with Parameter : " + name);
    }

    boolean example3() {

        System.out.println("With return value and NO Parameters");
        return true;
    }

    String example4(String name) {

        System.out.println("No return value but with Parameter : " + name);
        
        return name;
    }
    
    
    boolean example5(String name) {

        System.out.println("No return value but with Parameter : " + name);
        
        return false;
    }
    
    
    long example6(char name) {

        System.out.println("No return value but with Parameter : " + name);
        
        return name;
    }

}
