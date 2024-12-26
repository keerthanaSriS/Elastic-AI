package org.test;

import java.util.List;

import org.level.Baseclass;
import org.level.PojoClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Browser extends Baseclass {

	@Test
	private void setUp() {
		chromeBrowser();

		maxWindow();

		getUrl("https://www.lambdatest.com/selenium-playground/table-sort-search-demo");

	}

	@Test
	public void validateTableSearchResults() {
		// Locate the search box and search for "New York"
		PojoClass p = new PojoClass();

		WebElement txtUser = p.getTxtUser();
		sendValue(txtUser, "New York");

		// Locate the table rows that are displayed after filtering

		List<WebElement> txtPass = p.getTxtPass();

		// Validate the number of filtered rows
		// Expected number of entries
		int displayedRowCount = txtPass.size();
		int expectedRowCount = 5;

		Assert.assertEquals(displayedRowCount, expectedRowCount, "The number of search results is 5 correct.");

		System.out.println("5 entries out of 24 total entries");

	}

}
