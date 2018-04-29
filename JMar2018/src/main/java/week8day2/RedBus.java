package week8day2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver =new ChromeDriver(option);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElementById("src").sendKeys("Chennai",Keys.ENTER);
		driver.findElementById("dest").sendKeys("Bangalore",Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElementByXPath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[1]").click();
		//driver.findElementByXPath("//label[@class='db text-trans-uc']").click();
		WebElement dateTable = driver.findElementById("rb-calendar_onward_cal");
		List<WebElement> columns = dateTable.findElements(By.tagName("td"));
		for(WebElement currdate:columns)
		{
			
			if(currdate.getText()=="23")
				currdate.findElement(By.className("current day")).click();
			break;
		}
		/*driver.findElementByXPath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//td[@class='current day'])[1]").click();
		driver.findElementById("search_btn").click();*/
		
		}
		
		

	}


