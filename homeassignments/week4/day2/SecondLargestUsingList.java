package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		       //Declare input
		        int[] arr = {3, 2, 11, 4, 6, 7};

		        //Add elements to List
		        List<Integer> list = new ArrayList<>();
		        for (int i = 0; i < arr.length; i++) {
		            list.add(arr[i]);
		        }

		      //Sort in ascending order
		        Collections.sort(list);

		       // 2nd element from the last
		        int secondLargest = list.get(list.size() - 2);

		        
		        System.out.println("Second Largest Number: " + secondLargest);
	}

}
