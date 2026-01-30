package week3.day1;

public class ReverseOddWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I am a Software Tester"; //Input string
		System.out.println("The input String : "+'\n'+s+'\n');
		
		System.out.println("Output of reversing Odd positioned words are: ");
		
		String[] ar = s.split(" "); //Split array
		
		for (int i = 0; i < ar.length; i++) { 
			if(i%2 !=0) { //to find odd position
				char[] ca = ar[i].toCharArray(); //convert to char
				
				for (int j = ca.length -1; j >=0; j--) { //reverse char
					System.out.print(ca[j]);
				}
			}
				else {
					System.out.print(ar[i]); //print even words
				}
			System.out.print(" ");
		}

	}

}
