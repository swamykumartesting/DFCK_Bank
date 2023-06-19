package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alertts {
	
	public WebDriver driver;
	
	
  @Test
  public void alertandle() throws Exception {
	  
	  driver.findElement(By.id("alertButton")).click();
	  
	  Thread.sleep(3000);
	  
	  driver.switchTo().alert().accept();
	  
	  Thread.sleep(3000);
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	 driver.close();
	  
	  
  }

}
