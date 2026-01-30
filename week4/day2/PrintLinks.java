package week4.day2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/"); //Launch URL
		
		driver.manage().window().maximize(); //Maximize window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //Wait

	}

}
