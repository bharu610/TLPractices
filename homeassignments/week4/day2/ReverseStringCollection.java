package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringCollection {

	public static void main(String[] args) {
		 String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

	        // Step 2: Add to List
	        List<String> list = new ArrayList<>();
	        for (int i = 0; i < companies.length; i++) {
	            list.add(companies[i]);
	        }

	        // Step 3: Sort ascending
	        Collections.sort(list);

	        // Step 4: Reverse loop iteration
	        System.out.println("Reversed Output:");

	        for (int i = list.size() - 1; i >= 0; i--) {
	            System.out.print(list.get(i));

	            if (i != 0) {
	                System.out.print(", ");
	            }
	        }
	}

}
