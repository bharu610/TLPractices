package week3.day1;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "changeme"; //input 
        char[] chr = str.toCharArray(); //convert string to char

        for (int i = chr.length - 1; i >= 0; i--) { //to iterate reversely 
            if (i % 2 != 0) { //odd index
                chr[i] = Character.toUpperCase(chr[i]); // convert to uppercase
            }
        }
        String s = new String(chr); // instantiating string
        System.out.println("The converted string is :"+s);
	}

}
