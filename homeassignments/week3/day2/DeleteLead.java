package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(cr);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize(); //method chaining
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter login creds
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//identifying webelements by link text - 
		driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	//driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).click(); 
	// org.openqa.selenium.StaleElementReferenceException
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
	
	driver.findElement(By.linkText("Delete")).click();
	
	driver.close();

	}

}
