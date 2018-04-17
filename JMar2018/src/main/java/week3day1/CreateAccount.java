package week3day1;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import week2day2.ProjectMethods;

public class CreateAccount extends ProjectMethods {
	@Test
	public void main() {
		//login();
		WebElement Accounts = locateElement("xpath", "//a[text()='Accounts']");
		click(Accounts);
		WebElement CreateAccounts = locateElement("xpath", "//a[text()='Create Account']");
		click(CreateAccounts);
		WebElement Accountname = locateElement("xpath", "//input[@id='accountName']");
		type(Accountname,"Savings11");
		WebElement Industryname = locateElement("xpath", "//select[@name='industryEnumId']");
		selectDropDownUsingText(Industryname,"Computer Software");
		WebElement PrefferedCurrency = locateElement("xpath", "//select[@id='currencyUomId']");
		selectDropDownUsingText(PrefferedCurrency,"INR - Indian Rupee");
		WebElement Source = locateElement("xpath", "//select[@id='dataSourceId']");
		selectDropDownUsingText(Source,"Partner");
		WebElement Market = locateElement("xpath", "//select[@id='marketingCampaignId']");
		selectDropDownUsingText(Market,"Automobile");
		WebElement PhoneNumber = locateElement("xpath", "//input[@id='primaryPhoneNumber']");
		type(PhoneNumber,"9780000094");
		WebElement Email = locateElement("xpath", "//input[@id='primaryEmail']");
		type(Email,"chandru@gmail.com");
		WebElement Country = locateElement("xpath", "//select[@id='generalCountryGeoId']");
		selectDropDownUsingText(Country,"India");
		WebElement State = locateElement("xpath", "//select[@id='generalStateProvinceGeoId']");
		selectDropDownUsingText(State,"TAMILNADU");
		WebElement City = locateElement("xpath", "//input[@id='generalCity']");
		type(City,"Chennai");
		WebElement CreateAccountBtn = locateElement("xpath", "//input[@class='smallSubmit']");
		click(CreateAccountBtn);
		WebElement AccountId= locateElement("xpath","(//td[@class='titleCell']/following::span[@class='tabletext'])[1]");
		String text =getText(AccountId, "");
		System.out.println(text);
		String id = text.substring(text.indexOf("(")+1,text.indexOf(")"));
		System.out.println(id);
		String name = text.substring(0, text.indexOf("("));
		System.out.println(name);
		WebElement FindAccounts = locateElement("xpath", "//a[text()='Find Accounts']");
		click(FindAccounts);
		WebElement Accountname1 = locateElement("xpath", "(//input[@name='accountName'])[2]");
		type(Accountname1,name);
		WebElement AccountId1 = locateElement("xpath", "//input[@name='id']");
		type(AccountId1,id);
		WebElement FindAccountsBtn = locateElement("xpath", "//button[text()='Find Accounts']");
		click(FindAccountsBtn);
		WebElement chkerrmsg = locateElement("xpath", "//div[text()='Displaying records 1 - 1 of 1']");
		verifyExactText(chkerrmsg,"Displaying records 1 - 1 of 1");
		//closeBrowser();
				
		
		
		
	}
}