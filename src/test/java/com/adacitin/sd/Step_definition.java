package com.adacitin.sd;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.adacitin.Adacition_Loginpage;
import com.adacitin.Basepage;
import com.adacitin.Booked_hotel;
import com.adacitin.Hotel_conform;
import com.adacitin.Personal_details;
import com.adacitin.Search_Hotel;
import com.adacitin.Select_Hotel;
import com.adacitin.runner.Runner_class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_definition extends Basepage {
	
	public static WebDriver driver=Runner_class.driver;
	
	Adacition_Loginpage login=new Adacition_Loginpage(driver);
	
	@Given("user navigate to the login page")
	public void user_navigate_to_the_login_page() {
		maxi(driver);
		get(driver ,"https://adactinhotelapp.com/index.php");

	}
	@When("enter username and password")
	public void enter_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		
		 List<Map<String,String>> keyValuePair=dataTable.asMaps(String.class,String.class);
         String username= keyValuePair.get(0).get("Username");
        String password= keyValuePair.get(0).get("Password");
        
        sendkeys(login.getUsername(), username);
		sendkeys(login.getPassword(), password);
		
		
	}
	@Then("user enter the login button")
	public void user_enter_the_login_button() {
		click(login.getLogin());

	}
	
	
	Search_Hotel  sh=new Search_Hotel (driver);
	
	@Given("user select the location")
	public void user_select_the_location() {
		DropDown_value(sh.getLocation(), "Sydney");
	}
	@When("user select hotel")
	public void user_select_hotel() {
		
		DropDown_visibletxt(sh.getHotels(), "Hotel Cornice");
	}
	@When("user select room type")
	public void user_select_room_type() {
		DropDown_index(sh.getRoomtype(), 2);
		
	}
	@When("user select noof room")
	public void user_select_noof_room() {
		DropDown_value(sh.getRoom(), "3");
	
	}
	@When("fill the check in date")
	public void fill_the_check_in_date() {
		clear(sh.getCheckin());
		sendkeys(sh.getCheckin(), "30/04/2023");
	
	}
	    
	@When("fill the check out date")
	public void fill_the_check_out_date() {
		clear(sh.getChechout());
		sendkeys(sh.getChechout(), "10/05/2023");
	}
	@When("given details about members")
	public void given_details_about_members() {
		DropDown_index(sh.getAdults(), 3);
		DropDown_index(sh.getChild(), 2);
		
	}
	    
	@When("user enter submit button")
	public void user_enter_submit_button() {
		click(sh.getSubmit());
	    
	}
	@Then("user get hotel details")
	public void user_get_hotel_details() {
		System.out.println("user sucessfully fill the data");
	    
	}
	Select_Hotel shh=new Select_Hotel(driver);

	@Given("user click selected hotel")
	public void user_click_selected_hotel() {
		click(shh.getButon());
		
	    
	}
	@Then("user navigate to next page")
	public void user_navigate_to_next_page() {
		click(shh.getContinuee());
		
	}
	
	Personal_details pd=new Personal_details(driver);

@Given("enter the first name")
public void enter_the_first_name() {
	sendkeys(pd.getFirstname(), "vignesh");   
}
@When("user select the last name")
public void user_select_the_last_name() {
	sendkeys(pd.getLastname(), "s");
 
}
@When("user fillup the billing address")
public void user_fillup_the_billing_address() {
	sendkeys(pd.getAddress(), "33,poosari muthu pillai street,kuchanur.");
    
}
@When("user enter the cridit card number")
public void user_enter_the_cridit_card_number() {
	sendkeys(pd.getCard_details(), "59862475315698425");
    
}
@When("user select the card type")
public void user_select_the_card_type() {
	 DropDown_visibletxt(pd.getCard_type(), "VISA");
    
}
@When("user Select the month of expiry")
public void user_select_the_month_of_expiry() {
	DropDown_value(pd.getExpiry_month(), "10");
   
}
@When("user select the year of expiry")
public void user_select_the_year_of_expiry() {
	
	DropDown_visibletxt(pd.getExpiry_year(), "2022");
	
}
@When("user given cvv number")
public void user_given_cvv_number() {
	sendkeys(pd.getCvv(), "455");    
}
@Then("user click book now and navigate to next page")
public void user_click_book_now_and_navigate_to_next_page() {
	click(pd.getBooknow());
}

Hotel_conform Hc=new Hotel_conform(driver);

@Given("user check hotel details")
public void user_check_hotel_details() {
	System.out.println("user check details of hotel and price");
   
}
@Then("user click booked itnerary")
public void user_click_booked_itnerary() {
	click(Hc.getItineray());
  
}


Booked_hotel bh=new Booked_hotel(driver);

@Given("user click the hotel from the list")
public void user_click_the_hotel_from_the_list() {
	click(bh.getButtonclick());
   
}
@When("user cancel the hotel")
public void user_cancel_the_hotel() {
	click(bh.getCancelall());
	alert_accept(driver);
	click(bh.getLogout());
    
}
@Then("user take screenshot")
public void user_take_screenshot() {
	screenshot(driver, "C:\\Users\\USER\\eclipse-workspace\\Maven_demo\\screenshot\\ad1.png");
  
}

}
