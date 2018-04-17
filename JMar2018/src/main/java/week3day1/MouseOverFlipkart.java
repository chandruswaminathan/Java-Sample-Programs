package week3day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOverFlipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[text()='✕']").click();
		WebElement tv = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement mi = driver.findElementByXPath("//span[text()='Mi LED Smart TVs']");
		Actions builder=new Actions(driver);
		builder.moveToElement(tv).perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(mi));
		builder.click(mi).perform();
		

	}

}
