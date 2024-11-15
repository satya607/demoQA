package pases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_pom {
  public Homepage_pom(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  @FindBy(xpath="//h5[normalize-space()='Book Store Application']")
   private WebElement bookstoreapp;
  @FindBy(xpath="//h5[normalize-space()='Elements']")
  private WebElement elements;
  @FindBy(xpath="//h5[normalize-space()='Forms']")
  private WebElement forms;
  @FindBy(xpath="//h5[normalize-space()='Alerts, Frame & Windows']")
  private WebElement alertframewindow;
  @FindBy(xpath="//h5[normalize-space()='Widgets']")
  private WebElement widget;
  @FindBy(xpath="//h5[normalize-space()='Interactions']")
  private WebElement interaction;
public WebElement getBookstoreapp() {
	return bookstoreapp;
}
public WebElement getElements() {
	return elements;
}
public WebElement getForms() {
	return forms;
}
public WebElement getAlertframewindow() {
	return alertframewindow;
}
public WebElement getWidget() {
	return widget;
}
public WebElement getInteraction() {
	return interaction;
}
  
//  @FindBy(xpath="//div[@class='element-list collapse show']//li[@id='item-0']")
//  private WebElement loginlink;

}

