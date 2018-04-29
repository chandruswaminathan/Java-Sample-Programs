package myntraPages;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import pages.HomePage;
import wdMethods.ProjectMethods;

public class Sunglasses extends ProjectMethods {
	
	public Sunglasses() {
		PageFactory.initElements(driver,this);
	}
	
		
	public Sunglasses brandName(String data) {
	List<WebElement> brand = driver.findElementsByXPath(data);
	Set<String> Uniquebrand = new TreeSet<String>();
	for (WebElement brands : brand) {		
		Uniquebrand.add(brands.getText());
	}
	for (String string : Uniquebrand) {
		System.out.println(string);
	}
		return this;
	}
	
	public Sunglasses uniSex(String data)
	{

		List<WebElement> discount = driver.findElementsByXPath("//div[@class='product-productMetaInfo']");
		int count=0;
		for (WebElement price : discount) {
			if(price.getText().contains("(40% OFF)") && price.getText().contains("Unisex"))
				count++;	
			
		}
		System.out.println(count);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//li[@data-colorhex='green']")
	private WebElement eleClickGreen;
	
	public Sunglasses clickGreen() {
		click(eleClickGreen);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="(//img[@class='product-thumb'])[2]")
	private WebElement eleClickSecond;
	
	public Selected clickSecond() {
		click(eleClickSecond);
		return new Selected();		
	}

}
