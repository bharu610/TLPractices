package week4.day2;

	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class LowestMobileAmazon { 

	    public static void main(String[] args) {

	        // 1. Launch browser
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();

	        // Navigate to amazon.in
	        driver.get("https://www.amazon.in");

	        //Search phones
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
	        driver.findElement(By.id("nav-search-submit-button")).click();

	        // identifying all mobiles
	        List<WebElement> mobile = driver.findElements(
	                By.xpath("//span[@class='a-price-whole']")
	        );

	        // 5. Get values into a List<Integer>
	        List<Integer> p = new ArrayList<>();


	        
	        for (int i = 0; i < mobile.size(); i++) {
	            WebElement price = mobile.get(i);
	            String text = price.getText().replace(",", "").trim();

	            if (!text.isEmpty()) {
	            	p.add(Integer.parseInt(text));  
	            }
	        }

	        // Sort prices 
	        Collections.sort(p);

	        // get the first price
	        Integer lowestPrice = p.get(0); //tried using String but it fetched next lowest value everytime  

	        System.out.println("Lowest Mobile Price on Amazon: " + lowestPrice);

	       
	        driver.quit();
	    }
	}

