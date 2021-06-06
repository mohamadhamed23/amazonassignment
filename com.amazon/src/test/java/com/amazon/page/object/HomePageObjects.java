package com.amazon.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	
	@FindBy(id = "twotabsearchtextbox")
	public WebElement searchInput;
	@FindBy(id = "nav-search-submit-button")
	public WebElement searchButton;
	
	public HomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
