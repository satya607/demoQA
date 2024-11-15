package pases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Webdriverutil;

public class Loginbookstore_pom extends Webdriverutil {

  public Loginbookstore_pom(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  @FindBy(xpath="//input[@id='userName']")
  private WebElement username;
  @FindBy(xpath="//input[@id='password']")
  private WebElement password;
  @FindBy(xpath="//button[@id='login']")
  private WebElement submit;
   public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getSubmit() {
	return submit;
}
public void login(String un,String pass) {
	  username.sendKeys(un);
	  password.sendKeys(pass);
	
	  submit.click();
  }
public void clickbyjse(WebDriver driver,WebElement element) {
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()",element);
}
  
}
