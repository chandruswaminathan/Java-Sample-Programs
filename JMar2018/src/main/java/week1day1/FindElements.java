package week1day1;

import java.util.Collection;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		driver.findElementById("lst-ib").sendKeys("Chandru");
		driver.findElementById("lst-ib").submit();
		List<WebElement> coll = driver.findElementsByPartialLinkText("Chandru");
		WebElement findElementByCssSelector = driver.findElementByCssSelector("Chandru");
		System.out.println(coll.size());
		//driver.findElementsByTagName("a)
	}

}
