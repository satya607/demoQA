package com_demoqa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pases.Element_pom;
import pases.Homepage_pom;
import utility.Baseclass;
import utility.Webdriverutil;
import utility.excelutil;

public class ElementsTest extends Baseclass{
	
	@Test(priority=1)
           public static void testbox() throws Throwable {
		Webdriverutil	webutil=new Webdriverutil();
		excelutil excelutil = new excelutil();
		 Homepage_pom hp = new Homepage_pom(driver);
		 WebElement element = hp.getElements();
		 webutil.clickonelement(driver,element);
		 Element_pom elementtextbox = new Element_pom(driver);
		 WebElement textbox = elementtextbox.getTextbox();
		 webutil.clickonelement(driver,textbox);
		 elementtextbox.getUsername().sendKeys(excelutil.readEcelData("Element.textbox", 0, 0));
		 elementtextbox.getUseremail().sendKeys(excelutil.readEcelData("Element.textbox", 1, 0));
		 elementtextbox.getCurrentaddress().sendKeys(excelutil.readEcelData("Element.textbox", 2, 0));
		 elementtextbox.getPermanentaddress().sendKeys(excelutil.readEcelData("Element.textbox", 3, 0));
		 elementtextbox.getSubmit().click();
           }
           @Test(priority=2)
           public static void checkbox() throws InterruptedException {
        	  
//        	   WebElement element = driver.findElement(By.xpath("//h5[text()='Elements']"));
//               JavascriptExecutor jse=(JavascriptExecutor)driver;
//       		jse.executeScript("arguments[0].click()",element);
//       		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
//       		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
//       		driver.findElement(By.xpath("//button[@aria-label='Expand all']")).click();
        	   Webdriverutil	webutil=new Webdriverutil();
       		excelutil excelutil = new excelutil();
       		 Homepage_pom hp = new Homepage_pom(driver);
       		 WebElement element = hp.getElements();
       		 webutil.clickonelement(driver,element);
       		 Element_pom elements = new Element_pom(driver);
       		 WebElement checkbox = elements.getCheckbox();
       		 webutil.clickonelement(driver, checkbox);
       		
           }
           @Test(dependsOnMethods="checkbox")
           public static void Radiobutton() throws InterruptedException {
        	  
        	   WebElement element = driver.findElement(By.xpath("//h5[text()='Elements']"));
               JavascriptExecutor jse=(JavascriptExecutor)driver;
       		jse.executeScript("arguments[0].click()",element);
       		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
       		Thread.sleep(4000);
       		WebElement element1 = driver.findElement(By.xpath("//input[@id='yesRadio']"));
       		JavascriptExecutor jse1=(JavascriptExecutor)driver;
       		jse1.executeScript("arguments[0].click()",element1);
       		Thread.sleep(3000);
       		WebElement element2 = driver.findElement(By.xpath("//input[@id='impressiveRadio']"));
       		jse1.executeScript("arguments[0].click()",element2);
       		}
           @Test
           public static void webtable() {
        	   
        	   WebElement element = driver.findElement(By.xpath("//h5[text()='Elements']"));
               JavascriptExecutor jse=(JavascriptExecutor)driver;
       		jse.executeScript("arguments[0].click()",element);
       		WebElement webtable = driver.findElement(By.xpath("//span[text()='Web Tables']"));
       		jse.executeScript("arguments[0].click()",webtable);
       		driver.findElement(By.xpath("//button[text()='Add']")).click();
       		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("satya");
       		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("yadav");
       		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("s yadav657@gmail.com");
       		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("25");
       		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("000");
       		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("abc");
       		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
       		jse.executeScript("arguments[0].click()",submit);
       		}
           @Test
           public static void buttontest()  {
        	
        	   WebElement element = driver.findElement(By.xpath("//h5[text()='Elements']"));
               JavascriptExecutor jse=(JavascriptExecutor)driver;
       		jse.executeScript("arguments[0].click()",element);
       		 WebElement button = driver.findElement(By.xpath("//span[text()='Buttons']"));
       		jse.executeScript("arguments[0].click()",button);

       		WebElement doubleclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
       		WebElement rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
       		WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));
       		
       		Actions action = new Actions(driver);
       		action.doubleClick(doubleclick).perform();
       		action.contextClick(rightclick).perform();
       		action.click(click);
           }
           @Test
           public static void links() {
        	   
        	   WebElement element = driver.findElement(By.xpath("//h5[text()='Elements']"));
               JavascriptExecutor jse=(JavascriptExecutor)driver;
       		jse.executeScript("arguments[0].click()",element);
       		WebElement links = driver.findElement(By.xpath("//span[text()='Links']"));
       		jse.executeScript("arguments[0].click()",links);
       		driver.findElement(By.id("simpleLink")).click();
       		driver.findElement(By.id("dynamicLink")).click();
       		WebElement created = driver.findElement(By.xpath("//a[text()='Created']"));
       		jse.executeScript("arguments[0].click()",created);
           }	
          @Test
           public void brokenlinks()  {
        	  
        	  WebElement element = driver.findElement(By.xpath("//h5[text()='Elements']"));
              JavascriptExecutor jse=(JavascriptExecutor)driver;
      		jse.executeScript("arguments[0].click()",element);
      		WebElement brokenlinks = driver.findElement(By.xpath("//span[text()='Broken Links - Images']"));
      		jse.executeScript("arguments[0].click()",brokenlinks);
      		
      		WebElement validlink = driver.findElement(By.xpath("//a[text()='Click Here for Valid Link']"));
      		jse.executeScript("arguments[0].click()",validlink);
           }
          @Test
          public void downloadandupload() {
        	 
        	  WebElement element = driver.findElement(By.xpath("//h5[text()='Elements']"));
              JavascriptExecutor jse=(JavascriptExecutor)driver;
      		jse.executeScript("arguments[0].click()",element);
      		WebElement uploadanddownload = driver.findElement(By.xpath("//span[text()='Upload and Download']"));
      		jse.executeScript("arguments[0].click()",uploadanddownload);
      		WebElement upload = driver.findElement(By.xpath("//input[@id='uploadFile']"));
      		upload.sendKeys("C:\\Users\\Qapitol QA\\Downloads\\WhatsApp Image 2024-11-07 at 6.29.40 PM.jpeg");
      		 driver.findElement(By.xpath("//a[text()='Download']")).click();
          }
}
