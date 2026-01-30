package javachallenges;

public class LengthOfLastWord {
	
	public void String1() {
		String s1 = "Hello World";
		int length = 0;
		
		 for (int i = s1.length() - 1; i >= 0; i--) {
	            if (s1.charAt(i) != ' ') {
	                length++;
	            } else if (length > 0) {
	                break;
	            }
	}
 System.out.println("The length of last word in -"+s1+"- is "+length);
	}
	
	public void String2() {
		String s2="   fly me   to   the moon  ";
		int length = 0;
		
		 for (int i = s2.length() - 1; i >= 0; i--) {
	            if (s2.charAt(i) != ' ') {
	                length++;
	            } else if (length > 0) {
	                break;
	            }
	}
 System.out.println("The length of last word in -"+s2+"- is "+length);
	
	}
	
	public void String3() {
		String  s3= "luffy is still joyboy";
		int length = 0;
		
		 for (int i = s3.length() - 1; i >= 0; i--) {
	            if (s3.charAt(i) != ' ') {
	                length++;
	            } else if (length > 0) {
	                break;
	            }
	}
 System.out.println("The length of last word in -"+s3+"- is "+length);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LengthOfLastWord str1  = new LengthOfLastWord();
		str1.String1();
		
		LengthOfLastWord str2  = new LengthOfLastWord();
		str2.String2();
		
		LengthOfLastWord str3  = new LengthOfLastWord();
		str3.String3();

}
	
}