package javachallenges;

class LengthOfLastWordNew {
	
	public int lastWordLength(String s)  {
		int length = 0;
		
		 for (int i = s.length() - 1; i >= 0; i--) {
	            if (s.charAt(i) != ' ') {
	                length++;
	            } 
	            
	            else if(length > 0) {
	                break;
	            }
	            
	}
         return length;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LengthOfLastWordNew llw = new LengthOfLastWordNew();
		
		String s1 = "Hello World";
	    String s2 = "   fly me   to   the moon  ";
	    String s3 = "luffy is still joyboy";
	    
	    System.out.println("The length of last word in -"+s1+"- is "+ llw.lastWordLength(s1));
	    System.out.println("The length of last word in -"+s2+"- is "+llw.lastWordLength(s2));
		System.out.println("The length of last word in -"+s3+"- is "+llw.lastWordLength(s3));

	}

}