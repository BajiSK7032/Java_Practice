package Selenium_Practice;

import org.testng.annotations.*;

public class TestNG_Sample {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}

	@Test

	public void SampleTest() {
		System.out.println("Sample Test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}

}
