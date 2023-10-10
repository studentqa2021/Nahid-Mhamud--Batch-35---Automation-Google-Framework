package com.generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrowserSearchGeneric {

	public static WebDriver setupGoogleApplication() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		return driver;

	} 
	
	public static void getGoogleSearchPositive(WebDriver driver,SoftAssert sf) {

		WebElement search = driver.findElement(By.xpath("//*[@class='gLFyf']"));
		boolean status = search.isDisplayed();

		sf.assertTrue(status);

		search.click();
		search.sendKeys("iPhone 13");

		// Check Options
		List<WebElement> searchOptions = driver.findElements(By.xpath("//*[@class='wM6W7d']"));

		for(int i = 0; i<searchOptions.size(); i++) {
			System.out.println("Search Options ="+searchOptions.get(i).getText());
			sf.assertTrue(searchOptions.get(i).getText().contains("13"));
			// If else additional >> Alternate for Assertion
			if (searchOptions.get(i).getText().contains("13")) {
				System.out.println("Test pass");

			}else {
				System.out.println("Test fail");
			}	

		} 
	
	}
	
	public static void getGoogleSearchPositiveAction(WebDriver driver,SoftAssert sf) {

		WebElement search = driver.findElement(By.xpath("//*[@class='gLFyf']"));
		boolean status = search.isDisplayed();

		sf.assertTrue(status);

		search.click();
		search.sendKeys("iPhone 13");

	}	 

	public static void getGoogleSearchPositiveValidaton(WebDriver driver,SoftAssert sf) {

		// Check Options
		List<WebElement> searchOptions = driver.findElements(By.xpath("//*[@class='wM6W7d']"));

		for(int i = 0; i<searchOptions.size(); i++) {
			System.out.println("Search Options ="+searchOptions.get(i).getText());
			sf.assertTrue(searchOptions.get(i).getText().contains("13"));
			// If else additional >> Alternate for Assertion
			if (searchOptions.get(i).getText().contains("13")) {
				System.out.println("Test pass");

			}else {
				System.out.println("Test fail");
			}	

		}	 
	}


	public static void getGoogleSearchNegative(WebDriver driver,SoftAssert sf) {
		// Check Options
		List<WebElement> searchOptions = driver.findElements(By.xpath("//*[@class='wM6W7d']"));

		for(int i = 0; i<searchOptions.size(); i++) {
			System.out.println("Search Options ="+searchOptions.get(i).getText());
			sf.assertTrue(!searchOptions.get(i).getText().contains("14")
					||!searchOptions.get(i).getText().contains("12"));
			
			// If else additional >> Alternate for Assertion
			if (!searchOptions.get(i).getText().contains("14")
					||!searchOptions.get(i).getText().contains("12")) {
				System.out.println("Test pass");

			}else {
				System.out.println("Test fail");
			}

		}
	}
	
	
	
	
}
