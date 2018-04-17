package projectweek1;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import week2day2.ProjectMethods;

public class DeactivateAccount extends ProjectMethods{
	@Test
	public void main() {
		// TODO Auto-generated method stub
		//login();
		WebElement Accounts = locateElement("xpath", "//a[text()='Accounts']");
		click(Accounts);
		WebElement FindAccounts = locateElement("xpath", "//a[text()='Find Accounts']");
		click(FindAccounts);
		WebElement Accountname = locateElement("xpath", "(//input[@name='accountName'])[2]");
		type(Accountname,"te");
		WebElement AccountId = locateElement("xpath", "//input[@name='id']");
		type(AccountId,"10");
		WebElement FindAccountsBtn = locateElement("xpath", "//button[text()='Find Accounts']");
		click(FindAccountsBtn);
		WebElement AccountName = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-groupName'])[1]/a");
		wait(AccountName);
		String accountname=getText(AccountName, "");
		WebElement FirstId = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		wait(FirstId);
		String accountID=getText(FirstId, "");
		clickwithoutsnap(FirstId);
		verifyTitle("Account Details | opentaps CRM");
		WebElement DeactivateAccount = locateElement("xpath", "//a[text()='Deactivate Account']");
		clickwithoutsnap(DeactivateAccount);
		getAlertText();
		acceptAlert();
		WebElement successMsg = locateElement("xpath", "//span[text()[contains(.,'This account was deactivated')]]");
		String verifyMsg=getText(successMsg, "");
		verifyPartialTextByXpath(verifyMsg,"This account was deactivated");
		WebElement FindAccounts2 = locateElement("xpath", "//a[text()='Find Accounts']");
		click(FindAccounts2);
		WebElement Accountname2 = locateElement("xpath", "(//input[@name='accountName'])[2]");
		type(Accountname2,accountname);
		WebElement AccountId2 = locateElement("xpath", "//input[@name='id']");
		type(AccountId2,accountID);
		WebElement FindAccountsBtn2 = locateElement("xpath", "//button[text()='Find Accounts']");
		click(FindAccountsBtn2);
		WebElement chkerrmsg = locateElement("xpath", "//div[text()='No records to display']");
		verifyExactText(chkerrmsg,"No records to display");
//		closeBrowser();

	}

}
