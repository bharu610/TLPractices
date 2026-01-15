package homeassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize(); // method chaining

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Enter login creds
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// identifying webelements by link text -
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();

		driver.findElement(By.id("accountName")).sendKeys("Telecom");

		// Selecting Industry by Value
		WebElement indus = driver.findElement(By.name("industryEnumId"));
		Select options = new Select(indus);
		options.selectByValue("IND_SOFTWARE");

		// Select Ownership by VisibleText
		WebElement own = driver.findElement(By.name("ownershipEnumId"));
		Select ownop = new Select(own);
		ownop.selectByVisibleText("S-Corporation");

		// Selecting Soruce by Value
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select src = new Select(source);
		src.selectByValue("LEAD_EMPLOYEE");

		// Selecting Campaign by Index
		WebElement market = driver.findElement(By.id("marketingCampaignId"));
		Select mcam = new Select(market);
		mcam.selectByIndex(6);

		// Selecting state by Value
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select province = new Select(state);
		province.selectByValue("TX");

		// Create account
		driver.findElement(By.className("smallSubmit")).click();

		// Get page title
		String title = driver.getTitle();
		System.out.println(title);

		driver.close();
	}

}
