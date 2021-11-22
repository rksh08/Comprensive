package seleniumGit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
public class test5 {
	
	
	//CODE FOR NAVIGATE HELP PAGE
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	          
	          WebDriver driver=new ChromeDriver();
		    
		    driver.get("https://www.eazydiner.com/"); 
		    driver.findElement(By.id("help")).click();
		    
		  //to scroll the page
		    try {
			       int i = 0;
			       for (; i <= 20; i++) {
			          ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + i + ")"), "");
			       }
			       for (; i > 0; i--) {
			          ((JavascriptExecutor) driver).executeScript(("window.scrollBy(0," + i + ")"), "");
			       }
		    } catch (WebDriverException wde) {} catch (Exception e) {}
		    
		    
		    
		}


	}

