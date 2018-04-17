package week3day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Draggable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		

	}

}
