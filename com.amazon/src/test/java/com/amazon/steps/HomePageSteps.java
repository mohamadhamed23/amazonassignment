package com.amazon.steps;

import com.amazon.page.object.HomePageObjects;
import com.amazon.utility.CommonMethods;

import io.cucumber.java.en.When;

public class HomePageSteps extends CommonMethods{
	
	@When("Search for Book {string}")
	public void search_for_book(String searchCriteria) {
		HomePageObjects homepage = new HomePageObjects(driver);
		sendTextValue(homepage.searchInput, searchCriteria);
	    clickElement(homepage.searchButton);
	}

}
