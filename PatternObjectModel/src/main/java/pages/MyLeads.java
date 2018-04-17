package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods {
	
	public MyLeads() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLeadLink;
	
	@And("click the CreateLead")
	public CreateLead myLeads() {
		click(eleCreateLeadLink);
		return new CreateLead();

	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeadLink;
	public FindLeads editlead() {
		click(eleFindLeadLink);
		return new FindLeads();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLeadLink;
	public MergeLeads mergelead() {
		click(eleMergeLeadLink);
		return new MergeLeads();
	}

}
