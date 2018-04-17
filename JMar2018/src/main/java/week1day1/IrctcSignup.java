package week1day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32bit.exe");
		//FirefoxDriver driver=new FirefoxDriver();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.findElementById("userRegistrationForm:userName").sendKeys("seleniumtest");
		driver.findElementByLinkText("Check Availability").click();;
		driver.findElementById("userRegistrationForm:password").sendKeys("Test1234");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Test1234");
		WebElement securityQ = driver.findElementById("userRegistrationForm:securityQ");
		Select dd=new Select(securityQ);
		dd.selectByVisibleText("Who was your Childhood hero?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Ajith");
		WebElement language = driver.findElementById("userRegistrationForm:prelan");
		Select dd1=new Select(language);
		dd1.selectByValue("en");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Selenium");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Test");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Leaf");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		WebElement day = driver.findElementById("userRegistrationForm:dobDay");
		Select dd2=new Select(day);
		dd2.selectByIndex(9);
		//dd2.selectByValue("02");
		WebElement month = driver.findElementById("userRegistrationForm:dobMonth");
		Select dd3=new Select(month);
		dd3.selectByIndex(9);
		WebElement year = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dd4=new Select(year);
		dd4.selectByVisibleText("1990");
		WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
		Select dd5=new Select(occupation);
		dd5.selectByVisibleText("Private");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("123456789012");
		driver.findElementById("userRegistrationForm:idno").sendKeys("sdfgz6542f");
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select dd6=new Select(country);
		dd6.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("test@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("23454644979");
		WebElement nationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select dd7=new Select(nationality);
		dd7.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("120");
		driver.findElementById("userRegistrationForm:street").sendKeys("xyz");
		driver.findElementById("userRegistrationForm:area").sendKeys("abc");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("603103",Keys.TAB);
		Thread.sleep(2000);
		WebElement cityname = driver.findElementById("userRegistrationForm:cityName");
		Select dd8=new Select(cityname);
		dd8.selectByValue("Kanchipuram");
		Thread.sleep(2000);
		WebElement postoffice = driver.findElementById("userRegistrationForm:postofficeName");
		Select dd9=new Select(postoffice);
		dd9.selectByVisibleText("Pudupakkam B.O");
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("6547952223");
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		
		

	}

}
