package com_demoqa_util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	 public static WebDriver driver;
	    public static void initialize(){
	        driver=new ChromeDriver();
	        driver.get("https://demoqa.com/");
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
}
}
