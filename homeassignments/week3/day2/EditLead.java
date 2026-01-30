package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
	
	//identifying webelements by Xpath
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Bharathi");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Ravi");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Bharu");
	
	//identifying webelements by id
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Hey Hi !!! Bharathi here");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bharathi123@gmail.com");
	
	//Select class using visible text
	WebElement province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select pr = new Select(province);
	pr.selectByVisibleText("New York");
	
	driver.findElement(By.name("submitButton")).click();
	
	//Edit Lead
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_description")).clear();
	driver.findElement(By.id("updateLeadForm_description")).sendKeys("Hey Hi !!! Let's edit the desc !!");
	
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Lets edit the Lead");
	driver.findElement(By.xpath("(//*[@name='submitButton'])[1]")).click(); //xpath and index
	
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.close();

	}

}

