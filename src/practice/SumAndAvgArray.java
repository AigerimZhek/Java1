package practice;

public class SumAndAvgArray {

	public static void main(String[] args) {
		int[] arr= {3,4,5,6,8,12,5,9};
		int sum=0;
		for(int i=0; i<arr.length; i++) {
		    
		    sum+=arr[i];
		}
		
		double avg = (double) sum/arr.length;
		System.out.println("sum is "+sum+" average is "+avg);
		
		
		
		for(int x=0; x<5; x++) {
			for(int y=x; y>=0; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
		    }
		}
