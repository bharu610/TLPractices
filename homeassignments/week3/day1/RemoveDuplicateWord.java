package week3.day1;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String str = "We learn Java basics as part of java sessions in jaVa week1";
        int count = 0;

        // Split the string into words
        String[] word = str.split(" ");

        // Nested for loops 
        for (int i = 0; i < word.length; i++) {

            for (int j = i + 1; j < word.length; j++) {

                // Case-insensitive 
                if (word[i].equalsIgnoreCase(word[j])) {

                    // Replace duplicate with empty string
                    word[j] = "    ";
                    count++;
                }
            }
        }

        // if duplicate print
        if (count > 0) {
            for (int i = 0; i < word.length; i++) {
                if (!word[i].equals("")) {
                    System.out.print(word[i] + " ");
                }
            }
        }

	}

}
