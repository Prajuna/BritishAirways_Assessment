package com.BritishAirways.testcases;
import org.apache.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.BritishAirways.Utilities.ReadConfig;

public class BaseClass {

		ReadConfig readconfig=new ReadConfig();
		public String baseURL=readconfig.getApplicationurl();
		public static WebDriver driver;
		public static Logger logger;

		@Parameters("browser")
		@BeforeClass
		public void setup(String br)
		{
			
		    logger =Logger.getLogger(BaseClass.class);
		    PropertyConfigurator.configure("log4j.properties");
			
		    
		    if(br.equals("chrome"))
		    {
		    	driver= new ChromeDriver();
		    }
		    else if(br.equals("firefox"))
		    {
		    	driver= new FirefoxDriver();
		    	
		    }
		    else if(br.equals("IE"))
		    {
		    	driver=new InternetExplorerDriver();
		    }
		    else if(br.equals("edge"))
		    {
		    	driver=new EdgeDriver();
		    }
		    
		    driver.get(baseURL);
		}
		
		@AfterClass
		public void teardown()
		{
			driver.quit();
		}

	}

