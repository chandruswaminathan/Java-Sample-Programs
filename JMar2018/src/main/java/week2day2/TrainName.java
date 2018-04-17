package week2day2;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class TrainName extends SeMethods {
	@Test
	public void main() {
		
		startApp("chrome", "https://erail.in/");
		WebElement fromtrain = locateElement("id", "txtStationFrom");
		clear(fromtrain);
		typewithtab(fromtrain, "mas");
		WebElement totrain = locateElement("id", "txtStationTo");
		clear(totrain);
		typewithtab(totrain, "cbe");
		WebElement checkbox = locateElement("id", "chkSelectDateOnly");
		uncheck(checkbox);
		WebElement table = locateElement("xpath", "//table[@class='DataTable TrainList']");
		rows(table,"tr","td");
		

	}

}
