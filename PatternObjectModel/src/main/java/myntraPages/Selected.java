package myntraPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Selected extends ProjectMethods{
	
	public Selected() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//button[@class='pdp-add-to-bag pdp-button']")
	private WebElement addToBag;
	
	public GoToBag addToBag() {
		click(addToBag);
		return new GoToBag();
	}

}
