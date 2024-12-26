package org.level;

import static org.level.Baseclass.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public static WebDriver driver;

	public static void chromeBrowser() {
		driver = new ChromeDriver();

	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void browserTitle() {

		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void browserUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void sendValue(WebElement element, String value) {
		element.sendKeys(value);
	}

}
