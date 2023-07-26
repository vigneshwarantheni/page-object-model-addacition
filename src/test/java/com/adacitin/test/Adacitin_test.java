package com.adacitin.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.adacitin.Adacition_Loginpage;
import com.adacitin.Basepage;
import com.adacitin.Booked_hotel;
import com.adacitin.Hotel_conform;
import com.adacitin.Personal_details;
import com.adacitin.Search_Hotel;
import com.adacitin.Select_Hotel;

public class Adacitin_test  extends Basepage{

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		
		maxi(driver);
		
		get(driver ,"https://adactinhotelapp.com/index.php");
		
		
		Adacition_Loginpage login=new Adacition_Loginpage(driver);
		sendkeys(login.getUsername(), "HDeepika");
		sendkeys(login.getPassword(), "Mine#143");
		click(login.getLogin());
		
		
		Search_Hotel  sh=new Search_Hotel (driver);
		DropDown_value(sh.getLocation(), "Sydney");
		DropDown_visibletxt(sh.getHotels(), "Hotel Cornice");
		DropDown_index(sh.getRoomtype(), 2);
		DropDown_value(sh.getRoom(), "3");
		clear(sh.getCheckin());
		sendkeys(sh.getCheckin(), "30/04/2023");
		clear(sh.getChechout());
		sendkeys(sh.getChechout(), "10/05/2023");
		DropDown_index(sh.getAdults(), 3);
		DropDown_index(sh.getChild(), 2);
		click(sh.getSubmit());
		
		Select_Hotel shh=new Select_Hotel(driver);
		
		click(shh.getButon());
		click(shh.getContinuee());
		
		Personal_details pd=new Personal_details(driver);
		sendkeys(pd.getFirstname(), "vignesh");
		sendkeys(pd.getLastname(), "s");
		sendkeys(pd.getAddress(), "33,poosari muthu pillai street,kuchanur.");
		sendkeys(pd.getCard_details(), "59862475315698425");
	    DropDown_visibletxt(pd.getCard_type(), "VISA");
		DropDown_value(pd.getExpiry_month(), "10");
		DropDown_visibletxt(pd.getExpiry_year(), "2022");
		sendkeys(pd.getCvv(), "455");
		click(pd.getBooknow());
		
		Thread.sleep(3000);
		
		Hotel_conform Hc=new Hotel_conform(driver);
		
		click(Hc.getItineray());
		
		
		Booked_hotel bh=new Booked_hotel(driver);
		
		click(bh.getButtonclick());
		click(bh.getCancelall());
		alert_accept(driver);
		click(bh.getLogout());
		
		
		screenshot(driver, "C:\\Users\\USER\\eclipse-workspace\\Maven_demo\\screenshot\\ad.png");
		
		
		
		
		

	}

}
