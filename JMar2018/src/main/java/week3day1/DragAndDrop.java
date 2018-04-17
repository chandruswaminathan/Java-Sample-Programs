package week3day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement drag = driver.findElementById("draggable");
		int x = item3.getLocation().getX();
		int y = item3.getLocation().getY();
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(item1, x, y).perform();
		int x2 = drag.getLocation().getX();
		int y2 = drag.getLocation().getY();
		builder.clickAndHold(drag).dragAndDropBy(drag, x2+50, y2+50);
		//builder.sendKeys(Keys.CONTROL).click(item1).click(item3).perform();
		//builder.click(item1).perform();
		//builder.clickAndHold(item1).dragAndDropBy(item3, 0, y).perform();

	}

}
