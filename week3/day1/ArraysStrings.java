package week3.day1;

import java.util.Arrays;

public class ArraysStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = {90, 87, 68, 100, 78};   // 0 to 4

		//To find the number of elements -length
		int arrayLength = scores.length;
		System.out.println("The number of elements is: " + arrayLength);

		//To retrieve an element from the Array
		System.out.println(scores[4]);
		
		System.out.println("--------------------");

		//To retrieve all the values

//		        0  1  2  3  4
		for (int i = 0; i < scores.length; i++) {
		    System.out.println(scores[i]);
		    //System.out.println(scores[0]);   //90
		    //System.out.println(scores[1]);   //87
		    //System.out.println(scores[2]);   //68
		    //System.out.println(scores[3]);   //100
		    //System.out.println(scores[4]);   //78
		}
		Arrays.sort(scores);
		// 0   1   2   3   4
		//{68,78,87,90,100}
		//Lowest
		System.out.println("The lowest value is: " + scores[0]);

		//Highest          //scores[4]
		System.out.println(scores[arrayLength - 1]);
		
	}

}
