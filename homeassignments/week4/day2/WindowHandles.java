package week4.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		// launch the browser
		driver.get("http://leaftaps.com/opentaps/.");
		// Enter Username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click on Submit
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click on Contacts tab
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		// Click on Merge Contacts
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		// Click lookup icon
		driver.findElement(By.xpath("(//input[@name='partyIdFrom']/following-sibling::a)")).click();
		// Switch to child window
		
		String windowHandles = driver.getWindowHandle();
		driver.switchTo().window(windowHandles);
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@name='id']")).sendKeys("arg");
		

	}

}
