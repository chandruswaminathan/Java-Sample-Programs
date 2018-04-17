package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_MergeLead";
		testDescription="Merge two leads and verify";
		testNodes="MergeLead";
		category="Sanity";
		authors="Chandru";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String Uname,String pwd,String fromleadid,String toleadid,String actual) {
		
		new LoginPage()
		.enterUserName(Uname)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.leadsLink()
		.mergelead()
		.fromlead()
		.fromleadid(fromleadid)
		.fromleadbtn()
		.resultfromfirstlead()
		.tolead()
		.toleadid(toleadid)
		.toleadbtn()
		.resulttofirstlead()
		.mergelink()
		.findLead()
		.enterleadid(fromleadid)
		.searchbtn()
		.resultfirst()
		.verifyText(actual);
		
		
		
	}

}
