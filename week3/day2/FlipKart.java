package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/"); //Launch URL
		
		driver.manage().window().maximize(); //Maximize window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //Wait
		
		driver.findElement(By.name("q")).sendKeys("Mens");
		
	}

}
