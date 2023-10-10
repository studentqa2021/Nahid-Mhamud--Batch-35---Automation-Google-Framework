package com.regression;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert; 
import com.generic.BrowserSearchGeneric;

public class GoogleSearch {

	WebDriver driver;
	SoftAssert sf = new SoftAssert();
	@Test(priority = 0,groups = {"Smoke"})
	
	public void Setup() {
		driver = BrowserSearchGeneric.setupGoogleApplication();

	}
	@Test (priority =1, description = "OB 11: Positive Scenario",
			groups = {"Smoke"})
	public void test1() {
		BrowserSearchGeneric.getGoogleSearchPositive(driver,sf);
		
	}
	
	@Test(priority = 2, dependsOnMethods = "test1",
			description = "OB 12: Negative Scenario",groups ={"Smoke"})
	public void test2() {
		BrowserSearchGeneric.getGoogleSearchNegative(driver, sf);
		
	}
	
	@Test (priority = 3,groups ={"Smoke"})
	public void tearDown() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
		driver.quit();

	}

}
