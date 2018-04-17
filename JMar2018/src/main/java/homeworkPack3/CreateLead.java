package homeworkPack3;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import week2day2.ProjectMethods;

public class CreateLead extends ProjectMethods {
		@Test(invocationCount=2)
	 public void createLead() {
		
	/*WebElement CreateLead1 = locateElement("xpath", "//a[contains(text(),'Create Lead')]");
	click(CreateLead1);
	String dta=getText(CreateLead1, "");
	System.out.println(dta);*/
	WebElement CreateLead = locateElement("linktext", "Create Lead");
	click(CreateLead);
	WebElement CompName = locateElement("class", "inputBox");
	//click(CompName);
	type(CompName, "Financial Software and Systems Pvt ltd");
	WebElement FirstName = locateElement("xpath", "//input[@id='createLeadForm_firstName']");
	//click(FirstName);
	type(FirstName, "Chandru");
	WebElement LastName = locateElement("xpath", "//input[@id='createLeadForm_lastName']");
	type(LastName, "Swaminathan");
	WebElement SubmitButton = locateElement("name", "submitButton");
	click(SubmitButton);
	/*String expTitle="View Lead | opentaps CRM";
	String actTitle=null;
	getTitle(actTitle);
	if(actTitle.equals(expTitle))
	{
		System.out.println("Lead Created Successfully");
		}
	else
		System.out.println("Error occured while creating Lead");*/
		
	}

}