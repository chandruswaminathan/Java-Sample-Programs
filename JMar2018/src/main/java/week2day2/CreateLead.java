package week2day2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import wdMethods.SeMethods;
import week4day1.Exceltwo;

public class CreateLead extends ProjectMethods {
		
	@Test(dataProvider="LeadDetails")
	 public void createLead(String compname,String fname,String lname) {
		
	
	WebElement CreateLead = locateElement("linktext", "Create Lead");
	click(CreateLead);
	WebElement CompName = locateElement("class", "inputBox");
	type(CompName, compname);
	WebElement FirstName = locateElement("xpath", "//input[@id='createLeadForm_firstName']");
	type(FirstName, fname);
	WebElement LastName = locateElement("xpath", "//input[@id='createLeadForm_lastName']");
	type(LastName, lname);
	WebElement SubmitButton = locateElement("name", "submitButton");
	click(SubmitButton);
			
	}
		@DataProvider(name="LeadDetails")
		public Object[][] createleadDetails() throws IOException{
			Exceltwo re=new Exceltwo();
			Object[][] data=re.readExcel();
			return data;
		}

}