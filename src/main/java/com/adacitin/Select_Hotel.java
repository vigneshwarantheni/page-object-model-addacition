package com.adacitin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public static WebDriver driver;
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement buton;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continuee;

	public Select_Hotel(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);


	}

	public WebElement getButon() {
		return buton;
	}

	public WebElement getContinuee() {
		return continuee;
	}
	
	
	
	

}
