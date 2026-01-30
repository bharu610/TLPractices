package week3.day1;

public class InterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3, 2, 11, 4, 6, 7};
        int[] b = {1, 2, 8, 4, 9, 7};

        System.out.print("The common numbers are: ");
        // Nested for loop 
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                // Compare elements
                if (a[i]==b[j]) {
                    System.out.print(" "+a[i]); 

	}

}

        }
	}
	
}