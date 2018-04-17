package week2day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WindowHandles {

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
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("//img[@src='/images/fieldlookup.gif'][1]").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> arrayList=new ArrayList<String>();
		arrayList.addAll(windowHandles);
		driver.switchTo().window(arrayList.get(1));
		driver.findElementByXPath("//input[@name='id']").sendKeys("14");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		/*WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));*/
		String fromid=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").getText();
		System.out.println(fromid);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.switchTo().window(arrayList.get(0));
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> arrayList2=new ArrayList<String>();
		arrayList2.addAll(windowHandles2);
		driver.switchTo().window(arrayList2.get(1));
		driver.findElementByXPath("//input[@name='id']").sendKeys("14");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//WebDriverWait wait2 = new WebDriverWait(driver, 50);
		//wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.switchTo().window(arrayList.get(0));
		driver.findElementByLinkText("Merge").click();
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(fromid);
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
