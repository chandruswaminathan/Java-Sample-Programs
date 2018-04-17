package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Edit an existing lead and verify";
		testNodes="EditLead";
		category="Sanity";
		authors="Chandru";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String Uname,String pwd,String fname,String cname) {
		
		new LoginPage()
		.enterUserName(Uname)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.leadsLink()
		.editlead()
		.enterfirstname(fname)
		.searchbtn()
		.resultfirst()
		.clickeditBtn()
		.editCompName(cname)
		.editUpdateBtn()
		.verifynewname(cname);
	}

}
