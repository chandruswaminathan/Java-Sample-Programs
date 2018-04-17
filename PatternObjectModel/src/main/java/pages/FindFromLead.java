package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindFromLead extends ProjectMethods {
	
	public FindFromLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement elefromLeadId;
	
	//@And("click on CreateLead")
	public FindFromLead fromleadid(String data) {
		type(elefromLeadId,data);
		
		return this;

}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elefromLeadSearchBtn;
	
	//@And("click on CreateLead")
	public FindFromLead fromleadbtn() {
		click(elefromLeadSearchBtn);
		
		return this;

}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleresultfirstlead;
	
	//@And("click on CreateLead")
	public MergeLeads resultfromfirstlead() {
		click(eleresultfirstlead);
		switchToWindow(0);
		return new MergeLeads();

}
	
	
}
