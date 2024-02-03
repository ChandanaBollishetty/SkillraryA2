package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewUserPage {
//Declaration
	@FindBy(xpath="") 
	private WebElement pageHeader;
	
	@FindBy(xpath="//input[@name='email' and @required]")
	private WebElement emailTF;
	
	@FindBy(xpath="//input[@name='password' and @required]")
	private WebElement passwordTF;
	
	@FindBy(xpath="//input[@name='firstname' and @required]")
			private WebElement firstnameTF;
	@FindBy(xpath="//input[@name='lastname'and @required]")
	private WebElement lastnameTF;
	
	@FindBy(xpath="")
	private WebElement addressTextArea;
	
	@FindBy(xpath="")
	private WebElement contactInfoTF;
	
	@FindBy(xpath="")
	private WebElement photoUploadButton;
	
	@FindBy(xpath="")
	private WebElement saveButton;
	
	//Initialization
	public AddNewUserPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization
	public String getPageHeader()
	{
		 return pageHeader.getText();
	}
	 
	public void setEmail(String email) {
		emailTF.sendKeys(email);
	}
	public void setPassword(String password )
	{
		passwordTF.sendKeys(password);
	}
	public void setFirstname(String firstname) {
		firstnameTF.sendKeys(firstname);
	}
	public void setLastname(String lastname) {
		lastnameTF.sendKeys(lastname);
		
	}
	public void setAddress(String address) {
		addressTextArea.sendKeys(address);
	}
	public void setContactInfo(String contact) {
		contactInfoTF.sendKeys(contact);
	}
	public void upLoadPhoto(String photoPath) {
		photoUploadButton.sendKeys(photoPath);
	}
	public void clicksave() {
		saveButton.click();
	}
	
	
	
	
}
