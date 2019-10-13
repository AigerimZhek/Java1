package practice;

import java.util.ArrayList;
import java.util.List;

public class ConsecutiveNumbers {

	public static void main(String[] args) {

		//way 1
		int[] a = { 8, 1, 3, 6, 1, 2, 3, 4, 9, 1, 3, 4, 5, 6, 7 };
//      int[] a = { 1, 2, 3, 4, 5, 8, 10, 2, 4, 5, 6, 7, 8, 9, 10, 3, 9, 10, 11, 12 };
        int longestIndex = 0;
        int longestLength = 1;
        int currentIndex = 0;
        int currentLength = 1;
        int previous = a[0];
        for (int i = 1; i < a.length; i++) {
            if ((a[i] - previous) == 1) {
                currentLength++;
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    longestIndex = currentIndex;
                }
            } else {
                currentLength = 1;
                currentIndex = i;
            }
            previous = a[i];
        }
        for (int i = longestIndex; i < longestIndex + longestLength; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
        
        //way 2
//      int[] a = { 8, 1, 3, 6, 1, 2, 3, 4, 9, 1, 3, 4, 5, 6, 7 };
        int[] b = { 1, 2, 3, 4, 5, 8, 10, 2, 4, 5, 6, 7, 8, 9, 10, 3, 9, 10, 11, 12 };
        List<Integer> currentList = new ArrayList<>();
        currentList.add(b[0]);
        List<Integer> longestList = new ArrayList<>(currentList);
        for (int i = 1; i < b.length; i++) {
            if ((b[i] - currentList.get(currentList.size() - 1)) == 1) {
                currentList.add(b[i]);
                if (currentList.size() > longestList.size()) {
                    longestList = new ArrayList<>(currentList);
                }
            } else {
                currentList = new ArrayList<>();
                currentList.add(b[i]);
            }
        }
        System.out.println(longestList);
        
        
        
        
	}

}
