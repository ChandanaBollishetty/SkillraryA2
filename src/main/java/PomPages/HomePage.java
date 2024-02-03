package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//Declaration
	
	@FindBy(xpath="")
	private WebElement pageHeader;
	
	@FindBy(xpath="")
	private WebElement usersTab;
	
	@FindBy(xpath="//span[text()='Courses']")
	private WebElement coursestab;
	
	@FindBy(xpath="")
	private WebElement courseListLink;
	
	@FindBy(xpath="//span{text()='SkillRary Admin")
	private WebElement skillraryAdminIcon;
	
	@FindBy(xpath="")
	private WebElement categoryLink;

	private WebElement coursesTab;

	
	
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public String getPageheader() {
		return pageHeader.getText();
	}
	public void clickUserTab() {
		usersTab.click();
	}
	public void clickCoursesTab() {
		coursesTab.click();
	}
	public void clickCourselistLink() {
		courseListLink.click();
		
	}
	public void clickCategoryLink() {
		categoryLink.click();
	}
	public void signOutofApp() {
		skillraryAdminIcon.click();
		sign
	}
	
}
