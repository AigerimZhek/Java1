package practice;

public class TwoDArray {

	public static void main(String[] args) {
		//find if array contains specific value
		int arr [] = new int[] {3,5,6,8,12,5,9,14,83,0,11};

		int k=5;
		boolean flag = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==k) {
				System.out.println("Given element is located at index # "+i);
				flag=true;
				break;
			}
		}
		System.out.println(flag);
		
		//insert an element to the specific position of array(56 at index 3, between 6 and 8)
		int s = 56;
		int index = 3;
		
		for(int i=arr.length-1; i>index; i--) {
			arr[i]=arr[i-1];
			
		}	arr[index]=s;
		for(int o:arr) {
			System.out.println(o);
		
		}
		
	}
}
