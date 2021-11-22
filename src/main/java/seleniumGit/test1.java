package seleniumGit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	
		//CODE FOR SIGNUP BUTTON
	    public static void main(String[] args) throws InterruptedException {
	        // TODO Auto-generated method stub

	 

	  System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	          
	          WebDriver driver=new ChromeDriver();
	          
	          driver.get("https://www.eazydiner.com/");
	         
	          
	           try {
	           if(driver.findElement(By.id("webpush-onsite")).isDisplayed()) {
	               driver.switchTo().frame(driver.findElement(By.id("webpush-onsite")));
	               driver.findElement(By.id("allow")).click();
	               driver.switchTo().defaultContent(); 
	           }
	           }
	           catch (Exception e){
	               
	           } 
	         
	           driver.findElement(By.xpath("//*[@id=\"signup\"]")).click();
	   	    Thread.sleep(1000);
	   	  	    
	   	
	   	    driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("Rakesh");
	   	    driver.findElement(By.xpath("//*[@id=\"lname\"]")).sendKeys("Misal");
	   
	   	    driver.findElement(By.xpath("//*[@id=\"form-register\"]/div[2]/div/div[1]/div/div/input")).sendKeys("8408849494");
	   	    
	   	    driver.findElement(By.xpath("//*[@id=\"form-register\"]/div[3]/div[1]/div/input")).sendKeys("rakeshmisal08@gmail.com");
	   	    Thread.sleep(1000);
	   	    driver.findElement(By.xpath("//*[@id=\"signup_submit\"]")).click();
	   	 
	      
	    }
	    
	    
	}

