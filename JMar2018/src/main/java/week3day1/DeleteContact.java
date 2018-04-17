package week3day1;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import week2day2.ProjectMethods;

public class DeleteContact extends ProjectMethods{
@Test
	public void main() {
	//login();
	WebElement Accounts = locateElement("xpath", "//a[text()='Accounts']");
	click(Accounts);
	WebElement FindAccounts = locateElement("xpath", "//a[text()='Find Accounts']");
	click(FindAccounts);
	WebElement PhoneTab = locateElement("xpath", "//span[text()='Phone']");
	click(PhoneTab);
	WebElement PhoenNo = locateElement("xpath", "//input[@name='phoneNumber']");
	type(PhoenNo,"9");
	WebElement FindAccountsBtn = locateElement("xpath", "//button[text()='Find Accounts']");
	click(FindAccountsBtn);
	WebElement ResultFirstAcc = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
	wait(ResultFirstAcc);
	String firstresultId=getText(ResultFirstAcc, " ");
	System.out.println(firstresultId);
	click(ResultFirstAcc);
	WebElement DeleteEmail = locateElement("xpath", "//img[@alt='Expire']");
	click(DeleteEmail);
	WebElement DeletePhone = locateElement("xpath", "//img[@alt='Expire']");
	click(DeletePhone);
	WebElement FindAccounts2 = locateElement("xpath", "//a[text()='Find Accounts']");
	click(FindAccounts2);
	WebElement AccountId = locateElement("xpath", "//input[@name='id']");
	type(AccountId,firstresultId);
	WebElement FindAccountsBtn2 = locateElement("xpath", "//button[text()='Find Accounts']");
	click(FindAccountsBtn2);
	WebElement ResultFirstAcc2 = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
	wait(ResultFirstAcc2);
	click(ResultFirstAcc2);
	WebElement text1=locateElement("xpath","//div[text()='No contact information on file']");
	String actual=getText(text1, "");
	String expected="No contact information on file";
	System.out.println(actual);
	verifyPartialText(text1,expected);
	//closeBrowser();
	
	}

}
