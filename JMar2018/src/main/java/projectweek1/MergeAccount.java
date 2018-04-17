package projectweek1;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import week2day2.ProjectMethods;

public class MergeAccount extends ProjectMethods{
@Test
	public void main() {
		//login();
		WebElement Accounts = locateElement("xpath", "//a[text()='Accounts']");
		click(Accounts);
		WebElement MergeAccounts = locateElement("xpath", "//a[text()='Merge Accounts']");
		click(MergeAccounts);
		WebElement FromAccount = locateElement("xpath", "(//img[@alt='Lookup'])[1]");
		click(FromAccount);	
		switchToWindow(1);		
		WebElement FromAccId = locateElement("xpath", "//input[@name='id']");
		type(FromAccId, "14");
		WebElement findAccBtn = locateElement("xpath", "//button[text()='Find Accounts']");
		click(findAccBtn);
		WebElement ResultFirstAcc = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		wait(ResultFirstAcc);
		WebElement text1=locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		String fromid=getText(text1, "");
		System.out.println(fromid);
		clickwithoutsnap(ResultFirstAcc);
		switchToWindow(0);
		WebElement ToAccId = locateElement("xpath", "(//img[@alt='Lookup'])[2]");
		click(ToAccId);
		switchToWindow(1);
		WebElement ToId = locateElement("xpath", "//input[@name='id']");
		type(ToId, "15");
		WebElement ToAccBtn = locateElement("xpath", "//button[text()='Find Accounts']");
		click(ToAccBtn);
		WebElement ToResultFirstAcc = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		wait(ToResultFirstAcc);
		clickwithoutsnap(ToResultFirstAcc);
		switchToWindow(0);		
		WebElement Merge = locateElement("xpath", "(//a[text()='Merge'])[1]");
		clickwithoutsnap(Merge);		
		acceptAlert();
		WebElement FindAccounts = locateElement("xpath", "//a[text()='Find Accounts']");
		click(FindAccounts);
		WebElement AccountId2 = locateElement("xpath", "//input[@name='id']");
		type(AccountId2,fromid);
		WebElement FindAccountsBtn2 = locateElement("xpath", "//button[text()='Find Accounts']");
		click(FindAccountsBtn2);
		WebElement chkerrmsg = locateElement("xpath", "//div[text()='No records to display']");
		verifyExactText(chkerrmsg,"No records to display");
//		closeBrowser();
				

	}

}
