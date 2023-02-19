package com.qa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;

public class hom extends Base {
	WebDriver driver;
	//a[text()='MacBook']
	public  hom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='MacBook']")
	WebElement mac;
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement cart;
    @FindBy(xpath="//div[@id='product-product']//child::div")
    WebElement alert;
	public void mac () {
		this.mac.click();
	}
	
	public void cart() {
		this.cart.click();
		
	}
	public WebElement alert() {
		return alert;
		
	}

}
