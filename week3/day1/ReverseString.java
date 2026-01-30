package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "TestLeaf";
		char[] str1 = str.toCharArray(); //To convert string to char
		
		System.out.print("The reversed string of "+str+ " is: ");
		for (int i = str1.length-1; i>=0; i--) {
			System.out.print(str1[i]);
		}
			

}
	
}
