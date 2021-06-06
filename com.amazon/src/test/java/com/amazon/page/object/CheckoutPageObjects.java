package com.amazon.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPageObjects {
	
	@FindBy(xpath = "//*[contains(text(),'Order Summary')]/following-sibling::table/tbody/tr[1]/td[2]")
	public WebElement priceInCheckout;
	
	public CheckoutPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
