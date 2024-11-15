package pases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Element_pom {
	 public Element_pom(WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
	 @FindBy(xpath="//span[normalize-space()='Text Box']")
	 private WebElement textbox;
	 @FindBy(xpath="//input[@id='userName']")
	 private WebElement username;
	 @FindBy(xpath="//input[@id='userEmail']")
	 private WebElement useremail;
	 @FindBy(xpath="//textarea[@id='currentAddress']")
	 private WebElement currentaddress;
	 @FindBy(xpath="//textarea[@id='permanentAddress']")
	 private WebElement permanentaddress;
	 @FindBy(xpath="//button[@id='submit']")
	 private WebElement submit;
	 
	 @FindBy(xpath="//span[normalize-space()='Check Box']")
	 private WebElement checkbox;
	 @FindBy(xpath="//span[@class='rct-checkbox']")
	 private WebElement ractcheckbox;
	 @FindBy(xpath="//button[@aria-label='Expand all']")
	 private WebElement expandbox;
	 
	 @FindBy(xpath="//span[normalize-space()='Radio Button']")
	 private WebElement radoibutton;
	 @FindBy(xpath="//input[@id='yesRadio']")
	 private WebElement yesradoibtn;
	 @FindBy(xpath="//input[@id='impressiveRadio']]")
	 private WebElement impressivebtn;
	 
	 @FindBy(xpath="//span[normalize-space()='Web Tables']")
	 private WebElement webtable;
	 @FindBy(xpath="//input[@id='firstName']")
	 private WebElement firstname;
	 @FindBy(xpath="//input[@id='lastName']")
	 private WebElement lastname;
	 @FindBy(xpath="//input[@id='userEmail']")
	 private WebElement usermail;
	 @FindBy(xpath="//input[@id='age']")
	 private WebElement age;
	 @FindBy(xpath="//input[@id='salary']")
	 private WebElement salary; 
	 @FindBy(xpath="//input[@id='department']")
	 private WebElement department;
	 
	 @FindBy(xpath="//span[normalize-space()='Buttons']")
	 private WebElement button;
	 @FindBy(xpath="//button[@id='doubleClickBtn']")
	 private WebElement doubleclickbtn;
	 @FindBy(xpath="//button[@id='rightClickBtn']")
	 private WebElement rightclick;
	 @FindBy(xpath="//button[@id='gZBMM']")
	 private WebElement clickme;
	 
	 @FindBy(xpath="//span[normalize-space()='Links']")
	 private WebElement links;
	 @FindBy(id="simpleLink")
	 private WebElement simplelink;
	 @FindBy(id="dynamicLink")
	 private WebElement dynamiclinks;
	 
	 @FindBy(xpath="//span[normalize-space()='Broken Links - Images']")
	 private WebElement brokenlinks;
	 @FindBy(xpath="//a[normalize-space()='Click Here for Valid Link']")
	 private WebElement validlinks;
	 @FindBy(xpath="//a[normalize-space()='Click Here for Broken Link']")
	 private WebElement invalidlinks;
	 
	 @FindBy(xpath="//span[normalize-space()='Upload and Download']")
	 private WebElement uploadanddownload;
	 
	 @FindBy(xpath="//input[@id='uploadFile']")
	 private WebElement uploadfile;
	 
	 @FindBy(xpath="//a[text()='Download']")
	 private WebElement download;

	public WebElement getTextbox() {
		return textbox;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getUseremail() {
		return useremail;
	}

	public WebElement getCurrentaddress() {
		return currentaddress;
	}

	public WebElement getPermanentaddress() {
		return permanentaddress;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getRactcheckbox() {
		return ractcheckbox;
	}

	public WebElement getExpandbox() {
		return expandbox;
	}

	public WebElement getRadoibutton() {
		return radoibutton;
	}

	public WebElement getYesradoibtn() {
		return yesradoibtn;
	}

	public WebElement getImpressivebtn() {
		return impressivebtn;
	}

	public WebElement getWebtable() {
		return webtable;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getUsermail() {
		return usermail;
	}

	public WebElement getAge() {
		return age;
	}

	public WebElement getSalary() {
		return salary;
	}

	public WebElement getDepartment() {
		return department;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getDoubleclickbtn() {
		return doubleclickbtn;
	}

	public WebElement getRightclick() {
		return rightclick;
	}

	public WebElement getClickme() {
		return clickme;
	}

	public WebElement getLinks() {
		return links;
	}

	public WebElement getSimplelink() {
		return simplelink;
	}

	public WebElement getDynamiclinks() {
		return dynamiclinks;
	}

	public WebElement getBrokenlinks() {
		return brokenlinks;
	}

	public WebElement getValidlinks() {
		return validlinks;
	}

	public WebElement getInvalidlinks() {
		return invalidlinks;
	}

	public WebElement getUploadanddownload() {
		return uploadanddownload;
	}

	public WebElement getUploadfile() {
		return uploadfile;
	}

	public WebElement getDownload() {
		return download;
	}
	 
	
	
}
