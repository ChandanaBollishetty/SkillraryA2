package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {
	//Declaration
		@FindBy(xpath="//h1[normalize-space(text())='Category']")
		private WebElement pageHeader;
		
		@FindBy(xpath="//a[text()=' New']")
		private  WebElement newButton;
		
		private String deletePath=
				
				@FindBy(name="delete")
		private WebElement deleteButton;
		
		@FindBy(xpath="//h4[text()=' Success!']")
		private WebElement successMessage;
		
		//Initialization 
		
		public CategoryPage(WebDriver driver) {
			pageFactory.initElements(driver,this);
		}
		//Utilization
		public String getPageHeader() {
			return pageHeader.getText();
		}
		public void clickNewButon() {
			newButton.click();
		}
		public void deleteCourse(WebDriverUtility web,String CourseName) {
		web.convertPathToWebElement(deletePath,courseName).click();
		deleteButton.click();
		}
		public String getSuccessMessage(){
			return successMessage.getText();
		}
		
}