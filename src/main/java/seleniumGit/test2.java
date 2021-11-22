package seleniumGit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	// CODE FOR Book table

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
	    driver.get("https://www.eazydiner.com/"); 
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//span[text()='Book a Table']")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//*[@id='restaurants']/div[3]/div/div[3]/div[2]/div[2]/a")).click();
	    
	    driver.findElement(By.xpath("//button[contains(text(),'Continue to book a table')]")).click();
	    driver.findElement(By.xpath("//input[@id='guest_name']")).sendKeys("Rakesh Misal");
	    driver.findElement(By.xpath("//*[@id='guest-form']/div/div[2]/div/div/input")).sendKeys("8408849494");
	    
	    driver.findElement(By.xpath("//input[@id='guest_email']")).sendKeys("rakeshmisal08@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='checkout-button']")).click();
	 
	}
}


