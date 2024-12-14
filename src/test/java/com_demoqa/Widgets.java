package com_demoqa;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.Baseclass;

public class Widgets extends Baseclass {
	
@Test
public void Accordian() {
	  WebElement element = driver.findElement(By.xpath("//h5[text()='Widgets']"));
	     JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()",element);
			WebElement accordian = driver.findElement(By.xpath("//span[text()='Accordian']"));
			jse.executeScript("arguments[0].click()",accordian);
	
}
@Test
public void date_picker() {
	WebElement element = driver.findElement(By.xpath("//h5[text()='Widgets']"));
    JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",element);
		WebElement datepicker = driver.findElement(By.xpath("//span[text()='Date Picker']"));
		jse.executeScript("arguments[0].click()",datepicker);
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		 WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		  WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		   Select selectyear = new Select(year);
		   selectyear.selectByValue("1902");
		   Select selectmonth = new Select(month);
		   selectmonth.selectByValue("4");
		   WebElement daypicker = driver.findElement(By.xpath("//div[text()='11']"));
		   jse.executeScript("arguments[0].click()", daypicker);
		   WebElement dateandtime = driver.findElement(By.id("dateAndTimePickerInput"));
		   jse.executeScript("arguments[0].click()",dateandtime);
		   jse.executeScript("window.scrollTo(0,500)");
		  String yr="2024";
		  String mn="december";
		  String date="10";
		  String time="10:00";
		 while(true) {
			 String monthyear = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month"
			 + " react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']")).getText();
			 String[] arr = monthyear.split(" ");
			 String mon = arr[0];
			 String yer=arr[1];
			 if(mon.equalsIgnoreCase(mn) && yer.equalsIgnoreCase(yr))
				 break;
			 else
				 driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
		 }
		 List<WebElement> alldate = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div/div"));
		  for(WebElement ele:alldate) {
			  String dt = ele.getText();
			  if(dt.equals(date)) {
				  ele.click();
				  break;
			  }
		  }
		  List<WebElement> alltime = driver.findElements(By.xpath("//ul[@class='react-datepicker__time-list']/li"));
		  for(WebElement ele:alltime) {
			  String tm = ele.getText();
			  if(tm.equals(time)) {
				  ele.click();
				  break;
			  }
		  }	
		  
}
 @Test
 public void slider() {
	 WebElement element = driver.findElement(By.xpath("//h5[text()='Widgets']"));
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()",element);
			WebElement slider = driver.findElement(By.xpath("//span[text()='Slider']"));
			jse.executeScript("arguments[0].click()",slider);
			WebElement sld = driver.findElement(By.xpath("//input[@type='range']"));
			Actions action = new Actions(driver);
			action.dragAndDropBy(sld, 50, 0).perform();
			driver.close();
 }
 @Test
 public void progressbar() {
	 WebElement element = driver.findElement(By.xpath("//h5[text()='Widgets']"));
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()",element);
			WebElement progressbar = driver.findElement(By.xpath("//span[text()='Progress Bar']"));
			jse.executeScript("arguments[0].click()",progressbar);
			driver.findElement(By.xpath("//button[@id='startStopButton']")).click();
			WebElement progresbar = driver.findElement(By.xpath("//div[@id='progressBar']"));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			Boolean status = wait.until(ExpectedConditions.attributeToBe(progresbar, "aria-valuenow", "100"));
			if(status==true) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='resetButton']"))).click();
			}
		
 }	
 @Test
	public void tabs() throws InterruptedException {
	 WebElement element = driver.findElement(By.xpath("//h5[text()='Widgets']"));
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()",element);
			WebElement tabs = driver.findElement(By.xpath("//span[text()='Tabs']"));
			jse.executeScript("arguments[0].click()",tabs);
			WebElement demo = driver.findElement(By.xpath("//a[@id='demo-tab-what']"));
			jse.executeScript("arguments[0].click()",demo);
			Thread.sleep(3000);
			
			
	 WebElement origin = driver.findElement(By.xpath("//a[@id='demo-tab-origin']"));
	 jse.executeScript("arguments[0].click()",origin);
	 WebElement ele = driver.findElement(By.xpath("//p[contains(text(),'Contrary to popular belief, Lorem Ipsum is not sim')]"));
	 System.out.println(ele.getText());
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[@id='demo-tab-use']")).click();
	 driver.close();
 }
	@Test
	public void tooltips() {
		WebElement element = driver.findElement(By.xpath("//h5[text()='Widgets']"));
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()",element);
			WebElement tooltip = driver.findElement(By.xpath("//span[text()='Tool Tips']"));
			jse.executeScript("arguments[0].click()",tooltip);
			
	}
	@Test
	public void selectmenu() {
		WebElement element = driver.findElement(By.xpath("//h5[text()='Widgets']"));
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()",element);
			WebElement selectmenu = driver.findElement(By.xpath("//span[text()='Select Menu']"));
			jse.executeScript("arguments[0].click()",selectmenu);
			driver.findElement(By.xpath("//div[text()='Select Option']")).click();
			WebElement ele = driver.findElement(By.xpath("//div[text()='Group 2, option 1']"));
			jse.executeScript("arguments[0].click()",ele);
			
	}
			
}
