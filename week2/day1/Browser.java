package week2.day1;

public class Browser {

	  public String launchBrowser(String browserName) {
	        System.out.println("Browser Name: " + browserName);
			return browserName;
	    }

	   
	    public String loadUrl() {
	    	
	    	String s = "Url loaded successfully";
	        return s;
	    }

	
	    public static void main(String[] args) {

	        Browser browser = new Browser();
	        browser.launchBrowser("Chrome");
	        String output = browser.loadUrl();
	        System.out.println(output);
	    }
	}
