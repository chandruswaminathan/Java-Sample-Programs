package week2day2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods{
	@Parameters({"url","username","passwd"})
	@BeforeMethod()
	public void login(String url,String username,String passwd)
	{
		startApp("chrome", url);
		WebElement uName = locateElement("id", "username");
		type(uName, username);
		WebElement Passwd = locateElement("id", "password");
		type(Passwd, passwd);
		WebElement Login = locateElement("class", "decorativeSubmit");
		click(Login);
		WebElement CRMSFA = locateElement("xpath", "(//div/following::a)[2]");
		click(CRMSFA);
		WebElement Leads = locateElement("linktext", "Leads");
		click(Leads);
	}
	
@AfterMethod()
	public void closebrowser()
	{
		closeBrowser();
	}
	
}
