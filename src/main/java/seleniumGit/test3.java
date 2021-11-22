package seleniumGit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
public class test3 {
//CODE FOR SCROLLING DOWN AND CHEKING DATA FOR "Food Trends | Critic Recommendation in Delhi"
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	          
	          WebDriver driver=new ChromeDriver();
		    driver.get("https://www.eazydiner.com/"); 
		    
		    try {
			       int x = 0;
			       for (; x <= 53; x++) {
			          ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + x + ")"), "");
			       }
			       for (; x > 0; x--) {
			          ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + x + ")"), "");
			       }
		    } catch (WebDriverException wde) {} catch (Exception e) {}
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//a[@data-collection='Food Trends | Critic Recommendation in Delhi']")).click();
		   
	        // Scrolling down the page
	       
	        		    try {
	        		       int i = 0;
	        		       for (; i <= 40; i++) {
	        		          ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + i + ")"), "");
	        		       }
	        		       for (; i > 0; i--) {
	        		          ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + i + ")"), "");
	        		       }
	        		   
	        		       
	        		       Thread.sleep(2000);
	        		       int j = 0;
	        		       for (; j > -40; j--) {
	        		          ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + j + ")"), "");
	        		       }
	        		       for (; j < 0; j++) {
	        		          ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + j + ")"), "");
	        		       }
	        		    } catch (WebDriverException wde) {} catch (Exception e) {}
	        		   
		}

	}


