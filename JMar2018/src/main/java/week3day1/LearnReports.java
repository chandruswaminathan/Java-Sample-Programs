package week3day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReports {

	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter html= new ExtentHtmlReporter("./Reports/reports.html");
		html.setAppendExisting(true);
		ExtentReports report= new ExtentReports();
		report.attachReporter(html);
		ExtentTest test = report.createTest("TC001_CreateLead", "Create a Lead");
		test.assignAuthor("Chandru");
		test.assignCategory("Sanity");
		test.pass("Demo Sales Manager Entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.pass("crmsfa Entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		test.fail("Login Button is not clciked",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img3.png").build());
		report.flush();
		

	}

}
