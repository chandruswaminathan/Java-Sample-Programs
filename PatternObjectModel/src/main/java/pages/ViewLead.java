package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods {
	
	public ViewLead() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleFirstName;
	
	public ViewLead verifyText(String data) {
		verifyExactText(eleFirstName, data);
		return this;
		
	}
	
		
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleclickeditbtn;
	
	public EditLead clickeditBtn() {
		click(eleclickeditbtn);
		return new EditLead();
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement elefindlead;
	
	public FindLeads findLead() {
		click(elefindlead);
		return new FindLeads();
		
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement elenewcompname;
	
	public ViewLead verifynewname(String data) {
		verifyPartialText(elenewcompname, data);
		return this;
		
	}
	
	

}
