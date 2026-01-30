package week3.day2;


class TestData { //Base Class
	
	public void enterCredentials() {
		System.out.println("Enter Creds");
	}
	
	public void navigateToHome() {
		System.out.println("Navigate to Home Page");
	}
	
}

class LoginTestData extends TestData{ //Sub Class
	
	public void enterUserName() {
		System.out.println("Enter UserName :");
	}
	
	public void enterPassWord() {
		System.out.println("Enter Password :");
	}
}

public class Inheritance { //Main Class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestData test = new TestData(); //instance for super class
		test.enterCredentials();
		test.navigateToHome(); 
		
		LoginTestData log = new LoginTestData(); //instance for sub class
		log.enterCredentials();
		log.enterUserName();
		log.enterPassWord();
		log.navigateToHome();

	}

}



