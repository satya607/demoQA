package com_demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.Baseclass;
import utility.Excelutil;

public class BookstoreApp extends Baseclass {
	Excelutil excel=new Excelutil();
 @Test
 public void loginforbook() throws Throwable {
	  WebElement element = driver.findElement(By.xpath("//h5[normalize-space()='Book Store Application']"));
      JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",element);
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		jse.executeScript("arguments[0].click()",login);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("satya");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("satya1122");
		WebElement submit = driver.findElement(By.xpath("//button[@id='login']"));
		jse.executeScript("arguments[0].click()",submit);
		driver.close();
 }
}
