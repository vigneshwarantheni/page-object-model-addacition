package com.adacitin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_details {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement card_details;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement card_type;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expiry_month;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expiry_year;
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement booknow;

	public Personal_details(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCard_details() {
		return card_details;
	}

	public WebElement getCard_type() {
		return card_type;
	}

	public WebElement getExpiry_month() {
		return expiry_month;
	}

	public WebElement getExpiry_year() {
		return expiry_year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}
	
	
	
	
	
	
	

}
