package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class FindLeads extends SeMethods {
	
	public FindLeads() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how=How.XPATH,using="//label[text()='Lead ID:']/following::input[2]")
	private WebElement eleFirstName;
	
	public FindLeads enterfirstname(String data) {
	type(eleFirstName,data);
		
	return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleleadid;
	
	public FindLeads enterleadid(String data) {
	type(eleleadid,data);
		
	return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elesearchbtn;
	
	public FindLeads searchbtn() {
	click(elesearchbtn);
		
	return this;
	
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleresultfirst;
	
	public ViewLead resultfirst() {
	click(eleresultfirst);
		
	return new ViewLead();
	
	}

}
