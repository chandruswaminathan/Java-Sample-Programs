package day1.week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Week1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps");
		

	}

}
