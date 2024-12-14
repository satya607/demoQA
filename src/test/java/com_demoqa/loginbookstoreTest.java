package com_demoqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pases.Homepage_pom;
import pases.Loginbookstore_pom;
import utility.Baseclass;
import utility.Webdriverutil;

public class loginbookstoreTest extends Baseclass{

	@Test(dataProvider="getdata")
	public void logintoapp(String username, String password) {
		Webdriverutil webutil = new Webdriverutil();
	 Homepage_pom hp=new Homepage_pom(driver);
	 WebElement element = hp.getBookstoreapp();
	 webutil.clickonelement(driver, element);
	 Loginbookstore_pom lbk = new Loginbookstore_pom(driver);
	WebElement loginlink = lbk.getLoginlink();
	webutil.clickonelement(driver, loginlink);
	lbk.login(username,password);
	WebElement submit = lbk.getSubmit();
	webutil.clickonelement(driver, submit);
	driver.close();
	}
	@DataProvider
	public Object[][] getdata(){
		 Object[][] data = new Object[2][2];
		data[0][0]="satya1";
		data[0][1]="s1a2t3";
		data[1][0]="satya2";
		data[1][1]="satya@";
		return data;
	}
}
