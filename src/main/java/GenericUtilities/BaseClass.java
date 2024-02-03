package GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomPages.AddNewCategoryPage;
import PomPages.AddNewCoursePage;
import PomPages.AddNewUserPage;
import PomPages.CategoryPage;
import PomPages.CourseListPage;
import PomPages.HomePage;
import PomPages.LoginPage;
import genericUtilities.WebDriverUtilities;

public class BaseClass<PropertiesUtility> {

	 public static Object sdriver;
	protected WebDriver driver;
	protected PropertiesUtility property;
	protected JavaUtility jutil;
	protected WebDriverUtilities web;
	protected ExcelUtility excel;
	
	protected LoginPage login;
	protected HomePage home;
	protected UserPage users;
	protected CategoryPage category;
	protected AddNewUSerPage adduser;
	protected AddNewCoursePage addcourse;
	protected AddNewCategoryPage addCategory;
	
	
	//@Beforesuite
	//@BeforeTest
	
	@BeforeClass
	public void classSetup() {
		web=new GenericUtilities.WebDriverUtilities();
		jutil=new JavaUtility();
		property=new PropertiesUtility();
		excel=new ExcelUtility();
		
		property.propertiesInit(IConstantPath.PROPERTIES_FILE_PATH);
		
		driver=web.launchBrowserAndMaximize(property.readFromProperties("browser"));
		web.waitTillElementFound(Long.parseLong(property.readFromProperties("timeouts")));
		sdriver=driver;
		sjutil=jutil;
	}
	@BeforeMethod
	public void methodSetup() {
		login=new LoginPage(driver);
		home=new HomePage(driver);
		users=new usersPage(driver;)
		courseList=new CourseListPage(driver);
		category=new categoryPage(driver);
		addUser=new AddNewUserPage(driver);
		addCourse=new AddNewCoursePage(driver);
		addCategory=new AddNewCategoryPage(driver);
		
		excel.excelInit(IContantPath.EXCEL_PATH_"sheet1");
		
		web.navigateToApp(property.readFromProperties("url"));
		login.loginToApp(property.readFromProperties("username"),property.readFromProperties("password"));
	}
	@AfterMethod
	public void  methodTearDown() {
		excel.closeExcel();
		home.signOutofApp();
	}
	@AfterClASS
	public void classTearDown() {
		web.quitAllWindows();
		
	}
	//@AfterTest
	//@AfterSuite
	
	
}
