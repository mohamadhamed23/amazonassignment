
package com.amazon.steps;

import com.amazon.utility.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonSteps extends CommonMethods{
	
	@Given("Setup up browser {string}")
	public void setup_up_browser(String browser) {
	   initialDriver(browser);
	}

	@When("Navigate to website {string}")
	public void navigate_to_website(String url) {
	    navigateto(url);
	}

}
