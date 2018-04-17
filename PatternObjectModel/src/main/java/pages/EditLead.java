package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	
	public EditLead() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleEditCompName;
	
	public EditLead editCompName(String data) {
	type(eleEditCompName,data);
		
	return this;
		
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleupdatebtn;
	
	public ViewLead editUpdateBtn() {
	click(eleupdatebtn);
			
	return new ViewLead();
		
	}

}
