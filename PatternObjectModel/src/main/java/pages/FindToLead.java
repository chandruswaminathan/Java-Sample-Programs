package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindToLead extends ProjectMethods {
	
	public FindToLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eletoLeadId;
	
	//@And("click on CreateLead")
	public FindToLead toleadid(String data) {
		type(eletoLeadId,data);
		
		return this;

}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elefromLeadSearchBtn;
	
	//@And("click on CreateLead")
	public FindToLead toleadbtn() {
		click(elefromLeadSearchBtn);
		
		return this;

}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleresultfirstlead;
	
	//@And("click on CreateLead")
	public MergeLeads resulttofirstlead() {
		click(eleresultfirstlead);
		switchToWindow(0);
		return new MergeLeads();

}
	
	
}
