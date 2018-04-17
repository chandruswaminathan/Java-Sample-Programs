package week1day1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.utils.FileUtil;

public class AlertAndFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		String name="Chandru";
		driver.switchTo().alert().sendKeys(name);
		driver.switchTo().alert().accept();
		File src=driver.getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshots/Img.png");
		//FileUtils.copyFile(src, des);
		String result=driver.findElementByXPath("//p[@id='demo']").getText();
		if(result.contains(name))
			System.out.println("Success");
		else
			System.out.println("Fail");
	}

}
