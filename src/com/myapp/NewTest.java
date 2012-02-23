package com.myapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void testApp1() {
	  System.out.println("Executing New Test 1");
  }
  
  @Test
  public void testApp2() {
	  System.out.println("Executing New Test 2");
  }
  
  @Test
  public void testApp3() {
	  System.out.println("Executing New Test 3");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite");
  }

}
