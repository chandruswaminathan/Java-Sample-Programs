package week1day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement dropdown1 = driver.findElementById("dropdown1");
		Select dd=new Select(dropdown1);
		List<WebElement> options = dd.getOptions();
		dd.selectByIndex(options.size()-1);
		WebElement dropdown2 = driver.findElementByName("dropdown2");
		Select dd2=new Select(dropdown2);
		List<WebElement> options2 = dd2.getOptions();
		dd2.selectByIndex(options2.size()-1);
		WebElement dropdown3 = driver.findElementById("dropdown3");
		Select dd3=new Select(dropdown3);
		List<WebElement> options3 = dd3.getOptions();
		dd3.selectByIndex(options3.size()-1);
		WebElement dropdown4 = driver.findElementByXPath("//select[@class='dropdown']");
		Select dd4=new Select(dropdown4);
		List<WebElement> options4 = dd4.getOptions();
		dd4.selectByIndex(options4.size()-1);
		driver.findElementByXPath("//div[@class='example'][5]/select").sendKeys("Loadrunner");
		driver.findElementByXPath("//div[@class='example'][6]/select").sendKeys("Loadrunner");
	}

}
