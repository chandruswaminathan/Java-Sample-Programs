package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods {
	
	public MergeLeads() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//img[@src='/images/fieldlookup.gif'][1]")
	private WebElement elefromLeadLink;
	
	//@And("click on CreateLead")
	public FindFromLead fromlead() {
		click(elefromLeadLink);
		switchToWindow(1);
		
		return new FindFromLead();

	}
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eletoLeadLink;
	
	//@And("click on CreateLead")
	public FindToLead tolead() {
		click(eletoLeadLink);
		switchToWindow(1);
		
		return new FindToLead();

	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement elemergeLink;
	
	//@And("click on CreateLead")
	public ViewLead mergelink() {
		clickWithNoSnap(elemergeLink);
		acceptAlert();
		
		return new ViewLead();

	}

}
