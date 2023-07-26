package com.adacitin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_hotel {
public static WebDriver driver;
	
	
	@FindBy(xpath = "//input[@id='check_all']")
private WebElement buttonclick;
	
	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement cancelall;
	
	@FindBy(id = "logout")
	private WebElement logout;

	public Booked_hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getButtonclick() {
		return buttonclick;
	}

	public WebElement getCancelall() {
		return cancelall;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	

}

