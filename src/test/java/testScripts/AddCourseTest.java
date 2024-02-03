package testScripts;

import java.util.Map;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class AddCourseTest extends BaseClass {
	
	@Test
	public void addCourseTest() {
		home.clickCoursesTab();
		home.clickCoursesListLink();
		courseList.clickNewButton();
		
		Map<String,String>map=excel.readFromExcel("Add Course");
		addCourse.setName(map.get("Name");
		addCourse.selectCategory(web,map.get("category));"
		addCourse.setPrice(map.get("price"));
		addCOurse.setDescription(map.get("discription"),web);
		addCourse.clickSave();
		
		System.out.println(courseList.getSuccessMessage());
		courseList.deleteCourse(web,map.get("Name"));
		System.out.println(courseList.getSuccessMessage());
	}

}
