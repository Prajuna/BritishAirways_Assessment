package com.BritishAirways.Utilities;
import java.io.File;
import java.io.IOException;
import org.testng.TestListenerAdapter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Reporting extends TestListenerAdapter {
		
		public static ExtentReports extent;
		public static ExtentSparkReporter spark ;
	   
		public static void setExtent() throws IOException
		{
			extent=new ExtentReports();
			// directory where output is to be generated
			 spark = new ExtentSparkReporter("extent_report.html");
			// Loading the configuration file
			final File CONF=new File("extent-config.xml");
			spark.loadXMLConfig(CONF);
			
			extent.attachReporter(spark);
			
			ExtentTest test= extent.createTest("Launching app").assignAuthor("Prajuna").assignCategory("Test").assignDevice("Chrome");
			test.pass("Web App launched successfully");
			test.info("URL is loaded");
		
			
		}
			public static void endReport() {
			extent.flush();//Report will be generated only if enter extent.flush command
			}

		
		
	}

