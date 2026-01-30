package week3.day1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ele = {1, 4,3,2,8, 6, 7};
		
		Arrays.sort(ele);
		
		for (int i = 0; i < ele.length; i++) {
			
			int miss = ele[0]+i;
			if (ele[i] != miss) {
				System.out.println("The missing number is "+miss);
				break;
			}
		}

	}

}
