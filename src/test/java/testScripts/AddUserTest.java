package testScripts;

import java.util.Map;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class AddUserTest extends BaseClass{
	
@Test
public void addUserTest() {
	home.clickUserTab();
	users.clickNewButton();
	
	Map<String,String>map=excel.readFromExcel("ADd User");
	
	addUser.setEmail(map.get("Email"));
	addUser.setPassword(map.get("PAssword"));
	addUser.setFirstname(map.get("Firstname"));
	addUser.setLastname(map.get("Lastname"));
	addUser.setAddress(map.get("Address"));
	addUser.setContactInfo(map.get("ContactInfo"));
	addUser.setuplaodPhoto(map.get("Photo"));
	
	addUser.clickSave();
}

}