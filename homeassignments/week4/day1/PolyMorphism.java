package week4.day1;

public class PolyMorphism {
	
	public void reportStep(String msg, String status) {
        System.out.println(msg);
        System.out.println(status);
       
    }
	
	 public void reportStep(String msg, String status, boolean snap) {
	        System.out.println( msg);
	        System.out.println(status);
	        System.out.println(snap);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolyMorphism p = new PolyMorphism();

		p.reportStep("Login successful", "Success");
        p.reportStep("Profile  loaded", "Success", true);

    }
		
	}



