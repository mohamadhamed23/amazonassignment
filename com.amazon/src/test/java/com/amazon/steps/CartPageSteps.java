package com.amazon.steps;

import com.amazon.page.object.CartPageObjects;
import com.amazon.utility.CommonMethods;
import com.amazon.utility.GlobalData;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPageSteps extends CommonMethods{
	
	@Then("Validate Item price in cart page")
	public void validate_item_price_in_cart_page() {
		CartPageObjects cartPage = new CartPageObjects(driver);
		String cartPageItemPriceActual = getTextValue(cartPage.itemPriceInCart);
	    validatingTexts(GlobalData.getItemBasePrice(), cartPageItemPriceActual);
	}
	
	@When("Click on proceed to checkout")
	public void click_on_proceed_to_checkout() {
		CartPageObjects cartPage = new CartPageObjects(driver);
		clickElement(cartPage.proceedToCheckoutButton);
	}

}
