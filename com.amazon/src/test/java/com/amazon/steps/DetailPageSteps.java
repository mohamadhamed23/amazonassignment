package com.amazon.steps;

import com.amazon.page.object.DetailsPagesOpbjects;
import com.amazon.utility.CommonMethods;
import com.amazon.utility.GlobalData;

import io.cucumber.java.en.Then;

public class DetailPageSteps extends CommonMethods{
	
	@Then("Validate Item price in Item detail Page")
	public void validate_item_price_in_item_detail_page() {
		DetailsPagesOpbjects detailPageObjects = new DetailsPagesOpbjects(driver);
		
	    String actualPrice = getTextValue(detailPageObjects.newByPrice);
	    validatingTexts(GlobalData.getItemBasePrice(), actualPrice);
	}
	
	@Then("Click on Add to Cart")
	public void click_on_add_to_cart() {
		DetailsPagesOpbjects detailPageObjects = new DetailsPagesOpbjects(driver);
		clickElement(detailPageObjects.addToCartButton);
	}

}
