package homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookSel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); //method chaining
		
		//Enter login creds
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//Click on Login button
		driver.findElement(By.name("login")).click();
		
		//Print title of the webpage
		String title = driver.getTitle();
		System.out.println(title);
		
		//close browser
		driver.quit();
	}

}
