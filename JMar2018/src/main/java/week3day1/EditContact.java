package week3day1;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import week2day2.ProjectMethods;

public class EditContact extends ProjectMethods{
@Test
	public  void main() {
		//login();
		WebElement Accounts = locateElement("xpath", "//a[text()='Accounts']");
		click(Accounts);
		WebElement FindAccounts = locateElement("xpath", "//a[text()='Find Accounts']");
		click(FindAccounts);
		WebElement AccountId = locateElement("xpath", "//input[@name='id']");
		type(AccountId,"10");
		WebElement AccountName = locateElement("xpath", "(//input[@name='accountName'])[2]");
		type(AccountName,"te");
		WebElement FindAccountsBtn = locateElement("xpath", "//button[text()='Find Accounts']");
		click(FindAccountsBtn);
		WebElement ResultFirstAcc = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		wait(ResultFirstAcc);
		click(ResultFirstAcc);
		verifyTitle("Account Details | opentaps CRM");
		WebElement Edit = locateElement("xpath", "//a[text()='Edit']");
		click(Edit);
		WebElement CompName = locateElement("id", "accountName");
		clear(CompName);
		String NewName="FSS";
		type(CompName, NewName);
		WebElement Save = locateElement("xpath", "//input[@value='Save']");
		click(Save);
		WebElement text1=locateElement("xpath","(//span[text()='Account Name']//following::span[@class='tabletext'])[1]");
		String UpdatedName=getText(text1, "");
		String id = UpdatedName.substring(UpdatedName.indexOf("(")+1,UpdatedName.indexOf(")"));
		System.out.println(id);
		String name = UpdatedName.substring(0, UpdatedName.indexOf("("));
		//name.substring(0, UpdatedName.indexOf("("));
		System.out.println(name);
		//System.out.println(id);
		System.out.println(UpdatedName);
		verifyPartialText(text1,NewName);
		//closeBrowser();
	}

}
