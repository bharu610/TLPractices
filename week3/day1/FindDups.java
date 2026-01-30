package week3.day1;

import java.util.Arrays;

class FindDups {

	public static void main(String[] args) {
		int[] num = { 2, 5, 7, 7, 5, 9, 2, 3 };
		System.out.println("Duplicate values are:");

		Arrays.sort(num); // Sort the array

//		for (int i = 0; i < num.length - 1; i++) {
//			// Compare the value
//			if (num[i] == num[i + 1]) {
//				System.out.print(num[i]);
//			}
//		}
//		
		
		for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.println(num[i]);
                    break; 
	}
}
            
		}
	}
	
}