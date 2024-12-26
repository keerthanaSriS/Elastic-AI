package org.level;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends Baseclass {

	public PojoClass() {
		PageFactory.initElements(driver, this);
	}

//	WebElement txtUser = driver.findElement(By.id("email"));

	@FindBy(xpath = "//input[@type='search']")
	private WebElement txtUser;

//	WebElement txtPass = driver.findElement(By.id("pass"));	

	@FindBy(xpath = "//table[@id='example']//tbody//tr[@role='row']")
	private List<WebElement> txtPass;

	public List<WebElement> getTxtPass2() {
		return txtPass2;
	}

	public void setTxtPass2(List<WebElement> txtPass2) {
		this.txtPass2 = txtPass2;
	}

	@FindBy(xpath = "//table[@id='example']//tbody//tr")
	private List<WebElement> txtPass2;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public List<WebElement> getTxtPass() {
		return txtPass;
	}

}
