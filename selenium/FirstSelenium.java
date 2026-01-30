package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize(); //method chaining 
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.close();		
		
		
		FirefoxDriver dri = new FirefoxDriver();
		dri.get("https://www.amazon.in/");
		dri.close();
		
		EdgeDriver drive = new EdgeDriver();
		drive.get("https://www.flipkart.com/");
		drive.close();
			
	}

}
