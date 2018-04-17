package week1day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxInteraction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		//driver.get("http://leafground.com/pages/checkbox.html");
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		driver.manage().window().maximize();
		WebElement checked = driver.findElementByXPath(("(//label[text()='Select the languages that you know?']//following::input[@type='checkbox'])[6]"));
		if(checked.isSelected())
		{
			checked.click();
		}
		
	}

}
