package homeworkPack3;

import org.testng.annotations.Test;


import week2day2.ProjectMethods;
import org.openqa.selenium.WebElement;


public class MergeLead extends ProjectMethods {
	@Test(invocationCount=2)
	 public void mergeLead() throws InterruptedException {
			
			//login();
			WebElement MergeLeads = locateElement("linktext", "Merge Leads");
			click(MergeLeads);
			WebElement FromLead = locateElement("xpath", "//img[@src='/images/fieldlookup.gif'][1]");
			click(FromLead);
			switchToWindow(1);
			WebElement LeadId = locateElement("xpath", "//input[@name='id']");
			type(LeadId, "14");
			WebElement findLeadsBtn = locateElement("xpath", "//button[text()='Find Leads']");
			click(findLeadsBtn);
			WebElement ResultFirstLead = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
			wait(ResultFirstLead);
			WebElement text1=locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
			String fromid=getText(text1, "");
			System.out.println(fromid);
			clickwithoutsnap(ResultFirstLead);
			switchToWindow(0);
			WebElement ToLead = locateElement("xpath", "(//img[@src='/images/fieldlookup.gif'])[2]");
			click(ToLead);
			switchToWindow(1);
			WebElement ToLeadId = locateElement("xpath", "//input[@name='id']");
			type(ToLeadId, "15");
			WebElement TofindLeadsBtn = locateElement("xpath", "//button[text()='Find Leads']");
			click(TofindLeadsBtn);
			WebElement ToResultFirstLead = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
			wait(ToResultFirstLead);
			clickwithoutsnap(ToResultFirstLead);
			switchToWindow(0);
			WebElement Merge = locateElement("linktext", "Merge");
			clickwithoutsnap(Merge);
			acceptAlert();
			WebElement FindLeads = locateElement("linktext", "Find Leads");
			click(FindLeads);
			WebElement searchLead = locateElement("xpath", "//input[@name='id']");
			type(searchLead, fromid);
			WebElement click = locateElement("xpath", "//button[text()='Find Leads']");
			click(click);
			WebElement chkerrmsg = locateElement("xpath", "//div[text()='No records to display']");
			verifyExactText(chkerrmsg,"No records to display");
			//closeBrowser();
	}

}
