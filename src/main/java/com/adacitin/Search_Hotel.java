package com.adacitin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement Hotels;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement room;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement checkin;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement chechout;
	
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adults;
	
	
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement child;
	
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement submit;

	public Search_Hotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getChechout() {
		return chechout;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	

}
