package com.cucumber;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.generic.BrowserSearchGeneric;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StefDef {
	
	WebDriver driver;
	SoftAssert sf = new SoftAssert();
	
	
	@Before
	public void beforeAll() {
		
	}
	
	@After
	public void afterAll() {
		
	}
	
	
	@Given  ("Open a browser and go to google")
	public void setup() {
		driver = BrowserSearchGeneric.setupGoogleApplication();
		
	}
	
	@When ("search for iphone 13")
	public void action() {
		
		BrowserSearchGeneric.getGoogleSearchPositiveAction(driver, sf);
		
	}
	
	@Then ("iphone 13 should visible in search drop down")
	public void validation() {
		BrowserSearchGeneric.getGoogleSearchPositiveValidaton(driver, sf);
	  
	}

}
