package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumbersList {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 10, 6, 8};

        //Add to List
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        //Sort ascending
        Collections.sort(list);

        // Check for  missing numbers
        System.out.println("Missing numbers:");

        for (int i = 0; i < list.size() - 1; i++) {
            int current = list.get(i);
            int next = list.get(i + 1);

            if (current + 1 != next) {
                for (int missing = current + 1; missing < next; missing++) {
                    System.out.println(missing);
                }
            }
        }
	}

}
