package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "stops", text2 = "potss"; // Define strings

		// Check length of string
		if (text1.length() == text2.length()) {
			System.out.println("The length of the characters are same ");
			
			// Convert to char array
			char[] ca1 = text1.toCharArray();
			char[] ca2 = text2.toCharArray();

			// Array sort
			Arrays.sort(ca1);
			Arrays.sort(ca2);

			// Check sorted arrays are equal

			if (Arrays.equals(ca1, ca2)) {
				System.out.println("The given strings are Anagram");

			} else {
				System.out.println("The given strings are not Anagram");
			}

		} else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}

//		// Convert to char array
//		char[] ca1 = text1.toCharArray();
//		char[] ca2 = text2.toCharArray();
//
//		// Array sort
//		Arrays.sort(ca1);
//		Arrays.sort(ca2);
//
//		// Check sorted arrays are equal
//
//		if (Arrays.equals(ca1, ca2)) {
//			System.out.println("The given strings are Anagram");
//
//		} else {
//			System.out.println("The given strings are not Anagram");
//		}

	}

}
