package com.amazon.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPageObjects {
	
	@FindBy(xpath = "//div[@id='huc-v2-order-row-center']//span[contains(@class,'price')]")
	public WebElement itemPriceInCart;
	
	@FindBy(xpath = "//div[@id='huc-v2-order-row-buttons']//a[@id='hlb-ptc-btn-native']")
	public WebElement proceedToCheckoutButton;
	
	public CartPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
