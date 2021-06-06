package com.amazon.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPagesOpbjects {
	
	@FindBy(id = "newBuyBoxPrice")
	public WebElement newByPrice;
	
	@FindBy(id = "add-to-cart-button")
	public WebElement addToCartButton;
	
	public DetailsPagesOpbjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
