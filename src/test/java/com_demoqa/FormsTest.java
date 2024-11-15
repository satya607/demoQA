package com_demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utility.Baseclass;



public class FormsTest extends Baseclass {
 @Test
 public void practiceform() throws InterruptedException {
	 
	 WebElement element = driver.findElement(By.xpath("//h5[text()='Forms']"));
     JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",element);
		
		  WebElement practiceform = driver.findElement(By.xpath("//span[text()='Practice Form']"));
		  jse.executeScript("arguments[0].click()", practiceform);
		  driver.findElement(By.id("firstName")).sendKeys("satya");
		  driver.findElement(By.id("lastName")).sendKeys("yadav");
		  driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("satya123@gmail.com");
		  WebElement gender = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
		  jse.executeScript("arguments[0].click()",  gender);
		  driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("0000000000");
		  WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
		  jse.executeScript("arguments[0].click()", dob);
		  WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		  WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		   Select selectyear = new Select(year);
		   selectyear.selectByValue("1902");
		   Select selectmonth = new Select(month);
		   selectmonth.selectByValue("4");
		   WebElement daypicker = driver.findElement(By.xpath("//div[text()='11']"));
		   jse.executeScript("arguments[0].click()", daypicker);
		   driver.findElement(By.id("subjectsInput")).sendKeys("satya1");
		 
		   WebElement checkbox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		   jse.executeScript("arguments[0].click()", checkbox);
		   WebElement upload = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		   upload.sendKeys("C:\\Users\\Qapitol QA\\Pictures\\profile pic.jpg");
		   driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("monnam");
		   Thread.sleep(4000);
		   driver.findElement(By.xpath("//div[@class=' css-1gtu0rj-indicatorContainer']//*[name()='svg']")).click();
		   
		   driver.findElement(By.xpath("//div[text()='NCR']")).click();
		  
		
 }
}
