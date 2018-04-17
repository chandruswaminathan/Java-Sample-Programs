package homeworkPack3;

import org.testng.annotations.Test;


import week2day2.ProjectMethods;
import org.openqa.selenium.WebElement;


public class EditLead extends ProjectMethods {
	@Test(invocationCount=2)
	 public void editLead() {
			
			
			WebElement FindLeads = locateElement("linktext", "Find Leads");
			click(FindLeads);
			WebElement firstname = locateElement("xpath", "//label[text()='Lead ID:']/following::input[2]");
			type(firstname,"f");
			WebElement SearchLeads = locateElement("xpath", "//button[text()='Find Leads']");
			click(SearchLeads);
			WebElement ResultFirstLead = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
			wait(ResultFirstLead);
			click(ResultFirstLead);
			verifyTitle("View Lead | opentaps CRM");
			WebElement Edit = locateElement("linktext", "Edit");
			click(Edit);
			WebElement CompName = locateElement("id", "updateLeadForm_companyName");
			clear(CompName);
			type(CompName, "FSS");
			WebElement SubmitBtn = locateElement("name", "submitButton");
			click(SubmitBtn);
			WebElement updatedName = locateElement("xpath", "//span[@id='viewLead_companyName_sp']");
			verifyPartialText(updatedName,"FSS");
			
			
	}

}
