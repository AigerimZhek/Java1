package practice;

import java.util.Arrays;

public class PairSum {

	/*In Array, Find all Pairs of Integers whose sum is equal to a given number For
	 * example if input integer array is {2, 6, 3, 9, 11} and given sum is 9, output
	 * should be {6,3}.
	 */
	public static void main(String[] args) {
		int arr[] = new int[] { 3, 5, 6, 8, 12, 5, 9, 14, 83, 0, 11 };
		int n = 17;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==n) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int sum = arr[left]+arr[right];
			if(sum==n) {
				System.out.println(arr[left]+" "+" "+ arr[right]);
				right--;
				left++;
			}else if(sum<n) {
				left++;
			}else{
				right--;
			}
		}
		
		

	}

}
