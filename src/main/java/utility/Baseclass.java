package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baseclass {
		public static WebDriver driver;
		Fileutility fileutil=new Fileutility();
     
      @BeforeClass
      public void launchbrowser() throws Throwable {
    	  
    	  try {
    		  
    		  String browser = fileutil.readfiledata("browser");
        	  if(browser.equalsIgnoreCase("chrome")) {
        		  driver=new ChromeDriver();
        	  }
        	  else if(browser.equalsIgnoreCase("edge")) {
        		  driver=new EdgeDriver();
        	  }
        	  else {
        		  System.out.println("invalid browser");
        	  }
        	  driver.manage().window().maximize();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    			  
      }
      @BeforeMethod
      public void login() throws Throwable {
    	  String url = fileutil.readfiledata("url");
    	  driver.get(url);
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    		driver.manage().deleteAllCookies();
      }

}
