package exercises;

import java.util.Scanner;

public class ArrReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		int[] numbers= {1,2,3,4,5,6,7,8,9,10};
        boolean found = false;
        
        for(int i =0; i <10; i++) {
            
            if(numbers[i] == 6) {
                found = true;
                break;
            }
        }
        
        if(found == true) {
            System.out.println("The array contains the value 6" );
        }else {
            System.out.println("The array does not contain the value 6" );
	}
        
        /* Write a program to find the index of an array element.
        * Write a program to reverse an array of integer values
       * Write a program to find the maximum and minimum value of an array.
      */
        int[] num = {55,7,8,31,22};
        
        for(int i=0; i<num.length; i++) {
        	
        	System.out.println("The index of an array element "+num[i]+" equals to "+i);
        }
        
        int max=num[0];
        int min=num[0];
        for(int i=0; i<num.length; i++) {
        	if(num[i]>max) {
        		max=num[i];
        			
        	}else if(num[i]<min) {
        		min=num[i];
        	        	System.out.println("Max is "+max);
        	        	System.out.println("Min is "+min);
        	}     
        }
	}
}
