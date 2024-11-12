package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
public static WebDriver driver;
      fileutility fileutil=new fileutility();
      @BeforeClass
      public void launchbrowser() throws Throwable {
    	  String browser = fileutil.readfiledata("browser");
    	  if(browser.equalsIgnoreCase("chrome")) {
    		  driver=new ChromeDriver();
    	  }
    	  else if(browser.equalsIgnoreCase("firefox")) {
    		  driver=new FirefoxDriver();
    	  }
    	  else {
    		  System.out.println("invalid browser");
    	  }
    	  driver.manage().window().maximize();
      }
      @BeforeMethod
      public void login() throws Throwable {
    	  String url = fileutil.readfiledata("url");
    	  driver.get(url);
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    		driver.manage().deleteAllCookies();
      }

}
