package homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/"); //Launch URL
		
		driver.manage().window().maximize(); //Maximize window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //Wait
		
		driver.findElement(By.linkText("Create new account")).click(); //Click Create account button
		
		//Enter name details
		driver.findElement(By.name("firstname")).sendKeys("Bharathi"); 
		driver.findElement(By.name("lastname")).sendKeys("Ravi");
		
		//Select DOB
		WebElement day = driver.findElement(By.id("day"));
		Select option = new Select(day);
		option.selectByValue("6");
		
		WebElement month = driver.findElement(By.id("month"));
		Select mon = new Select(month);
		mon.selectByVisibleText("Oct");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select yr = new Select(year);
		yr.selectByVisibleText("1994");
		
		//select gender
		 driver.findElement(By.xpath("//input[@id='sex' and @value='1']")).click();
		 
		 //Enter credentials
		 driver.findElement(By.name("reg_email__")).sendKeys("bharathi@gmail.com");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("HeloWorld");
		 
		 driver.close();
		 
	}

}
