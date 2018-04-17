package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeMethods implements WdMethods{

	RemoteWebDriver driver = null;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("firefox")) {
				
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
			}
			//Maximize the browser
			driver.manage().window().maximize();
			//Load the URL
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The "+browser+" browser launched successfully");
			
		} 
		 catch (NullPointerException e) {
				System.out.println("Webdriver Exception occured");
				e.printStackTrace();
			}
		catch (WebDriverException e) {
			System.err.println("Webdriver Exception occured");
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}
	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		try {
			
			switch (locator) {
			case "id":
				ele = driver.findElementById(locValue);
				break;
			case "class":
				ele = driver.findElementByClassName(locValue);
				break;
			case "linktext":
				ele = driver.findElementByLinkText(locValue);
				break;
			case "name":
				ele = driver.findElementByName(locValue);
				break;
			case "xpath":
				ele = driver.findElementByXPath(locValue);
				break;
			
			}
			
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}
		 catch (Exception e) {
				System.err.println("Error occured during run time");
				//throw new RuntimeException();
			}
		
		return ele;
		
	}

	public WebElement locateElement(String locValue) {
		WebElement ele = null;
		ele=driver.findElementById(locValue);
		return ele;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("The given value is entered "+data);
			
		} catch (WebDriverException e) {
			throw new RuntimeException();
		}
		finally
		{
			takeSnap();
		}
	}
	
	public void typewithtab(WebElement ele, String data) {
		try {
			ele.sendKeys(data,Keys.TAB);
			System.out.println("The given value is entered "+data);
			
		} catch (WebDriverException e) {
			throw new RuntimeException();
			}
		finally {
			takeSnap();
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
			} 
		catch (StaleElementReferenceException e) {
			System.err.println("Element not present in DOM");
			throw new RuntimeException();
		}
		catch (Exception e) {
			throw new RuntimeException();
		}
		finally
		{
			takeSnap();
		}
	}
	
	public void uncheck(WebElement ele) {
		try {
			if(ele.isSelected())
				ele.click();
				
		} catch (WebDriverException e) {
			throw new RuntimeException();
			}
		finally {
			takeSnap();
		}
			
	}
	
	public void wait(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}
	}
	
	public void waitbyvisible(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(ele));
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}
	}
	
	public void clear(WebElement ele) {
		try {
			ele.clear();
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}
	}
	
	public void clickwithoutsnap(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}
		}

	public String getText(WebElement ele,String data) {
		try {
			data=ele.getText();
			
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}
		return data;
	}
	
	public String getTitle(String title) {
		try {
			title=driver.getTitle();
			
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}
		return title;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select dd=new Select(ele);
			dd.selectByVisibleText(value);
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			Select dd=new Select(ele);
			dd.selectByIndex(index);
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}

	}

	public boolean verifyTitle(String expectedTitle) {
		try {
			String title=driver.getTitle();
			System.out.println(title);
			if(title.equals(expectedTitle)) {
				System.out.println("Success");
			}
			else
				System.out.println("Fail");
			
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}
		return true;
	}
	public boolean verifyTitleByxpath(String actual,String expectedTitle) {
		try {
			if(actual.equals(expectedTitle)) {
				System.out.println("Success");
			}
			else
				System.out.println("Fail");
			
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}
		return true;
	}


	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			String actual=ele.getText();
			  Assert.assertEquals(actual, expectedText);
			  System.out.println("Error msg is valid");
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}


	}
	
	
	public void verifyPartialText(WebElement ele, String expectedText) {

		try {
			String check=ele.getText();
			if(check.contains(expectedText))
				System.out.println("Having Updated Name");
			else
				System.out.println("Not having Updated Name");
		}catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}

	}
	public void verifyPartialTextByXpath(String actual, String expectedText) {

		try {
			if(actual.contains(expectedText))
				System.out.println("Having Updated Name");
			else
				System.out.println("Not having Updated Name");
		}catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}

	}
	
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
	
		try {
			String check=ele.getAttribute(attribute);
			if(check.equals(value))
				System.out.println("Having exact value");
			else
				System.out.println("Not having exact value");
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			String check=ele.getAttribute(attribute);
			if(check.contains(value))
				System.out.println("Having partial value");
			else
				System.out.println("Not having partial value");
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}

	

	}

	public void verifySelected(WebElement ele) {
		try {
			if(ele.isSelected())
				System.out.println("Selected");
			else
				System.out.println("Not Selected");
		}  catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}

	}

	public void verifyDisplayed(WebElement ele) {
		try {
			if(ele.isDisplayed())
				System.out.println("Displayed");
			else
				System.out.println("Not Displayed");
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}

	}

	public void switchToWindow(int index) {
		
				  try {
					  Set<String> allWindows = driver.getWindowHandles();
					  List<String> eachWindow = new ArrayList<String>();
					  eachWindow.addAll(allWindows);
					driver.switchTo().window(eachWindow.get(index));
					//driver.switchTo().window(arrayList.get(arrayList.size()-1));
				} catch (NoSuchWindowException e) {
					System.err.println("Window not found");
					throw new RuntimeException();
				}
				  
		  	}
	
	public List<String> getWindow() {
		List<String> arrayList=new ArrayList<String>();
		try {
			Set<String> windowHandles = driver.getWindowHandles();
			  
			  arrayList.addAll(windowHandles);
			  
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}
		return arrayList;

	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
		} catch (NoSuchFrameException e) {
			System.err.println("Frame not available");
		}

	}
	
	public List<WebElement> rows(WebElement ele,String row,String column) {
		List<WebElement> rows = ele.findElements(By.tagName(row));
		try {
			
			int i;
			for(i=0;i<rows.size();i++)
			{
			List<WebElement> columns = rows.get(i).findElements(By.tagName(column));
			System.out.println(columns.get(1).getText());
			}
			
		} catch (NotFoundException e) {
			System.err.println("Element Not Found");
			throw new RuntimeException();
		}
		
		return rows;
		}
	
	
	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			System.err.println("Alert not found");
			}
			}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException e) {
			System.err.println("Alert not found");
			}
			}
	
	public String getAlertText() {
		String alerttext=null;
		try {
			alerttext=driver.switchTo().alert().getText();
		} catch (NoAlertPresentException e) {
			System.err.println("Alert not found");
			}
		return alerttext;
		
	}

	int i =1;
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		driver.close();

	}

	public void closeAllBrowsers() {
		driver.quit();

	}


	

}
