package com_demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utility.Baseclass;

public class widgets extends Baseclass {
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
		   driver.findElement(By.id("dateAndTimePickerInput")).click();
}
}
