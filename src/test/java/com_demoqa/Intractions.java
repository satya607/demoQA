package com_demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.Baseclass;

public class Intractions extends Baseclass {
	@Test
	public void sortable() {
		 WebElement element = driver.findElement(By.xpath("//h5[text()='Interactions']"));
		    JavascriptExecutor jse=(JavascriptExecutor)driver;
				jse.executeScript("arguments[0].click()",element);
				WebElement progressbar = driver.findElement(By.xpath("//span[text()='Sortable']"));
				jse.executeScript("arguments[0].click()",progressbar);
				
	}
}

