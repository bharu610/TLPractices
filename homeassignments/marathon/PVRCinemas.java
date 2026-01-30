package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));

       
            // 2. Load the application URL
            driver.get("https://www.pvrcinemas.com");
            driver.manage().window().maximize();

           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Bengaluru'])[2]"))).click();
           
           //driver.findElement(By.xpath("(//*[@class='cities-name pointer'])[5]")).click();
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='cities-name pointer'])[5]"))).click();
           
           driver.findElement(By.className("cinemas-inactive")).click();
           
           driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'INOX The Marina Mall')]"))).click();
           
          // driver.findElement(By.xpath("//span[text()='Select Date']")).click();
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Tomorrow']"))).click();
           
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='DRAUPATHI 2'])[2]"))).click();
		
	}

}
	

