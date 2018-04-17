package week3day1;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class IDFCPortal extends SeMethods{
@Test
	public  void main() throws InterruptedException {
	
		startApp("chrome", "https://idfcupitest.fssnet.co.in:4433/idfcupiuatportal/login");
		WebElement uName = locateElement("id", "j_username");
		type(uName, "idfcoprmak");
		WebElement passwd = locateElement("id", "password");
		type(passwd, "Super@12");
		Thread.sleep(1000);
		WebElement submit = locateElement("id", "loginBtn");
		waitbyvisible(submit);
		click(submit);
		WebElement MerchantProfile = locateElement("xpath", "//img[@src='/idfcupiuatportal/images/complaints.png']");
		click(MerchantProfile);
		WebElement AddBtn = locateElement("id", "addbtn");
		click(AddBtn);
		WebElement MerchantHierarchy = locateElement("id", "merchantHierarchy");
		selectDropDownUsingText(MerchantHierarchy,"Merchant");
		WebElement SuperMerchant = locateElement("id", "superMerchant");
		selectDropDownUsingText(SuperMerchant,"145145-Naga Satyam");
		WebElement MerchantId = locateElement("id", "merchantId");
		type(MerchantId, "1230789");
		WebElement MerchantName = locateElement("id", "registeredName");
		type(MerchantName, "IdfcMerc");
		WebElement MobileNo = locateElement("id", "mobileNo");
		type(MobileNo, "9000000000");
		WebElement IncomingAccNo = locateElement("id", "incomingAccount");
		type(IncomingAccNo, "10000022166");
		WebElement OutgoingAccNo = locateElement("id", "outgoingAccount");
		type(OutgoingAccNo, "10000022166");
		WebElement MerchantType = locateElement("id", "merchantType");
		selectDropDownUsingText(MerchantType,"Merchant SDK");
		WebElement vpa = locateElement("id", "vpa");
		type(vpa, "uatidfcmerc");
		WebElement LimitProfile = locateElement("id", "limitProfile");
		selectDropDownUsingText(LimitProfile,"Merchant Limit Profile");
		WebElement FeeProfile = locateElement("id", "feeProfile");
		selectDropDownUsingText(FeeProfile,"TestTxnFee");
		WebElement WebsiteAddr = locateElement("id", "webAddress");
		type(WebsiteAddr, "www.idfb.com");
		WebElement Address1 = locateElement("id", "address1");
		type(Address1, "N0124");
		WebElement Address2 = locateElement("id", "address2");
		type(Address2, "Bank Street");
		WebElement Address3 = locateElement("id", "address3");
		type(Address3, "Near to temple");
		WebElement City = locateElement("id", "city");
		type(City, "Chennai");
		WebElement State = locateElement("id", "state");
		type(State, "Tamilnadu");
		WebElement Country = locateElement("id", "country");
		type(Country, "India");
		WebElement ZipCode = locateElement("id", "zipcode");
		type(ZipCode, "603103");
		WebElement EmailId = locateElement("id", "emailId");
		type(EmailId, "abc@xyz.com");
		WebElement Remarks = locateElement("id", "remarks");
		type(Remarks, "Chennai");
		WebElement CommissionAccNo = locateElement("id", "commissionAccount");
		type(CommissionAccNo, "1000002216");
		WebElement WhiteListFlagYes = locateElement("id", "whilelistFlag1");
		click(WhiteListFlagYes);
		WebElement ScanandPayYes = locateElement("id", "scanPay1");
		click(ScanandPayYes);
		WebElement OnlineMDRYes = locateElement("id", "mdrCalc1");
		click(OnlineMDRYes);
		WebElement WebCollectYes = locateElement("id", "webcollect1");
		click(WebCollectYes);
		WebElement WebCollectTimeout = locateElement("id", "webcollectTimeOut");
		type(WebCollectTimeout, "120");
		WebElement MerchantStatusURL = locateElement("id", "mercStatusURL");
		type(MerchantStatusURL, "http://example.co.in");
		WebElement MerchantCollectNotify = locateElement("id", "mercNotifyURL");
		type(MerchantCollectNotify, "http://example2.co.in");
		WebElement AllowedChannels = locateElement("id", "deliveryChannelList");
		selectDropDownUsingText(AllowedChannels,"MCOMMERCE");
		WebElement MoveToRight = locateElement("xpath", "(//input[@value='>>'])[1]");
		click(MoveToRight);
		WebElement TransactionType = locateElement("id", "txnTypeList");
		selectDropDownUsingText(TransactionType,"SendMoney");
		WebElement MoveToRight2 = locateElement("xpath", "(//input[@value='>>'])[2]");
		click(MoveToRight2);
		WebElement Save = locateElement("id", "createCont");
		clickwithoutsnap(Save);
		acceptAlert();
		WebElement Logout = locateElement("class", "textlink1");
		click(Logout);
		closeBrowser();
	}

}
