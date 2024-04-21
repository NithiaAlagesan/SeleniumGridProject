package seleniumGrid;

import org.testng.Reporter;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
public class GridTest {
  @Test
  public void testOnChrome() throws MalformedURLException, InterruptedException 
    {
	  EdgeOptions options = new EdgeOptions();
	  Reporter.log("Test Executing on Edge!", true);
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/"), options);
	  Reporter.log("Driver sesion established with server!", true);
	  Thread.sleep(5000);
	  
	  driver.get("https://www.amazon.com/");
	  Reporter.log("Test Executing for Amazon Application!", true);
	  System.out.println("Title is : " + driver.getTitle());
	  Thread.sleep(10000);
	  
	  driver.close();
	  Reporter.log("Test Executing on Edge Completed!", true);
	  
	  	  
  }
}
