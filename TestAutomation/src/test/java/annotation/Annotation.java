package annotation; 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When; 

public class Annotation { 
   WebDriver driver = null; 
   
   @Given("^I am on Facebook login page$") 	
   public void goToFacebook() { 
	  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedrivers.exe");
      driver = new ChromeDriver(); 
      driver.navigate().to("https://www.facebook.com/"); 
      driver.manage().window().maximize();
   }
	
   @When("^I enter username as \"(.*)\"$") 
   public void enterUsername(String arg1) throws InterruptedException {   
	   Thread.sleep(20000);
	  System.out.println("email is displayed - "+driver.findElement(By.id("email")).isDisplayed());
      driver.findElement(By.id("email")).sendKeys(arg1); 
   }
	
   @When ("^I enter password as \"(.*)\"$") 
   public void enterPassword(String arg1) throws InterruptedException {
	   Thread.sleep(10000);
      driver.findElement(By.id("pass")).sendKeys(arg1);
      Thread.sleep(5000);
      System.out.println("click is displayed - "+driver.findElement(By.id("email")).isDisplayed());
      WebElement ele = driver.findElement(By.id("u_0_v"));
      JavascriptExecutor executor = (JavascriptExecutor)driver;
      executor.executeScript("arguments[0].click();", ele);
   } 
	
   @Then("^Login should fail$") 
   public void checkFail() {  
      if(driver.getCurrentUrl().equalsIgnoreCase(
         "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){ 
            System.out.println("Test1 Pass"); 
      } else { 
         System.out.println("Test1 Failed"); 
      } 
   }
	
   @Then("^Relogin option should be available$") 
   public void checkRelogin() { 
      if(driver.getCurrentUrl().equalsIgnoreCase(
         "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){ 
            System.out.println("Test2 Pass"); 
      } else { 
         System.out.println("Test2 Failed"); 
      } 
      driver.close(); 
   }
} 