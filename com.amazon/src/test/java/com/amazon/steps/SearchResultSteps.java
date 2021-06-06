package com.amazon.steps;

import org.openqa.selenium.By;

import com.amazon.page.object.SearchPageObjects;
import com.amazon.utility.CommonMethods;
import com.amazon.utility.GlobalData;

import io.cucumber.java.en.When;

public class SearchResultSteps extends CommonMethods{
	
	@When("Store item price as expected result")
	public void store_item_price_as_expected_result() {
		SearchPageObjects searchPage = new SearchPageObjects(driver);
	    String itemBasePrice = getTextValue(searchPage.itemBasePrice);
	   GlobalData.setItemBasePrice(itemBasePrice);
	}
	
	@When("Click on first item in the listed results")
	public void click_on_first_item_in_the_listed_results() {
		SearchPageObjects searchPage = new SearchPageObjects(driver);
		clickElement(searchPage.firstItemName);
	}

	
}
