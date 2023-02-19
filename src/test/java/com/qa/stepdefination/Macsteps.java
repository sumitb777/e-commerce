package com.qa.stepdefination;
import static org.junit.Assert.*;
import java.io.IOException;

import com.qa.base.Base;
import com.qa.pom.hom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Macsteps extends Base {
hom h;
	@Given("in chrome {string} website is open")
	public void in_chrome_website_is_open(String string) throws IOException {
	    initilization();
		driver.get(string);
	}

	@When("user click on macbook")
	public void user_click_on_macbook() {
	    h=new hom(driver);
	    h.mac();
	}

	@Then("user should land on macbook page")
	public void user_should_land_on_macbook_page() {
	   h.cart();
	}

	@Then("user should see success massage")
	public void user_should_see_success_massage() {
	   String text= h.alert().getText();
	assertEquals("Success: You have added",text);
	}

	
	
}
