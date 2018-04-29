package week9day1;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver =new ChromeDriver(option);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@class='desktop-searchBar']").sendKeys("Sunglasses",Keys.ENTER);
		List<WebElement> brand = driver.findElementsByXPath("//div[@class='product-brand']");
		
		Set<String> Uniquebrand = new TreeSet<String>();
		
		
	
		for (WebElement brands : brand) {
			
			Uniquebrand.add(brands.getText());
			
			
		}
		for (String string : Uniquebrand) {
			System.out.println(string);
		}
		
		
		
		List<WebElement> discount = driver.findElementsByXPath("//div[@class='product-productMetaInfo']");
		System.out.println("*************");
		int count=0;
		for (WebElement price : discount) {
			if(price.getText().contains("(40% OFF)") && price.getText().contains("Unisex"))
				count++;	
			
		}
		System.out.println(count);
		driver.findElementByXPath("//li[@data-colorhex='green']").click();
		String name = driver.findElementByXPath("((//img[@class='product-thumb'])[2])/following-sibling::div//div").getText();
		System.out.println(name);
		String actualprice = driver.findElementByXPath("(//span[@class='product-discountedPrice'])[2]").getText();
		System.out.println(actualprice);
		driver.findElementByXPath("(//img[@class='product-thumb'])[2]").click();
		driver.findElementByXPath("//button[@class='pdp-add-to-bag pdp-button']").click();
		//driver.findElementByXPath("//span[@class='myntraweb-sprite pdp-whiteRightArrow sprites-whiteRightArrow']").click();
		driver.findElementByXPath("//span[@class='myntraweb-sprite desktop-iconBag sprites-bag']").click();
		String check = driver.findElementByLinkText("Ray-Ban Men Aviator Sunglasses 0RB4285601/9A55").getText();
		System.out.println(check);
		String amount = driver.findElementByXPath("//div[@class='c-dblue total-rupees']").getText();
		amount=amount.replaceAll("[,]", "");
		System.out.println(amount);
		if(check.contains(name) && actualprice.contains(amount))
		{
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
		}
	
	

}
