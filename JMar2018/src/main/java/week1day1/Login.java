package week1day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		//WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[2]").sendKeys("f");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		String title=driver.getTitle();
		System.out.println(title);
		String expected_title="View Lead | opentaps CRM";
		Assert.assertEquals(title, expected_title);
		System.out.println("Success");
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("NewTestLeaf");
		driver.findElementByName("submitButton").click();
		WebElement updated = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']");
		String check=updated.getText();
		String newname="NewTestLeaf";
		System.out.println(check);
		if(check.contains(newname))
		System.out.println("Having updated name");
		Thread.sleep(5000);
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("98");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		WebElement firstid = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		String id=firstid.getText();
		System.out.println(id);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.findElementByXPath("//a[text()='Delete']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(id);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		WebElement result = driver.findElementByXPath("//div[text()='No records to display']");
		String actual=result.getText();
		String errmsg="No records to display";
		Assert.assertEquals(actual, errmsg);
		System.out.println("Error msg is valid");
		driver.close();
		
	}

}
