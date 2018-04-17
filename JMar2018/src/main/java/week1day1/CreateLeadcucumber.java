package week1day1;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import week2day2.ProjectMethods;

public class CreateLeadcucumber {
		public static ChromeDriver driver; 
	 
		@Before
		public void before(Scenario sc) {
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			
		}
		
		
	@And("Enter the username  (.*)")
	public void enterusername(String uname) {
		driver.findElementById("username").sendKeys(uname);
	}
	
	@And("Enter the password as (.*)")
	public void enterpassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}
	
	@When("click on login")
	public void clicklogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("verify login is success")
	public void verifylogin() {
		System.out.println("Login Success");
	}
	
	@And("click on crmsfa")
	public void clickoncrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("click on Leads")
	public void clickonleads() {
		driver.findElementByLinkText("Leads").click();
	}
	
	@And("click on CreateLead")
	public void clickoncreatelead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("enter company name as (.*)")
	public void entercompanyname(String compname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(compname);
	}
		
		
	@And("enter first name as (.*)")
	public void enterfirstname(String FirstName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(FirstName);
		}
	
	@And("enter last name as (.*)")
	public void enterlastname(String LastName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(LastName);
		}
	
	@And("enter click submit button")
	public void clicksubmit() {
		driver.findElementByName("submitButton").click();
		}
		
	@After
	public void closebrowser() {
		driver.close();
	}
		
	}
		
	

