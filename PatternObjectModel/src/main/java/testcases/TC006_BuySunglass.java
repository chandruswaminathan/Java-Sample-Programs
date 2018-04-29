package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import myntraPages.MyntraHome;
import wdMethods.ProjectMethods;

public class TC006_BuySunglass extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC006_BuySunglass";
		testDescription="Buy sunglasses in Myntra";
		testNodes="Myntra";
		category="Sanity";
		authors="Chandru";
		browserName="chrome";
	}
	
	@Test
	public void login() {
		new MyntraHome()
		.enterSearch("bags")
		.brandName("//div[@class='product-brand']")
		.uniSex("//div[@class='product-productMetaInfo']")
		.clickGreen()
		.clickSecond()
		.addToBag()
		.goToBag();
		
	}
		

}
