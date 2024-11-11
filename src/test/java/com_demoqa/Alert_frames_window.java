package com_demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com_demoqa_util.Baseclass;

public class Alert_frames_window extends Baseclass {
  @Test
  public void window() {
	  Baseclass.initialize();
	  WebElement element = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
	     JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()",element);
  }
}
