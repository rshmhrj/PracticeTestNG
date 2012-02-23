package com.myapp;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {

	@BeforeTest
	public void openBrowser()
	{
		System.out.println("Opening Browser");
		throw new SkipException("Skipping test because of XYZ reason.");
	}
	
	@Test
	public void testLandingPage()
	{
		System.out.println("Landing page test.");
	}
	
	@AfterTest
	public void closingBrowser()
	{
		System.out.println("Closing Browser");
	}
	
}
