package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class IntersectionInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring input in array
		int [] array1 = {3, 2, 11, 4, 6, 7};
		int [] array2 = {1, 2, 8, 4, 9, 7};
		
		//list class
		List<Integer> list = new ArrayList<Integer>();
		
		//for loop for input 1
		for (int i = 0; i < array1.length; i++) {
			list.add(array1[i]);
		}
		
		System.out.println("Intersection values");
		
		//for loop for input 2
		for (int i = 0; i < array2.length; i++) {
			int a = array2[i];
		
		//loop to compare 2 inputs
		for (int j = 0; j < list.size(); j++) {
			if (a == list.get(j)) // checks if contents are same
			{
				System.out.print(a);
			}
		}
		}

	}

}
