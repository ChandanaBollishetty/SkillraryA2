package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
		@FindBy(xpath="//h3[text()='Login']")
		private WebElement pageHeader;
		
		@FindBy(id="email")
		private WebElement username;
		
		@FindBy(name="password")
		private WebElement loginButton;
		
		//initialization
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
			
		}
		
		//utilization
		public String getPageHeader() {
			return pageHeader.getText();
			
		}
		public void loginToApp(String username,String password) {
			usernameTF.sendKeys(username);
			passwordTF.sendkeys(password);
			loginButton.click();
			
		}
}
