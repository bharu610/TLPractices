package homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver=new EdgeDriver();
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
	driver.findElement(By.partialLinkText("Create Le")).click();
	
	//Entering values
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bharathi");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
	
	//Create lead
	driver.findElement(By.name("submitButton")).click();
	
		
		//Print title of the webpage
		String title = driver.getTitle();
		System.out.println(title);
		
		//close browser
		driver.quit();

	}

}
