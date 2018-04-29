package myntraPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class GoToBag extends ProjectMethods{
	
	public GoToBag() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//span[@class='myntraweb-sprite desktop-iconBag sprites-bag']")
	private WebElement goToBag;
	
	public GoToBag goToBag() {
		click(goToBag);
		return this;
	}

}
