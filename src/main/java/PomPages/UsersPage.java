package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
//Declaration
	@FindBy(xpath="")
	private WebElement pageHeader;
	
	@FindBy(xpath="")
	private WebElement newButton;

	
	//Initialization
	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver,this)
	}
	
	
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public void clickNewButton() {
		newButton.click();
	}
	
}
