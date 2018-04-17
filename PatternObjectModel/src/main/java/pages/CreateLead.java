package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompName;
	
	@And("enter compname as (.*)")
	public CreateLead enterCompName(String data) {
		type(eleCompName, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	@And("enter firstname as (.*)")
	public CreateLead enterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	@And("enter lastname as (.*)")
	public CreateLead enterLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmit;
	
	@And("click submit button")
	public ViewLead clickSubmit() {
		click(eleSubmit);
		return new ViewLead();		
	}

}
