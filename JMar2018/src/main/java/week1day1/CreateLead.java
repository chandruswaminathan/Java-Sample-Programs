package week1day1;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import week2day2.ProjectMethods;

public class CreateLead extends ProjectMethods {
		@Test
	 public void main() throws InterruptedException {
		
	
	WebElement CreateLead = locateElement("linktext", "Create Lead");
	click(CreateLead);
	WebElement CompName = locateElement("class", "inputBox");
	type(CompName, "Financial Software and Systems Pvt ltd");
	WebElement FirstName = locateElement("xpath", "//input[@id='createLeadForm_firstName']");
	type(FirstName, "Chandru");
	WebElement LastName = locateElement("xpath", "//input[@id='createLeadForm_lastName']");
	type(LastName, "Swaminathan");
	WebElement SubmitButton = locateElement("name", "submitButton");
	click(SubmitButton);
	
	
		
	}

}