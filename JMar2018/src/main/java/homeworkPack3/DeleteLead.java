package homeworkPack3;

import org.testng.annotations.Test;


import week2day2.ProjectMethods;
import org.openqa.selenium.WebElement;

public class DeleteLead extends ProjectMethods{
	@Test(invocationCount=2)
	 public void deleteLead() throws InterruptedException {
		
	//login();
	WebElement FindLeads = locateElement("linktext", "Find Leads");
	click(FindLeads);
	WebElement PhoneTab = locateElement("xpath", "//span[text()='Phone']");
	click(PhoneTab);
	WebElement SearchPhoneNo = locateElement("xpath", "//input[@name='phoneNumber']");
	type(SearchPhoneNo,"98");
	WebElement FindLeadsBtn = locateElement("xpath", "//button[text()='Find Leads']");
	click(FindLeadsBtn);
	WebElement ResultFirstLead = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
	wait(ResultFirstLead);
	WebElement text1=locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
	String fromid=getText(text1, "");
	System.out.println(fromid);
	click(ResultFirstLead);
	WebElement DeleteLead = locateElement("xpath", "//a[text()='Delete']");
	click(DeleteLead);
	WebElement FindLeads2 = locateElement("linktext", "Find Leads");
	click(FindLeads2);
	WebElement LeadId = locateElement("xpath", "//input[@name='id']");
	type(LeadId,fromid);
	WebElement FindLeadsBtn2 = locateElement("xpath", "//button[text()='Find Leads']");
	click(FindLeadsBtn2);
	WebElement chkerrmsg = locateElement("xpath", "//div[text()='No records to display']");
	verifyExactText(chkerrmsg,"No records to display");
	//closeBrowser();
}
}