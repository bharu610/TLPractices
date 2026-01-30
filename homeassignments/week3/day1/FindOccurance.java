package week3.day1;

public class FindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "TestLeaf";
        int count = 0;

        // Convert String to character array
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'e') { // compare char
                count++;
            }
        }
        System.out.println("Count of 'e' in " + input +" is: " + count);
    
	}

}
