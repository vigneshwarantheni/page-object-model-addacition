package com.adacitin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_conform {
	public static WebDriver driver;
	@FindBy(xpath = "//a[normalize-space()='Booked Itinerary']")
	private WebElement itineray;

	public Hotel_conform(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getItineray() {
		return itineray;
	}

}
