package homeassignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); //method chaining 
		
		driver.close();
	}

}
