package com.BritishAirways.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_Launching_Test_001 extends BaseClass {
	@Test
	public void LoginTest(){ 
		

	if(driver.getTitle().equals("British Airways | Book Flights, Holidays, City Breaks & Check In Online"))
	{
        Assert.assertTrue(true);
		logger.info("Successfully launched");

	}

	else
	{
		Assert.assertTrue(false);
		logger.info("Error .......!!!");


	}
}
}