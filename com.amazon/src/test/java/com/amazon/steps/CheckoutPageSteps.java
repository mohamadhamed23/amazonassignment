package com.amazon.steps;

import com.amazon.page.object.CheckoutPageObjects;
import com.amazon.utility.CommonMethods;
import com.amazon.utility.GlobalData;

import io.cucumber.java.en.Then;

public class CheckoutPageSteps extends CommonMethods{
	
	@Then("Validate Item price in proceed checkout page")
	public void validate_item_price_in_proceed_checkout_page() {
	   CheckoutPageObjects checkoutPage = new CheckoutPageObjects(driver);
	   String priceInCheckoutActual = getTextValue(checkoutPage.priceInCheckout);
	   
	   validatingTexts(GlobalData.getItemBasePrice(), priceInCheckoutActual);
	}

}
