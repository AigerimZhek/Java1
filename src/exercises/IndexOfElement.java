package exercises;

public class IndexOfElement {

	public static void main(String[] args) {
		// Write a Java program to find the index of an array element
		
		/*int[] a = {12, 15, 11, 13, 9, 25};
		int[] a2 = {12, 15, 11, 13, 9, 25};
		int sum = 0;
		for (int i = 0; i <a.length; i++) 
		{
		if (a[i] % 2== a2[i ] % 5) 
		{
		sum += i * i;
		}
		}
		System.out.println("sum = " + sum);  //4  */
		
		
		
		if (true) {
			int[] str = {5};
			String i = "" + str[0];
			System.out.print(i);
			}
			System.out.print("-");
			{
			int[] str = {1, 2};
			System.out.print(str[1]);
			}
			System.out.print("-");
			{
			String str = "I like Java Programming Language";
			System.out.print(str);
			}
			System.out.print("-");
			{
			int str = 124;
			System.out.print(str);
			}
			
			int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
			int n = 6;
			n = arr[arr[n] / 2];
			System.out.println(arr[n] / 2);
			
			char array_variable [] = new char[10];
			for (int i = 0; i < 10; ++i) 
			{
			array_variable[i] = 'i';
			System.out.print(array_variable[i] + " ");
			}
			
			int array__variable[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};
			int sum = 0;
			for (int i = 0; i < 3; ++i)
			for (int j = 0; j < 3 ; ++j)
			sum = sum + array__variable[i][j];
			System.out.print(sum / 5);
			
			int[] array = { 1, 4, 3, 6, 8, 2, 5};
			int what = array[0];

			// scan the array
			for ( int index=0; index < array.length; index++ )
			{ 
			if ( array[ index ] > what ) 
			what = array[ index ]; 
			}
			System.out.println( what ); 
			
			
	}

}
