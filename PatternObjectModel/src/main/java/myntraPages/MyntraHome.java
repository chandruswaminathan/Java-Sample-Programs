package myntraPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import pages.CreateLead;
import wdMethods.ProjectMethods;

public class MyntraHome extends ProjectMethods{
	public MyntraHome() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.XPATH,using="//input[@class='desktop-searchBar']")
	private WebElement eleSearch;
	
	
	public Sunglasses enterSearch(String data) {
		typewithEnter(eleSearch, data);
		return new Sunglasses();
	}
	

}
